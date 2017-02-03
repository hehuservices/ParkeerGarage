
package models;

import java.util.Random;

public class  AdHocCar extends car {
	
	/**
	 * When constructing this instance, isNormalCustomer will be set to true in Car. 
	 * Also the time the specific car will be parking is created.
	 */
	public AdHocCar(){
		setIsNormalCustomer(); 
		
		Random random = new Random(); 
		
		minutesStay = (int) (15 + random.nextFloat() * 10 * 60);
	}
}