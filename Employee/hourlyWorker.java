
public class hourlyWorker extends employee
{
	
	private int num_hours = 0;		/**number of hours worked**/
	private double hourly_rate = 0;	/**rate per hour**/
	private double total_pay;
	/**
	 * overload constructor sets name, age, year_hired, num_hours, and hourly_rate
	 * @param name
	 * @param age
	 * @param year_hired
	 * @param num_hours
	 * @param hourly_rate
	 */
	public hourlyWorker(String name, int age, int year_hired, int num_hours, double hourly_rate) 
	{
		super(name, age, year_hired);
		setNum_Hours(num_hours);
		setHourly_Rate(hourly_rate);
		
	}
	/**
	 * public instance method that calculates total pay and resets num_hours to 0. displays a message
	 */
	public void PayWorker()
	{
		if (num_hours!=0)
		{
			total_pay = num_hours*hourly_rate;
			System.out.println((super.PayWorker(name) + "\n" + name + " is an hourly worker and is paid $" + (total_pay)));
			setNum_Hours(0);
		}
		else
		{
			System.out.println(name + " has already been paid and needs to work more hours this week.");
		}
		
	}
	/**set methods for num_hours and hourly_rate (valid values only)**/
	public int setNum_Hours(int num_hours)
	{
		if(num_hours > 0)
			this.num_hours = num_hours;
		else
			this.num_hours = 0;
		return num_hours;
	}
	public double setHourly_Rate(double hourly_rate)
	{
		if(hourly_rate>0)
			this.hourly_rate=hourly_rate;
		else
			this.hourly_rate=0;
		return hourly_rate;
	}
	/**get methods for num_hours and hourly_rate**/
	public int getNum_Hours()
	{
		return num_hours;
	}
	public double getHourly_Rate()
	{
		return hourly_rate;
	}
	 
}
