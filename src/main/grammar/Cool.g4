grammar Cool;

options {
    language = Java;
    }

@header {
    import main.handler.Handler;
    import main.model.Variable;
    }

@members {
    private Handler handler = new Handler();
    }

program
    :   PROGRAM name {handler.createResultFile($name.text);} WS*

        '{' WS*

            (function)*

            FUNCTION UNIT_NAME MAIN '()''{'
            (declaration
            | assigment
            | expression
            | statement
            | functionCall
            | print)* WS*
            '}'

        '}' {handler.closeFile();}
    ;

declaration
    : WS* VAR name          {handler.addVariable(new Variable($name.text, handler.scope));}
    ' = ' ( value ';'       {handler.getVariable($name.text).setValue($value.val);
                             handler.getVariable($name.text).setType($value.type);}
          | expression ';'  {handler.getVariable($name.text).setValue($expression.val);
                             handler.getVariable($name.text).setType($expression.type);}
          | functionCall    {handler.getVariable($name.text).setValue($functionCall.val);
                             handler.getVariable($name.text).setType($functionCall.type);}
          | length ';'      {handler.getVariable($name.text).setValue($length.val);
                             handler.getVariable($name.text).setType("Integer");}
          ) WS*             {handler.writeDeclaration(handler.scope);}
    ;

assigment
    : WS* name
    ' = ' ('('typeVariable')')?
          ( value ';'       {handler.getVariable($name.text).setValue($value.val);}
          | expression ';'  {handler.getVariable($name.text).setValue($expression.val);}
          | functionCall    {handler.getVariable($name.text).setValue($functionCall.val);}
          | length ';'      {handler.getVariable($name.text).setValue($length.val);}
          ) WS*             {handler.writeAssigment(handler.scope, $name.text, $typeVariable.text);}
   ;

typeVariable
    : ( INTEGER_NAME
      | STRING_NAME
      )
    ;

typeFunction
    : ( INTEGER_NAME
      | STRING_NAME
      | UNIT_NAME
      )
    ;

name
    : STRING
    ;

value returns[String val, String type]
    :
    ( '"'WS* STRING WS*'"'    {$val = "\"" + $STRING.text + "\""; $type = "String";}
    | STRING                  {$val = $STRING.text; $type = "String";}
    | INTEGER                 {$val = $INTEGER.text; $type = "Integer";}
    | '"'WS* INTEGER WS*'"'   {$val = "\"" + $INTEGER.text + "\""; $type = "String";}
    | CHARACTER               {$val = $CHARACTER.text; $type = "Character";}
    )
    ;

expression returns[String val, String type]
    : WS* s1=value WS* {$val = $s1.text; $type = $s1.type;}
      (SYMB WS* (s2=value)* WS* {
                                        if ($s2.text!=null) {
                                            if ($s1.type.equals("String")){
                                                $val = $val + handler.createStringExpression($SYMB.text, $val, $s2.text);
                                            } else if ($s1.type.equals("Integer")) {
                                                $val = $val + handler.createIntExpression($SYMB.text, $s2.text);
                                            } else if ($s1.type.equals("Character")) {
                                                $val = $val + handler.createCharExpression();
                                            }
                                        } else {
                                            $val = $val + " " + $SYMB.text;
                                        }
                                      }
    )*
    ;

relation returns[String firstVal, String secondVal, String sign]
	:	WS* value {$firstVal = $value.val;} WS*
	(
	( '==' {$sign="==";}
	| '!=' {$sign="!=";}
	| '<'  {$sign="<";}
	| '<=' {$sign="<=";}
	| '>'  {$sign=">";}
	| '>=' {$sign=">=";}
	) WS*
	( length {$secondVal= $length.val;}
	| value {$secondVal = $value.val;}
	) WS*
	)*
	;

statement
    :   ifStatement
    |   whileStatement
    |   forStatement
    ;

