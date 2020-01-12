
public class Circle extends Shape
{
	private double radius;
	
	/**constructor - gets id and label from super and radius DrawingApp**/
	public Circle(int id, String label, double radius)
	{
		super(id, label);
		this.radius=radius;
	}
	
	/**calculates and returns area**/
	public double CalculateArea()
	{
		return Math.PI*radius*radius;
	}
}
