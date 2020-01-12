/**An employee IS a person - subclass - employee inherits person**/
class employee extends person 
{
	private int year_hired;			/**integer between 1900 and 2999, year employee was hired**/
	private int id;					/**unique positive integer using auto increment - id for each employee**/
	private static int counter = 0;	/** class variable - next value assigned to ID**/
	
	/**constructor**/
	public employee (String name, int age, int year_hired)
	{
		super(name, age);
		id = ++counter;
		setYearHired(year_hired);
	}
	
	/**Set method for year_hired, checking validity before setting. If valid, year_hired is set to input, otherwise set to 2019
	 * @param year_hired - int
	 * @return year_hired - int (after being set to valid value)
	 */
	public int setYearHired(int year_hired)
	{
		if(year_hired>1900 & year_hired<2999)
			this.year_hired = year_hired;
		else
			this.year_hired = 2019;
		return year_hired;
	}
	
	/**get methods for year_hired and id**/
	public int getYearHired()
	{
		return year_hired;
	}
	public int getID()
    {
            return id;
    }
	/**override toString() in base class**/
	public String toString()
	{
		return ""+name+" was hired in "+year_hired+" and is "+age+" years old. ID:"+getID();
	}
	/**
	 * protected instance method that displays a message
	 * @param name
	 * @return String message
	 */
	protected String PayWorker(String name)
	{
		return name + " is an employee who needs to be paid.";
	}
}
