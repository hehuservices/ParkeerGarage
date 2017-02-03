package models;

import java.util.Random;

public abstract class car extends abstractmodel {
	private location location;
    private int minutesLeft;
    private boolean isPaying;
    private boolean isMember;
    private boolean hasReservation;
    private boolean isNormalCustomer;

    protected int minutesStay; 

    public car() {
    	//default van het membership is false (voor normalCustomer)
    	isMember = false; 
    }

    public location getLocation() {
        return location;
    }

    public void setLocation(location location) {
        this.location = location;
    }

    public int getMinutesLeft() {
        return minutesLeft;
    }

    public void setMinutesLeft(int minutesLeft) {
        this.minutesLeft = minutesLeft;
    }

    public boolean getIsPaying() {
        return isPaying;
    }

    public void setIsPaying(boolean isPaying) {
        this.isPaying = isPaying;
    }

    @Override

    public void tick() {
        minutesLeft--;
    }

    public void setIsMember(){
    	isMember = true; 
    }
    

	public boolean getIsMember(){
		return isMember; 
	}
	

	public void setHasReservation(){
		hasReservation = true; 
	}
	

	public boolean getHasReservation(){
		return hasReservation; 
	}
	

	public void setIsNormalCustomer(){
		isNormalCustomer = true;
	}

	public boolean getIsNormalCustomer(){
		return isNormalCustomer; 
	}


	public int getStayTime(){
		return minutesStay; 
	}

	public int randInt(int max, int min){
	    	Random rand;
	    	rand = new Random();
	    	
	    	int randNum = rand.nextInt(max - min) + min; 
	    	
	    	return randNum;
	    }

}
