package main.model;

public class Variable {

    private String name;
    private String type;
    private Object value;
    private String scope;
    private boolean isAssignment = false;

    public Variable(String name, String scope) {
        this.name = name;
        this.type = "Object";
        this.scope = scope;
    }

    public boolean isAssignment() {
        return isAssignment;
    }

    public void setAssignment(boolean assignment) {
        this.isAssignment = assignment;
    }

    public String getScope() {
        return scope;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public void setType(String type) {
        if (type.equals("String")) this.type = "String";
        else if (type.equals("Integer")) this.type = "Integer";
    }
}
