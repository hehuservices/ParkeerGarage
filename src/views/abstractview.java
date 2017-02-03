package views;

import models.*;

import javax.swing.*;

public abstract class abstractview extends JPanel {

	protected abstractmodel model;

    /**
     * The constructor initializes the instance variable model with a model that applies to this view.
	 * 
     * @param model The model that applies to this view
     */
    public abstractview(abstractmodel model) {
        this.model = model;
        model.addView(this);
    }
	
    /**
     * @return model Returns the model that belongs to this view
     */
	public abstractmodel getModel() {
		return model;
	}
	
	/**
	 * Makes sure that when the view is updated, it will not be painted over the last painted view
	 * but the View will first be cleared and then repainted with the updates.
	 */
	public void updateView() {
		repaint();
	}
}
