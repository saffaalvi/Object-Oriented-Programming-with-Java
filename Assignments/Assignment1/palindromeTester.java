/**tests palindrome.java**/

import java.util.*;
public class palindromeTester {

    public static void main(String[] args) {
        String line;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            line = sc.next();
            processLine(line);
        }
        sc.close();
    }

    /**
     * This method processes the line and computes its output by running it through palindrome
     * @param line
     * no output
     */
    static void processLine(String line)
    {
        System.out.println("processing " + line);
        palindrome test = new palindrome(line.toUpperCase());   /**runs line through palindrome to test it, converts all letters to upper case so palindrome check is not case sensitive**/
        System.out.println(test);
    }
}
