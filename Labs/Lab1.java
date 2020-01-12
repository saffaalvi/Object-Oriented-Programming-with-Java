/** COMP2120 - Lab 1
	Lab1.java
*/

import java.util.*;
import java.lang.Math;
import java.lang.String;

public class Lab1 {

	/** Method calc - Description: This method calculates the formula sqrt(PI*y^2)/2x for two numbers entered by the user.
	 * Input: 
	 * @param x - integer entered by user 
	 * @param y - integer entered by user
	 * Output: 
	 * @return answer - double result after x and y are plugged into the formula
	 **/
	public static double calc(int x, int y){
		double num = Math.sqrt (Math.PI * (Math.pow(y, 2)));	/**numerator formula**/
		double denom = x*2;			/**denominator formula**/
		double answer = num/denom;	/**final answer**/
		return answer;				/**returns final answer**/
	}
  
	/**Method wordCap - Description: This method capitalizes the first letter of a String entered by the user and put the rest of the letters in lowercase
	 * Input: 
	 * @param str - String inputed by user
	 * Output: 
	 * @return strUpper - correct form of the String 
	 */
	public static String wordCap(String str) {
		String strLower = str.toLowerCase();	/**changes all characters of String str to lowercase**/
		char w = str.charAt(0);
		String strUpper = Character.toUpperCase(w) + strLower.substring(1);	/**changes first letter in str to uppercase and adds substring (rest of string after first character)**/
		return strUpper;	/**returns correct form of str**/
	}
  
	/**Method findKeyWord - Description: This method takes two inputs, a string (str) and a key word (kw), and returns true if it finds kw in str 
	 *Challenge - a flag is added as a third parameter, if it's true, the searching is case insensitive 
	 * Input: 
	 * @param str - String inputed by user
	 * @param kw - String inputed by user
	 * @param flag - boolean,(true or false) inputed by user
	 * Output: 
	 * @return boolean - true if kw is in str and false if kw is not in str
	 **/
	public static boolean findKeyWord(String str, String kw, boolean flag)
	{
		if(flag==true)		/**case insensitive**/ 
		{
			str = str.toLowerCase();	/**changes all letters in str to lowercase**/
			kw = kw.toLowerCase();		/**changes all letters in kw to lowercase **/
		}	
		return str.contains(kw);		/**return true if kw is in str**/
	}
  
	/**main - Description - runs all methods and asks for inputs from user to be entered into methods
	*@param args - array of strings
	* no return value (void)
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	/**declaring a variable of type Scanner, named sc, instantiating sc, it's now a scanner object**/
		/**Method calc**/
		System.out.print("CALC: \nEnter a value for x: ");
		int x = sc.nextInt();		/**int x for first value user enters to be run in calc**/
		System.out.print("Enter a value for y: ");
		int y = sc.nextInt();		/**int y for second value user enters to be run in calc**/
		System.out.printf("After running calc, the answer is: %.2f\n" , calc(x,y));	/**.2f rounds answer to 2 decimal places**/
		/**Method wordCap**/
		System.out.print("WORDCAP: \nEnter a word: ");
		String word = sc.next();	/**String word to be entered by user to run through wordCap**/	
		System.out.println("After running wordCap, your word is: " + wordCap(word));
		/**Method findKeyWord**/
		System.out.print("FINDKEYWORD: \nEnter a string: ");
		String str = sc.next();		/**String str to check if it contains keyword**/
		System.out.print("Enter a keyword to check for: ");
		String kw = sc.next();		/**String kw - keyword to look for in str**/
		System.out.print("Enter true (case insensitive) or false (case sensitive): ");
		boolean flag = sc.nextBoolean();	/**flag to enter whether searching is case sensitive or case insensitive**/
		System.out.println("kw is in str: " + findKeyWord(str,kw,flag));	
	}

}
