/** Grammar for graphivz DOT language
  * See language reference: https://www.graphviz.org/doc/info/lang.html
  * The main difference from the official gramar is `port` rule definition.
  */
grammar Dot;

// parser rules
graph : STRICT? (GRAPH | DIGRAPH) id? '{' stmt_list '}' ;
stmt_list : (stmt ';'? )* ;
stmt : node_stmt
     | edge_stmt
     | attr_stmt
     | id '=' id
     | subgraph ;

node_stmt : node_id attr_list? ;
node_id : id port?;
// note that this is different from the oficial grammar -> we don't really need to define
// separate `compass_pt` because it can be any valid id (not just 'n', 'ne', etc.)
port : ':' id ( ':' id)? ;

edge_stmt : (node_id | subgraph) edgeRHS attr_list? ;
// note that '->' should be used for directed graphs while '--' for undirected graphs
// => application should validate that
edgeRHS : (edgeop (node_id | subgraph))+;
edgeop : '->' | '--';
subgraph :  (SUBGRAPH id?)? '{' stmt_list '}' ;

attr_stmt : (GRAPH | NODE | EDGE) attr_list;
attr_list : ( '[' a_list? ']' )+ ;
a_list : (id '=' id (';' | ',')?)+ ;

id : ID | STRING | HTML_STRING | NUMBER ;

// lexer rules
STRICT : [sS] [tT] [rR] [iI] [cC] [tT] ;
DIGRAPH : [dD] [iI] GRAPH ;
GRAPH : [gG] [rR] [aA] [pP] [hH] ;
SUBGRAPH : [sS] [uU] [bB] GRAPH ;

NODE : [nN] [oO] [dD] [eE] ;
EDGE : [eE] [dD] [gG] [eE] ;

// not that the grammar from the book doesn't deal with leading underscore!
ID : LETTER (LETTER | DIGIT)* ;
LETTER : [a-zA-Z\u0080-\u00FF_] ;
DIGIT : [0-9] ;

NUMBER : '-'? ('.' DIGIT+ | DIGIT+ ('.' DIGIT+)? ) ;
HTML_STRING: '<' (TAG | ~[<>])* '>' ;
fragment TAG : '<' .*? '>' ;
STRING : '"' ('\\"' | .)*? '"' ;

WHITESPACE : [ \t\n\r]+ -> skip ;
COMMNETS : '//' ~[\n\r]* -> skip ;