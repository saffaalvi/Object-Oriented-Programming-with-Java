import java.util.Random;
import java.util.Scanner;
/** this is a global interface that is implemented by any class to maintain some shared constants 
 * Assignment 3
 * December 1, 2019
 */

public interface Global 
{
	public static int Draw = 3;			
	public static int EMPTY = 0;
	public static int X = 1;
	public static int O = 2;
	public static Scanner sc = new Scanner(System.in);
	public static Random choose = new Random();
}
