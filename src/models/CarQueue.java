package models;
import java.util.LinkedList;
import java.util.Queue;

public class CarQueue extends abstractmodel {
    private Queue<car> queue = new LinkedList<>();

    /**
     * Checking whether a Car object has been added to the specified Queue.
     * @param Car added to the specified Queue
     * @return true or false Returns true if the car is successfully added to the specified Queue,
     * 						returns false if the car was not successfully added.
     */
    public boolean addCar(car car) {
        return queue.add(car);
    }

    /**
     * Removing a Car object from the specified Queue.
     * @return Car from the specified Queue
     */
    public car removeCar() {
        return queue.poll();
    }
    
    /**
     * Count the Cars in the specified Queue.
     * @return int Return the number of cars currently stored in the specified Queue.
     */
    public int countCars(){
        return queue.size();
    }

}
