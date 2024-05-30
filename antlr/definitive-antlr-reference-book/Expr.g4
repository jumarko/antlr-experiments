grammar Expr;

prog: stat+ ;

stat: expr NEWLINE
    | ID '=' expr NEWLINE
    | NEWLINE
    ;

// TODO juraj: why do we distinguish between multiplication/division and addition/subtraction
expr: expr ('*'|'/') expr
    | expr ('+'|'/') expr
    | INT
    | ID
    | '(' expr ')'
    ;

ID: [a-zA-Z]+ ;
INT: [0-9]+ ;
NEWLINE : '\r'? '\n' ;
WS : [ \t]+ -> skip;

