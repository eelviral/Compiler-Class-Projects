/* Scanner specification file for math expressions. */
/* Author: Eddie Elvira */
/* Date: 2/28/22 */
%%

%unicode
%line
%column
%standalone
%implements ParserTokens

%{
	/* Store a reference to the parser object. Needed to reference yylval. */
	private Parser yyparser;

	/* constructor taking an additional parser */
	public Yylex(java.io.Reader r, Parser yyparser)
	{
		this(r);	
		this.yyparser = yyparser;
	}
	
	// Returns current line number
	public int getLine()
	{
		return yyline;
	}

	// Returns current column number
	public int getCol()
	{
		return yycolumn;
	}
	
	public void printToken(String tokenName, String tokenValue)
	{
		System.out.println(tokenName + ": " + tokenValue);
	}

%}


letter = [A-Za-z]
digit = [0-9]

%%

{digit}+			{ int value = Integer.parseInt(yytext());
					  yyparser.yylval = value;
					  return NUMBER; }
"+"					{ return ParserTokens.ADDOP; }
"-"					{ return ParserTokens.SUBOP; }
"*"					{ return ParserTokens.MULOP; }
"/"					{ return ParserTokens.DIVOP; }
"("					{ return ParserTokens.LPAREN; }
")"					{ return ParserTokens.RPAREN; }
"++"				{ return ParserTokens.DOUBLEOP; }
"--"				{ return ParserTokens.DOUBLEOP; }
"**"				{ return ParserTokens.DOUBLEOP; }
"//"				{ return ParserTokens.DOUBLEOP; }
[\r\n]+				{ return ENDINPUT; }
[\s]+				{/* do nothing-skip whitespace */}
<<EOF>>				{ return ENDINPUT; }
.					{ return UNKNOWN; }
