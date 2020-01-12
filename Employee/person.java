/**base class - superclass**/
class person 
{
	protected String name;	/**non empty string which contains name of the person**/
	protected int age;		/**positive integer under 150, to hold age of person**/
	
	/**default constructor**/
	public person()
	{
		name = "private contractor";
		age = 18;
	}
	
	/**overload constructor**/
	public person(String name, int age)
	{
		this();
		setName(name);
		setAge(age);
	}
	
	/**set methods for name and age, checking validity before setting the values**/
	public String setName(String name)
	{
		if(isValidName(name))
			this.name=name;
		return name;
	}
	public int setAge(int age)
	{
		if (isValidAge(age))
			this.age=age;
		return age;
	}
	
	/**get methods for name and age**/
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	
	/**
	 * This method checks the validity of name, making sure it is not empty
	 * @param name - String
	 * @return boolean- false if empty and true if not
	 */
	private boolean isValidName(String name)
	{
		if(name.isEmpty())
			return false;
		return true;
	}
	
	/**
	 * This method checks the validity of age, making sure it is above 0 and less than 150
	 * @param age - int
	 * @return boolean - true if valid and false if invalid
	 */
	private boolean isValidAge (int age)
	{
		if(age>0 && age<150)
			return true;
		return false;
	}
	
	/** overrides toString()**/
	public String toString()
	{
		return ""+name+" is "+age+"years old";
	}
}
