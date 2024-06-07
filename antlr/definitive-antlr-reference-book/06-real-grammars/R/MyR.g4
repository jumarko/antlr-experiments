// My attempt for a simplified R language grammar
// See examples: https://github.com/kiat/R-Examples
grammar MyR ;

file : (var_declaration | expr)+ ;

var_declaration : ID ASSIGNMENT expr ;
expr : function_call
    | expr '*' expr
    | expr '/' expr
    | expr '+' expr
    | expr '-' expr
    | NUMBER
;
function_call : ID OPEN_PAREN param? (',' param)* CLOSING_PAREN ;
param : var_declaration | expr ;

ASSIGNMENT : '<-' ;
NUMBER: INT | INT '.' [0-9]+ ;
INT: [1-9] [0-9]* ;
ID : [a-zA-Z] [0-9a-zA-Z.]+ ;
WHITESPACE : [ \t\r\n]+ -> skip ;
OPEN_PAREN : '(' ;
CLOSING_PAREN : ')' ;
COMMENT : '#' ~[\r\n]* -> skip ;

ANY_CHAR : .; // Put this lexer rule last to give it the lowest precedence
