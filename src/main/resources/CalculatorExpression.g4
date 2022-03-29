grammar CalculatorExpression;

INT       : [0-9]+;
DECIMAL   : [0-9]+'.'[0-9]+;
SCIENTIFIC: (INT|DECIMAL) ('e'|'E') (PLUS|MINUS)? INT;
IMAGINARY : [0-9]+'i';

PLUS : '+';
MINUS: '-';
MULT : '×';
DIV  : '/';

expression: term;

parenthesed_expression: '(' expression ')';

term: factor
    | term PLUS factor
    | term MINUS factor
    ;

factor: value
      | factor MULT value
      | factor DIV value
      ;

value: number
     | parenthesed_expression
     ;

scientific_number:  (INT|DECIMAL) ('e'|'E') (PLUS|MINUS)? INT;
number: MINUS?(INT|DECIMAL|IMAGINARY|SCIENTIFIC);

WS : [ \t\r\n]+ -> skip; // ignore whitespaces