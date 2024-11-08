import java.io.*;

/**
 * Math Expression Scanner driver program
 * Name: Eddie Elvira
 * Date: 2/23/23
 *
 */
public class MathExprScanner implements ParserTokens
{
	public MathExprScanner() throws IOException
	{
		scan();
	}

	public void scan() throws IOException
	{
		// Create the scanner object
		InputStreamReader in = new InputStreamReader(System.in);
		Yylex lexer = new Yylex(in);

		String expr = ""; // gather complete scanned expression
		
		// Flags to report error or more tokens available
		boolean hasError = false;
		boolean hasToken = true;

		// Counter used to keep track of balanced operations
		int opCount = 0;
		
		// Left and right parentheses counter
		int leftParenCount = 0;
		int rightParenCount = 0;
		
		// Counter used to keep track of balanced expressions (<0-9> <op> <0-9>)
		int numCount = 0;
		
		while (hasToken)
		{
			// Get next token
			int token = lexer.yylex();
			hasToken = token != Yylex.YYEOF; // was end of file reached?
					
			// Gather up the current expression from each token
			expr += lexer.yytext() + " ";

			// ADD MORE BELOW to display all of the tokens your scanner recognizes
			switch (token)
			{
			case NUMBER:
				numCount++;
				System.out.println(lexer.yytext() + " NUMBER " + lexer.value);
				
				// If there's an op in the counter, decrement the counter
				if (opCount > 0) opCount--;
				break;
			case ADDOP:
				opCount++;
				System.out.println(lexer.yytext() + " ADDOP " + "");
				
				// Check if there are consecutive operators
				if (consecutiveOpCheck(opCount)) 
					hasError = true;
				
				// Check if there's a number on the left
				if (missingLeftNumCheck(numCount))
					hasError = true;
				else numCount--;
				break;
			case SUBOP:
				opCount++;
				System.out.println(lexer.yytext() + " SUBOP " + "");
				if (consecutiveOpCheck(opCount)) 
					hasError = true;
				if (missingLeftNumCheck(numCount))
					hasError = true;
				else numCount--;
				break;
			case MULOP:
				opCount++;
				System.out.println(lexer.yytext() + " MULOP " + "");
				if (consecutiveOpCheck(opCount)) 
					hasError = true;
				if (missingLeftNumCheck(numCount))
					hasError = true;
				else numCount--;
				break;
			case DIVOP:
				opCount++;
				System.out.println(lexer.yytext() + " DIVOP " + "");
				if (consecutiveOpCheck(opCount)) 
					hasError = true;
				if (missingLeftNumCheck(numCount))
					hasError = true;
				else numCount--;
				break;
			case LEFTPAREN:
				++leftParenCount;
				System.out.println(lexer.yytext() + " LEFTPAREN  " + "");
				break;
			case RIGHTPAREN:
				++rightParenCount;
				
				// If the right paren is missing a left paren, error=true
				if (rightParenCount > leftParenCount)
				{
					hasError = true;
					System.out.println("Missing left parentheses");
				}
				System.out.println(lexer.yytext() + " RIGHTPAREN " + "");
				break;
			case error:
				hasError = true;
				System.out.println("ERROR");
				break;
			case NEWLINE:
			case ENDINPUT:
			default:
				
				// If number of right parens don't equal number of left parens, error=true
				if (rightParenCount != leftParenCount)
				{
					hasError = true;
					System.out.print("Mismatched parentheses: ");
					System.out.println("Left parentheses count = " + leftParenCount + ", Right parentheses count = " + rightParenCount);
				}
				
				// If there is a operator at the end of the expression, error=true
				if (opCount > 0) {
					hasError = true;
					System.out.println("Unmatched operator: Expected a number after the operator");
				}
				System.out.println("hasError:" + hasError);
				System.out.println("--------------------------");
				expr = "";
				hasError = false;
				
				// Reset all counters for next line
				opCount = 0;
				numCount = 0;
				leftParenCount = 0;
				rightParenCount = 0;
				break;
			}
		}
	}
	
	// Checks if two or more operators were used in a row
	public static boolean consecutiveOpCheck(int opCount)
	{
		if (opCount > 1) 
		{
			System.out.println("Error: consecutive operators");
			return true;
		}
		return false;
	}
	
	// Checks if operator is missing a number on the left side
	public static boolean missingLeftNumCheck(int numCount)
	{
		if (numCount == 0)
		{
			System.out.println("Error: missing number before operator");
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) throws IOException
	{
		new MathExprScanner();
	}
}
