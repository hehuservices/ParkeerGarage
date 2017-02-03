package control;

import javax.swing.*;

import models.*;

/**
 * All controllers should extend AbstractController.
 * Initializes the variable model with a CarParkLogic object.
 */
public abstract class abstractcontrol  extends JPanel {
	protected abstractmodel model;
	
	/**
	 * The constructor initializes the instance variable model with a model that applies to this controller.
	 * @param model Model life is ascribed to the instance variable life
	 */
	public abstractcontrol (abstractmodel model) {
		this.model = model;
	}
}
