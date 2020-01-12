
public class WeatherTester {
	
	public static void main(String[] args) {
  
		//test default constructor (no input is not valid)
		Weather w1 = new Weather();			
		System.out.println("Testing no argument constructor --> "+w1);
    
		//test two argument overloaded constructor
		Weather w2 = new Weather(14,2);	
		System.out.println("Testing two argument overloaded constructor --> "+w2);
    
    //changing values
		w1.setTempF(14);
		w1.setWindSpeed(2);
		System.out.println("Testing changing values --> "+w1);
		
	}

}
