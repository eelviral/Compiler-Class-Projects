/**
 * MathExprParser - driver program for math expression parser.
 */
import java.io.*;

public class MathExprParser implements ParserTokens
{
	public MathExprParser() throws IOException
	{
		scan();
	}
 
	public void scan() throws IOException
	{
		// Read in and parse lines one at a time
		BufferedReader lineReader = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = lineReader.readLine()) != null)
		{			
			Parser parser = new Parser(line);
			boolean result = parser.parse();
			System.out.println("Parse " + (result ? "successful" : "errors"));
			System.out.println("------------------------------------------------");
		}
	}

	public static void main(String[] args) throws IOException
	{
		new MathExprParser();
	}
}
