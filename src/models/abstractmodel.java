
package models;

import views.*;
import java.util.*;

public abstract class abstractmodel {
	private List<abstractview> views;
	
	/**
	 * hold views
	 */
	public abstractmodel() {
		views=new ArrayList<abstractview>();
	}
	
	/**
	 adds a view  to the ArrayList.
	*/
	public void addView(abstractview view) {
		views.add(view);
	}
	
	/**
	 * updates the views
	 */
	public void notifyViews() {
		for(abstractview v: views) v.updateView();
	}
	
	/**
	 * Empty method used to be overridden
	 */
	public void tick() {
	}
}