/**
 * Program to calculate simple and compound interest
 */

/**
 * @author priyanka
 *
 */
public class Interest {

	/**
	 * 
	 * @param principal principal amount
	 * @param time time period
	 * @param rate_of_interest rate of interest
	 * @return simple interest 
	 */
	public double simpleInterest(int principal,int time,double rate_of_interest) {
		return (principal*time*rate_of_interest)/100;
	
	}
	/**
	 * 
	 * @param principal principal amount
	 * @param time time period
	 * @param rate_of_interest rate of interest
	 * @return compound interest
	 */
	public double compoundInterest(int principal,int time,double rate_of_interest) {
		return (principal*Math.pow((1+(rate_of_interest/100)),time));
	
	}
	

}