ifStatement
    : IF '('relation {handler.createIfHeader($relation.firstVal, $relation.secondVal, $relation.sign, handler.scope);}')' '{'
          (declaration
          | assigment
          | expression WS* {handler.createRelationBody($expression.val, handler.scope);}
          | functionCall
          | statement
          | print
           )* WS* '}' {handler.closeRelation(handler.scope);}
          (ELSE  WS* '{' {handler.createElseHeader();}
          ( declaration
          | assigment
          | expression WS* {handler.createRelationBody($expression.val + ";", handler.scope);}
          | functionCall
          | statement
          | print
          )*
           WS*
          '}' {handler.closeRelation(handler.scope);})* WS*  WS*
          ;

whileStatement
    :   WHILE WS* '(' WS* relation WS* ')'
        {handler.createWhileHeader($relation.firstVal, $relation.secondVal, $relation.sign, handler.scope);} WS*
        '{'(WS*
           declaration
         | assigment
         | expression WS* {handler.createRelationBody($expression.val + ";", handler.scope);}
         | functionCall
         | statement
         | print
         WS*  )* WS*
        '}' WS* {handler.closeRelation(handler.scope);}
    ;

forStatement
    :   FOR WS* '(' WS* {handler.isDeclarationInFor = true;} declaration WS* relation WS* ';' WS* expression WS* ')' '{'
        {handler.createForHeader($relation.firstVal, $relation.secondVal, $relation.sign, $expression.val, handler.scope);}
        (WS*
           declaration
         | assigment
         | expression {handler.createRelationBody($expression.val + ";", handler.scope);} WS*
         | functionCall
         | statement
         | print
         WS* )* WS*
        '}' WS* {handler.closeRelation(handler.scope);}
    ;

function returns[String val]
    :FUNCTION typeFunction name {handler.scope = $name.text; handler.addFunction($name.text, $typeFunction.text);}
    WS* '('parameters?')' {handler.createFunctionHeader($typeFunction.text, $name.text, $parameters.val);} WS* '{'
         ( declaration
         | assigment
         | expression WS* {handler.createRelationBody($expression.val + ";", handler.scope);} WS*
         | functionCall
         | statement
         | print
         )* WS*
        ( RETURN expression {handler.closeFunction($expression.val);} WS* ';'
        | RETURN {handler.closeFunction("");} WS* ';'
        )
        '}'  {handler.scope = "mainFunction";} WS*
    ;

functionCall returns[String val, String type]
    : WS* name WS* '(' parameters? ')' WS* ';' {handler.createFunctionCall($name.text, $parameters.val);
                                                $type = handler.getTypeOfFunction($name.text);
                                                $val=$name.text + "(" +  $parameters.val + ")";}
    ;

parameters returns[String val]
    :	firstParameter=parameter {$val = $firstParameter.val;}
    (',' nextParameter=parameter {$val = $val + ", "+ $nextParameter.val;})*
    ;

parameter returns[String val]
    :	(typeVariable WS* {$val = $typeVariable.text + " ";})* name { if($val ==null) {
                                                                      $val = $name.text;
                                                                      } else $val = $val + $name.text;}
    ;

print
    : PRINT WS* '(' WS* expression WS* ')' ';' {handler.print(handler.scope, $expression.val);}
    ;

length returns[String val]
    : LENGTH WS* '(' WS* expression WS* ')' {$val=$expression.val + ".length()";}
    ;

PROGRAM : 'Program';
MAIN : 'main';
INTEGER_NAME : 'Integer';
STRING_NAME : 'String';
UNIT_NAME : 'Unit';
VAR : 'var';
PRINT : 'print';
LENGTH : 'length';
RETURN : 'return';
FUNCTION : 'function';
FOR : 'for';
WHILE : 'while';
IF : 'if';
ELSE : 'else';

SYMB :('+' | '-' | '/' | '*' | '=' | '+=' | '-=' | '++' | '--');
STRING : ([a-z] | [A-Z])+;
CHARACTER : ([a-z] | [A-Z]);
INTEGER : [0-9]+;
WORD : 'a'..'z'+;
WS : [ \t\r\n]+ -> skip;