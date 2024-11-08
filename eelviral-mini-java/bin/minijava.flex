/* Scanner specification file for mini java syntax checker. */
/* Author: Dr. Tom Way */
/* Date: 3/08/22 */

%%

%unicode
%line
%column
%standalone
%implements ParserTokens

/* uncomment %debug to see verbose scanner output */
//%debug

%{
	// Store a reference to the parser object. Needed to reference yylval.
	private Parser yyparser;

	// constructor taking an additional parser
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
%}

digit = [0-9]
letter = [A-Za-z]

// integer is either 0 or any number
// of digits starting with 1-9
integer = "0"|[1-9]{digit}*

// hexadecimal 0x or 0X followed by any number of 0-9 or A-F
hex = ("0x"|"0X")([0-9A-Fa-f])+

// octal 0 followed by any number of 0-7
octal = "0"([0-7])+

// binary 0b or 0B followed by any number of 0 or 1
binary = ("0b"|"0B")([01])+

// identifier sequence of letters, digits, 
// and underscores, starting with a letter
identifier = ({letter})({letter}|{digit}|"_")*

whitespace = [\s]+
multicomment = "/*" ~ "*/"
linecomment = "//".*[\n\r]+

%%

// Access modifiers
"public"			{ return PUBLIC; }

// Class, method, variable modifiers
"class"				{ return CLASS; }
"static"			{ return STATIC; }
"void"				{ return VOID; }
"extends"			{ return EXTENDS; }
"new"				{ return NEW; }

// Keywords
"this"				{ return THIS; }

// Flow control
"if"				{ return IF; }
"else"				{ return ELSE; }
"while"				{ return WHILE; }
"return"			{ return RETURN; }


// Data Types
"int"				{ return INT; }
"String"			{ return STRING; }
"boolean"			{ return BOOLEAN; }

// Operators
";"					{ return SEMI; }
"{"					{ return LBRACE; }
"}"					{ return RBRACE; }
"("					{ return LPAREN; }
")"					{ return RPAREN; }
"["					{ return LBRACK; }
"]"					{ return RBRACK; }
"="					{ return ASSIGN; }
"!"					{ return NOT; }
"<"					{ return LT; }
"+"					{ return ADDOP; }
"-"					{ return SUBOP; }
"*"					{ return MULOP; }
"/"					{ return DIVOP; }
"."					{ return DOT; }
","					{ return COMMA; }
"="					{ return ASSIGN; }
"&&"				{ return AND; }
"true"				{ return TRUE; }
"false"				{ return FALSE; }

// Other
"main"				{ return MAIN; }
"System.out.println" { return PRINTLN; }
"length"			{ return LENGTH; }

{identifier}		{ return IDENTIFIER; }
{multicomment}		{/* ignore */}
{linecomment}		{/* ignore */}

{integer}			{ return INTEGER_LITERAL; }
{hex}				{ return INTEGER_LITERAL; }
{octal}				{ return INTEGER_LITERAL; }
{binary}			{ return INTEGER_LITERAL; }

{whitespace}		{/* ignore */}

<<EOF>>				{ return ENDINPUT; }
.					{ return UNKNOWN; }
