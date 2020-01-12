/**Determines whether a string entered by a user is a regular palindrome, mirrored palindrome, or mirrored string**/

import java.lang.String;
public class palindrome {
    String s;	/**string entered by user**/
    
    /**constructor**/
    public palindrome(String s)	
    {
        this.s = s;
    }
    
    /**
     *This method determines whether the string inputted is a palindrome, returning true if it is and false if not
     * @param s
     * @return boolean - true if palindrome and false if not
     */
    public boolean isPalindrome(String s)
    {
        int len = s.length();
        for (int i=0; i<len; i++)
        {
            if(s.charAt(i)!=s.charAt(len-i-1))
                return false;
        }
        return true;
    }

    /**
     * This method determines whether a string is a a mirrored string, returning true if it is and false if not
     * @param s
     * @return boolean - true if mirrored string, false if not
     */
    public boolean isMirroredString(String s)
    {
        char[] h = s.toCharArray(); /**character array copy of s**/
        for(int i=0; i<s.length(); i++) /**loop for all characters of s to replace reverse characters in h**/
        {
            char ch = s.charAt(i);
            if (check(ch)==false)   /**checks if all values of s are reversable characters**/
                return false;       /**if not, it can not be a mirrored string**/
            else
            {
                if (ch=='S')
                    h[i]='2';
                if (ch=='E')
                    h[i]='3';
                if (ch=='L')
                    h[i]='J';
                if (ch=='Z')
                    h[i]='5';
                if (ch=='2')
                    h[i]='S';
                if (ch=='3')
                    h[i]='E';
                if (ch=='J')
                    h[i]='L';
                if (ch=='5')
                    h[i]='Z';
            }
        }
        for (int k=0; k<s.length()/2; k++)  /**checks if left half of h matches with right half of s**/
        {
            if (h[k]!=s.charAt(s.length()-k-1))
                return false;
        }
        return true;
    }

    /**
     * This method checks whether the character inputted is a reversible character
     * @param c
     * @return boolean - true if reversible and false if not
     */
    public boolean check(char c)
    {
        char[] reverses = {'A','E','H','I','J','L','M','S','T','U','V','W','X','Y','Z','1','2','3','5','8', 'O'}; /**array of reversible characters**/
        for(int i=0;i<reverses.length;i++)  /**go through reversible character array to see if one matches c**/
        {
            if(reverses[i] == c)
                return true;
        }
        return false;
    }
    
    /**overriding toString() method to output appropriate response**/
    public String toString()
    {
        if (isPalindrome(s)==true)
        {
            if (isMirroredString(s)==true)
                return "" + s + "--is a mirrored palindrome";
            else
                return "" + s + "--is a regular palindrome";
        }
        if (isPalindrome(s)==false)
        {
            if (isMirroredString(s)==true)
                return "" + s + "--is a mirrored string";
        }
        return "" + s + "--is not a palindrome";

    }


}
