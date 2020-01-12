import java.lang.Math;
public class Weather {
	private int tempF; //temp in °F
	private int windSpeed; //wind speed in mph
	private double windChill;	//calculated with formula
	private boolean severe; 	//if Wind Chill is less than -15'F, it's considered severe
	
	/**default constructor
	 * no arguments, no return
	 */
	public Weather()
	{
		tempF = 0;
		windSpeed = 0;
	}
  
	/** overloaded constructor
	 * Takes two arbitrary values and assigns them to tempF and windSpeed 
	 * @param tempF - temp in 'F
	 * @param windSpeed - wind speed in mph
	 * no return value
	 */
	public Weather(int tempF, int windSpeed)
	{
		this();
		setTempF(tempF);
		setWindSpeed(windSpeed);
	}
	/**
	 * Sets the value of tempF in a valid state - should be between -50 and 150
	 * @param tempF
	 * @return true if valid, false if invalid
	 */
	public boolean setTempF(int tempF)
	{
		if(tempF>-50 && tempF<150)
		{
			this.tempF = tempF;
			return true;
		}
		return false;
	}
	/**
	 * Sets the value of windSpeed in a valid state - should be greater than 0
	 * @param windSpeed
	 * @return true if valis, false if invalid
	 */
	public boolean setWindSpeed(int windSpeed)
	{
		if(windSpeed>0)
		{
			this.windSpeed=windSpeed;
			return true;
		}
		return false;
	}
	//get methods to access the private data members (tempF and windSpeed)
	public int getTempF()
	{
		return tempF;
	}
	public int getWindSpeed()
	{
		return windSpeed;
	}
	/**
	 * calculates the value of windChill by substituting the correct values for tempF and windSpeed into formula
	 * @return windChill
	 */
	public double getWindChill()
	{
		double wind = 35.74+(0.6215*tempF)-35.75*Math.pow(windSpeed,0.16)+0.4275*tempF*Math.pow(windSpeed,0.16);
		windChill = Math.round(wind*10)/10.0;
		return(windChill);
	}
	/**
	 * determines whether windChill is severe (-15'F) or not
	 * @return true if windChill is severe and false if not
	 */
	public boolean isSevere()
	{
		return(windChill<-15);
	}
	/**
	 * returns a meaningful string representing the object, override of toString()
	 */
	public String toString()	
	{
		return "Current temperature is "+tempF+"'F. Feels like "+getWindChill()+"'F and Wind Speed is "+windSpeed+" mph. Wind chill is severe: "+isSevere()+"."; 	
	
	}
}
