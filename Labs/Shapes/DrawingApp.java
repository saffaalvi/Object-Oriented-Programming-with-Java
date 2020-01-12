import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class DrawingApp {
	/**main method**/
	public static void main(String[] args) 
	{
		ArrayList<Shape> shapes = new ArrayList<Shape>();	/**array of 10 random shapes of type Shape**/
		Random random = new Random();	
		for (int i=1; i<11; i++)		/**loop to fill array**/
		{
			int s = random.nextInt(3); /**random number between 0 and 2**/
			/**triangle**/
			if (s==0)	
				shapes.add(new Triangle(i, "Triangle", random.nextInt(10)+1, random.nextInt(10)+1));	//base and height between 1 and 10
			/**rectangle**/
			if (s==1)	
				shapes.add(new Rectangle(i, "Rectangle", random.nextInt(10)+1, random.nextInt(10)+1));	//length and width between 1 and 10
			/**circle**/
			if (s==2)	
				shapes.add(new Circle(i, "Circle", random.nextInt(10)+1));	//radius between 1 and 10
		}
		double area=0;					/**total area of shapes**/
		Collections.sort(shapes);		/**sorts shapes**/
		for (Shape str:shapes)
		{
			area+=str.CalculateArea();	
			System.out.println(str.toString());
		}
		System.out.println("Total area of shapes = " + area);
	}

}
