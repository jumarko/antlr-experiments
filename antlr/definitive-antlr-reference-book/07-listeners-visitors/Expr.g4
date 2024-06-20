// showcase labels for generating precise (fine grained) event methods
grammar Expr;

s: e ;
// here 'op' is a label: a different listener method will be generated for every alternative
// (see ExprBaseListener)
e: e op=MULT e
| e op=ADD e
| INT
;

INT: [1-9][0-9]* ;
MULT: '*' ;
ADD: '+' ;

