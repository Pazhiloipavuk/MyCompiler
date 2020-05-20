package main.handler;

import main.model.Variable;

import java.io.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Handler {

    private File resultFile;
    private StringBuilder buffer;
    private String variableDeclarationInFor;

    public String scope = "mainFunction";

    public boolean isDeclarationInFor = false;

    public HashMap<String, Variable> variables = new HashMap<>();

    public HashMap<String, String> functions = new HashMap<>();

    public void addVariable(Variable variable) {
        variables.put(variable.getName(), variable);
    }

    public void addFunction(String name, String type)  {
        functions.put(name, type);
    }

    public String getTypeOfFunction(String name) {
        return functions.get(name);
    }

    public Variable getVariable(String name) {
        return variables.get(name);
    }

    public void writeDeclaration(String scope) {
        StringBuilder builder = new StringBuilder();
        LinkedList<Variable> listOfVars = findDeclarations(scope);
        for (Variable variable : listOfVars) {
            String typeInJava;
            switch (variable.getType()) {
                case "String":
                    typeInJava = "String";
                    break;
                case "Integer":
                    typeInJava = "int";
                    break;
                default:
                    typeInJava = "Object";
                    break;
            }
            builder.append(typeInJava).append(" ").append(variable.getName()).append(" = ").append(variable.getValue()).append(";");
        }
        if (isDeclarationInFor) {
            variableDeclarationInFor = builder.toString();
            isDeclarationInFor = false;
        } else {
            writeInFunction(scope, (builder.insert(0, "\n")).toString());
        }
    }

    public void writeAssigment(String scope, String name, String cast) {
        StringBuilder builder = new StringBuilder();
        LinkedList<Variable> listOfVars = findAssignments(scope, name);
        for (Variable variable : listOfVars) {
            if (cast != null) {
                switch (cast) {
                    case "String":
                        builder.append(variable.getName()).append(" = ").append("Integer.toString(").append(variable.getValue()).append(")").append(";");
                        break;
                    case "Integer":
                        builder.append(variable.getName()).append(" = ").append("Integer.parseInt(").append(variable.getValue()).append(")").append(";");
                        break;
                }
            }
            else {
                builder.append(variable.getName()).append(" = ").append(variable.getValue()).append(";");
            }
        }
        writeInFunction(scope, (builder.insert(0, "\n")).toString());
    }

    public String createIntExpression(String sign, String value){
        return sign + " " + value;
    }

    public String createStringExpression(String sign, String firstValue, String secondValue) {
        String expression = "";
        switch (sign) {
            case "+":
                expression = " + " + secondValue;
                break;
            case "-":
                expression = ".replaceFirst(" + firstValue + ", " + secondValue + ")";
                break;
            case "*":
                expression = ".concat(" + secondValue + ")";
                break;
            case "/":
                expression = ".replace(" + firstValue + ", " + secondValue + ")";
                break;
        }
        return expression;
    }

    public String createCharExpression() {
        return "TODO";
    }

    private LinkedList<Variable> findDeclarations(String scope) {
        LinkedList<Variable> list = new LinkedList<>();
        HashMap<String, Variable> vars = variables;
        for (Map.Entry<String, Variable> entry : vars.entrySet()) {
            if (entry.getValue().getScope().equals(scope) && !entry.getValue().isAssignment()) {
                list.add(entry.getValue());
                entry.getValue().setAssignment(true);
            }
        }
        return list;
    }

    private LinkedList<Variable> findAssignments(String scope, String name) {
        LinkedList<Variable> list = new LinkedList<>();
        HashMap<String, Variable> vars = variables;
        for (Map.Entry<String, Variable> entry : vars.entrySet()) {
            if (entry.getKey().equals(name) && entry.getValue().getScope().equals(scope) && entry.getValue().isAssignment()) {
                list.add(entry.getValue());
            }
        }
        return list;
    }

    public void createIfHeader(String firstArg, String secondArg, String sign, String scope) {
        writeInFunction(scope, "if (" + firstArg + sign + secondArg + ") {\n");
    }

    public void createElseHeader() {
        writeInFunction(scope, "else {\n");
    }

    public void createRelationBody(String body, String scope) {
        writeInFunction(scope, body);
    }

    public void closeRelation(String scope) {
        writeInFunction(scope, "\n}\n");
    }

    public void createForHeader(String firstArg, String secondArg, String sign, String thirdArg, String scope) {
        writeInFunction(scope, "for (" + variableDeclarationInFor + " " + firstArg + " " + sign + " " + secondArg + "; " + thirdArg + ") {\n");
    }

    public void createWhileHeader(String firstArg, String secondArg, String sign, String scope) {
        writeInFunction(scope, "while (" + firstArg + sign + secondArg + ") {\n");
    }

    public void createFunctionHeader(String type, String name, String params) {
        params = params.replace("Integer", "int");
        String typeInJava;
        switch (type) {
            case "Integer":
                typeInJava = "int";
                break;
            case "String":
                typeInJava = "String";
                break;
            case "Unit":
                typeInJava = "void";
                break;
            default:
                typeInJava = "Object";
                break;
        }
        writeInBuffer("public static " + typeInJava + " " + name + " (" + params + ") {\n");
    }

    public void closeFunction(String expression){
        if (expression.isEmpty()) {
            writeInBuffer("}\n\n");
        } else {
            writeInBuffer("return " + expression + ";\n}\n\n");
        }
    }

    public void createFunctionCall(String name, String params) {
        writeInFile(name + "(" + params + ");");
    }

    private void writeInFile(String str) {
        try {
            FileWriter writer = new FileWriter(resultFile, true);
            writer.write(str + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeInBuffer(String str) {
        buffer.append(str);
    }

    public void createResultFile(String fileName) {
        try {
            resultFile = new File("D:/MyCompiler/src/result/" + fileName + ".java");
            if (!resultFile.createNewFile()) cleanFile(resultFile);
            buffer = new StringBuilder();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        writeInFile("package result;\n\n");
        writeInFile("public class " + fileName + " {");
        writeInFile("public static void main(String[] args) {");
    }

    private void writeInFunction(String scope, String s) {
        if (scope.equals("mainFunction")) {
            writeInFile(s);
        } else {
            writeInBuffer(s);
        }
    }

    public void closeFile() {
        writeInFile("}");

        writeInFile(buffer.toString());

        writeInFile("}");
    }

    private void cleanFile(File file) {
        try {
            FileWriter writer = new FileWriter(file);
            writer.write("");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void print(String scope, String expression) {
        writeInFunction(scope, "System.out.println(" + expression + ");");
    }
}
