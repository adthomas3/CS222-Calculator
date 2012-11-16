/**
 * 
 * @author Andrew Thomas, Harrison Schultz, Ran An, Zach Town
 */

import java.io.InputStream;

public class CalcParserTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		InputParser parser = new InputParser();
		String input = "30+1*2";	
		String[] data = parser.Splitter(input);
		System.out.println(parser.Solve(data));
	}

}
