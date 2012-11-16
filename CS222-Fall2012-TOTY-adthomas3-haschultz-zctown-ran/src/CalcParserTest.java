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
		String input = "30+1*2/154-3";	
		//String[] data = parser.Splitter(input);
		
		//for(String x : data)
		System.out.println(parser.Splitter(input));
		
		
	}

}
