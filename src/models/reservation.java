package models;

import models.car;

public class reservation extends car {

	//Als deze word aangeroepen, word HasReservation true
	public reservation(){
		setHasReservation();
		minutesStay = (int) (randInt(360, 120));
	}

}
