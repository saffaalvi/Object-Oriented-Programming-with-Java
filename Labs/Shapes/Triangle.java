
public class Triangle extends Shape
{
	private double height, base;
	
	/**constructor, gets id and label from superclass and base and height from DrawingApp**/
	public Triangle(int id, String label, double base, double height)
	{
		super(id, label);
		this.height=height;
		this.base=base;
	}
	
	/**calculates and returns area**/
	public double CalculateArea()
	{
		return (base*height)/2;
	}
}
