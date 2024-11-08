// Output created by jacc on Tue Mar 21 14:09:49 EDT 2023


import java.io.*;
import java.nio.charset.*;

class Parser implements ParserTokens {
    private int yyss = 100;
    private int yytok;
    private int yysp = 0;
    private int[] yyst;
    protected int yyerrno = (-1);
    private int[] yysv;
    private int yyrv;

    public boolean parse() {
        int yyn = 0;
        yysp = 0;
        yyst = new int[yyss];
        yyerrno = (-1);
        yysv = new int[yyss];
        yytok = (token
                 );
    loop:
        for (;;) {
            switch (yyn) {
                case 0:
                    yyst[yysp] = 0;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 18:
                    yyn = yys0();
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 19:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 36;
                            continue;
                    }
                    yyn = 39;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 20:
                    switch (yytok) {
                        case LPAREN:
                        case DOUBLEOP:
                        case error:
                        case UNKNOWN:
                        case NUMBER:
                            yyn = 39;
                            continue;
                    }
                    yyn = yyr7();
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 21:
                    yyn = yys3();
                    continue;

                case 4:
                    yyst[yysp] = 4;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 22:
                    switch (yytok) {
                        case LPAREN:
                        case DOUBLEOP:
                        case error:
                        case UNKNOWN:
                        case NUMBER:
                            yyn = 39;
                            continue;
                    }
                    yyn = yyr9();
                    continue;

                case 5:
                    yyst[yysp] = 5;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 23:
                    yyn = yys5();
                    continue;

                case 6:
                    yyst[yysp] = 6;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 24:
                    switch (yytok) {
                        case RPAREN:
                            yyn = yyerr(0, 39);
                            continue;
                        case LPAREN:
                            yyn = 6;
                            continue;
                        case NUMBER:
                            yyn = 7;
                            continue;
                    }
                    yyn = 39;
                    continue;

                case 7:
                    yyst[yysp] = 7;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 25:
                    switch (yytok) {
                        case LPAREN:
                        case error:
                            yyn = 39;
                            continue;
                        case NUMBER:
                            yyn = yyerr(5, 39);
                            continue;
                        case DOUBLEOP:
                            yyn = yyerr(6, 39);
                            continue;
                        case UNKNOWN:
                            yyn = yyerr(7, 39);
                            continue;
                    }
                    yyn = yyr10();
                    continue;

                case 8:
                    yyst[yysp] = 8;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 26:
                    switch (yytok) {
                        case RPAREN:
                        case ENDINPUT:
                            yyn = yyerr(1, 39);
                            continue;
                        case LPAREN:
                            yyn = 6;
                            continue;
                        case NUMBER:
                            yyn = 7;
                            continue;
                    }
                    yyn = 39;
                    continue;

                case 9:
                    yyst[yysp] = 9;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 27:
                    switch (yytok) {
                        case RPAREN:
                        case ENDINPUT:
                            yyn = yyerr(1, 39);
                            continue;
                        case LPAREN:
                            yyn = 6;
                            continue;
                        case NUMBER:
                            yyn = 7;
                            continue;
                    }
                    yyn = 39;
                    continue;

                case 10:
                    yyst[yysp] = 10;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 28:
                    switch (yytok) {
                        case LPAREN:
                            yyn = 6;
                            continue;
                        case NUMBER:
                            yyn = 7;
                            continue;
                    }
                    yyn = 39;
                    continue;

                case 11:
                    yyst[yysp] = 11;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 29:
                    switch (yytok) {
                        case LPAREN:
                            yyn = 6;
                            continue;
                        case NUMBER:
                            yyn = 7;
                            continue;
                    }
                    yyn = 39;
                    continue;

                case 12:
                    yyst[yysp] = 12;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 30:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = yyerr(3, 39);
                            continue;
                        case ADDOP:
                            yyn = 8;
                            continue;
                        case SUBOP:
                            yyn = 9;
                            continue;
                        case RPAREN:
                            yyn = 17;
                            continue;
                    }
                    yyn = 39;
                    continue;

                case 13:
                    yyst[yysp] = 13;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 31:
                    switch (yytok) {
                        case RPAREN:
                        case ENDINPUT:
                        case SUBOP:
                        case ADDOP:
                            yyn = yyr2();
                            continue;
                    }
                    yyn = 39;
                    continue;

                case 14:
                    yyst[yysp] = 14;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 32:
                    switch (yytok) {
                        case RPAREN:
                        case ENDINPUT:
                        case SUBOP:
                        case ADDOP:
                            yyn = yyr3();
                            continue;
                    }
                    yyn = 39;
                    continue;

                case 15:
                    yyst[yysp] = 15;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 33:
                    switch (yytok) {
                        case LPAREN:
                        case DOUBLEOP:
                        case error:
                        case UNKNOWN:
                        case NUMBER:
                            yyn = 39;
                            continue;
                    }
                    yyn = yyr6();
                    continue;

                case 16:
                    yyst[yysp] = 16;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 34:
                    switch (yytok) {
                        case LPAREN:
                        case DOUBLEOP:
                        case error:
                        case UNKNOWN:
                        case NUMBER:
                            yyn = 39;
                            continue;
                    }
                    yyn = yyr5();
                    continue;

                case 17:
                    yyst[yysp] = 17;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 35:
                    switch (yytok) {
                        case LPAREN:
                        case DOUBLEOP:
                        case error:
                        case UNKNOWN:
                        case NUMBER:
                            yyn = 39;
                            continue;
                    }
                    yyn = yyr8();
                    continue;

                case 36:
                    return true;
                case 37:
                    yyerror("stack overflow");
                case 38:
                    return false;
                case 39:
                    yyerror("syntax error");
                    return false;
            }
        }
    }

    protected void yyexpand() {
        int[] newyyst = new int[2*yyst.length];
        int[] newyysv = new int[2*yyst.length];
        for (int i=0; i<yyst.length; i++) {
            newyyst[i] = yyst[i];
            newyysv[i] = yysv[i];
        }
        yyst = newyyst;
        yysv = newyysv;
    }

    private int yys0() {
        switch (yytok) {
            case error:
            case RPAREN:
            case ENDINPUT:
                return 39;
            case DOUBLEOP:
                return yyerr(6, 39);
            case UNKNOWN:
                return yyerr(7, 39);
            case LPAREN:
                return 6;
            case NUMBER:
                return 7;
        }
        return yyerr(2, 39);
    }

    private int yys3() {
        switch (yytok) {
            case DIVOP:
            case MULOP:
                return yyerr(1, 39);
            case RPAREN:
                return yyerr(4, 39);
            case ADDOP:
                return 8;
            case SUBOP:
                return 9;
            case ENDINPUT:
                return yyr1();
        }
        return 39;
    }

    private int yys5() {
        switch (yytok) {
            case DIVOP:
                return 10;
            case MULOP:
                return 11;
            case RPAREN:
            case ENDINPUT:
            case SUBOP:
            case ADDOP:
                return yyr4();
        }
        return 39;
    }

    private int yyr1() { // mathexpr : exp
        { printResult(yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return 1;
    }

    private int yyr8() { // factor : LPAREN exp RPAREN
        { yyrv = yysv[yysp-2]; }
        yysv[yysp-=3] = yyrv;
        return 2;
    }

    private int yyr9() { // factor : number
        { yyrv = yysv[yysp-1]; }
        yysv[yysp-=1] = yyrv;
        return 2;
    }

    private int yyr2() { // exp : exp ADDOP exp
        { yyrv = yysv[yysp-3] + yysv[yysp-1]; }
        yysv[yysp-=3] = yyrv;
        return yypexp();
    }

    private int yyr3() { // exp : exp SUBOP exp
        { yyrv = yysv[yysp-3] - yysv[yysp-1]; }
        yysv[yysp-=3] = yyrv;
        return yypexp();
    }

    private int yyr4() { // exp : term
        { yyrv = yysv[yysp-1]; }
        yysv[yysp-=1] = yyrv;
        return yypexp();
    }

    private int yypexp() {
        switch (yyst[yysp-1]) {
            case 8: return 13;
            case 6: return 12;
            case 0: return 3;
            default: return 14;
        }
    }

    private int yyr10() { // number : NUMBER
        { yyrv = yysv[yysp-1]; }
        yysv[yysp-=1] = yyrv;
        return 4;
    }

    private int yyr5() { // term : term MULOP term
        { yyrv = yysv[yysp-3] * yysv[yysp-1]; }
        yysv[yysp-=3] = yyrv;
        return yypterm();
    }

    private int yyr6() { // term : term DIVOP term
        { yyrv = yysv[yysp-3] / yysv[yysp-1]; }
        yysv[yysp-=3] = yyrv;
        return yypterm();
    }

    private int yyr7() { // term : factor
        { yyrv = yysv[yysp-1]; }
        yysv[yysp-=1] = yyrv;
        return yypterm();
    }

    private int yypterm() {
        switch (yyst[yysp-1]) {
            case 11: return 16;
            case 10: return 15;
            default: return 5;
        }
    }

    private int yyerr(int e, int n) {
        yyerrno = e;
        return n;
    }
    protected String[] yyerrmsgs = {
        "empty parentheses",
        "missing right operand",
        "missing left operand",
        "missing closing parenthesis",
        "unexpected closing parenthesis",
        "missing operator",
        "illegal double operator",
        "invalid character"
    };


int yylval; // current token value
int token;  // current token

// Variable containing current expression
private String line = "";

// Prints an accept result
private void printResult(int value)
{
        System.out.println("ACCEPT");
        System.out.println("Expression: " + line);
        System.out.println("Result: " + value);
}

// Prints reject result with custom error message and error details
public void errorMessage(String error)
{
        // Get position of current error
        int position = lexer.getCol() + 1;
        
        System.out.println("REJECT");
        System.out.println("Error: " + error + " at character " + position);
        System.out.println("Expression: " + line);
        
        // Generate the whitespace to correctly place the error marker ^
        int n = 11 + position;
    String whitespace = String.format("%1$"+n+"s", "");
    
    System.out.println(whitespace + "^");
        
}
        
// Reference to the lexer object
private static Yylex lexer;

// Interface to the lexer
private int yylex()
{
    int retVal = ENDINPUT;
    try
        {
                retVal = lexer.yylex();
    }
        catch (IOException e)
        {
                System.err.println("IO Error:" + e);
    }
    
    return retVal;
}

// Default error handling
public void yyerror(String error)
{
        // uses custom error message if defined in mathexpr.errs
        errorMessage(yyerrno<0 ? error : yyerrmsgs[yyerrno]);
}

// constructor taking a String
public Parser(String expr)
{
        line = expr;
        InputStream lineStream = new ByteArrayInputStream(line.getBytes((Charset.forName("UTF-8"))));
        InputStreamReader r = new InputStreamReader(lineStream);
        lexer = new Yylex(r, this);
        token = yylex(); // prime the pump
}


}
