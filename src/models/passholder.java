
package models;

import java.util.Random;

import models.car;

public class passholder extends car {

	  
	  /**
	   * The constructor creates an instance of a parking pass holder. 
	   * When it does, it changes the field 'isMember' in it's superclass Car to true.
	   */
	//the parkingpass holder, this customer can swoowsh to the end of the que without playing locally
	  public passholder() {
		setIsMember(); 
		  
		Random random = new Random(); 
			
		minutesStay = (int) (15 + random.nextFloat() * 10 * 60);
	  }

}