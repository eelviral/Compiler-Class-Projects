/**
 * Parser token constants
 * Name: Eddie Elvira
 */
public interface ParserTokens
{
	static public final int ENDINPUT = -1;
	
	static public final int ADDOP = 1;
	static public final int SUBOP = 12;
	static public final int MULOP = 5;
	static public final int DIVOP = 8;
	
	static public final int LEFTPAREN = 17;
	static public final int RIGHTPAREN = 18;
	
	static public final int NUMBER = 20;
	static public final int NEWLINE = 90;
	static public final int error = 99;
}
