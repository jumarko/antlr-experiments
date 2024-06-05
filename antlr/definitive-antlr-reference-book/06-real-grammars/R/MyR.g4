// My attempt for a simplified R language grammar
// See examples: https://github.com/kiat/R-Examples
grammar MyR ;

file : (var_declaration | expr)+ ;

var_declaration : ID ASSIGNMENT expr ;
expr : function_call ;
function_call : ID OPEN_PAREN ~CLOSING_PAREN+? CLOSING_PAREN ;

ASSIGNMENT : '<-' ;
ID : [a-zA-Z] [0-9a-zA-Z.]+ ;
WHITESPACE : [ \t\r\n]+ -> skip ;
OPEN_PAREN : '(' ;
CLOSING_PAREN : ')' ;
COMMENT : '#' ~[\r\n]* -> skip ;

ANY_CHAR : .; // Put this lexer rule last to give it the lowest precedence
