
public abstract class Shape implements Comparable<Shape>
{
	private int id;			/**unique id**/
	private String label;

	/**constructor, assigning default id and label**/
	public Shape()
	{
		id = 1;
		label = "circle";
	}

	/**overloaded constructor**/
	public Shape(int id, String label) 	
	{
		this.id = id;
		this.label = label;
	}
	
	/**get methods**/
	public int getID()
	{
		return id;
	}
	public String getLabel()
	{
		return label;
	}
	
	/**implementing abstract method compareTo in Comparable interface to sort shapes in descending order**/
	public int compareTo(Shape x) 
	{
		if (x.CalculateArea()==this.CalculateArea())
			return 0;
		if(x.CalculateArea()>this.CalculateArea())
			return -1;
		else
			return 1;
	}
	
	/**abstract method to calculate and return area of shape**/
	public abstract double CalculateArea();
	
	/**override toString**/
	public String toString()
	{
		return "Shape # " + id + " is a " + label + " with area: " + CalculateArea();
	}
}
