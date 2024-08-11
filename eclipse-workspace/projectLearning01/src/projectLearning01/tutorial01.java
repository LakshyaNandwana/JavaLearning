//PROGRAM TO FIND EMAIL ADDRESS IN ANY GIVEN STRING.

package projectLearning01;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.MatchResult;

public class tutorial01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter:");

		String patternToFind = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}\\b";

		 String foundPattern = scan.findInLine(patternToFind);
		// Check if the pattern was found
	        if (foundPattern != null) {
	            System.out.println("Pattern found: " + foundPattern);

	            // Access the MatchResult to get more information about the match
	            MatchResult matchResult = scan.match();
	            System.out.println("Start index: " + matchResult.start());
	            System.out.println("End index: " + matchResult.end());
	        } else {
	            System.out.println("Email not found in the line.");
	        }
	}
}