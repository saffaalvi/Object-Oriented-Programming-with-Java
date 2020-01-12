
public class Rectangle extends Shape
{
	private double length, width;
	/**constructor - gets id and label from super and width and length from DrawingApp**/
	public Rectangle(int id, String label, double length, double width)
	{
		super(id, label);
		this.width=width;
		this.length=length;
	}
	
	/**caluclates and returns area**/
	public double CalculateArea()
	{
		return length*width;
	}
	
}
