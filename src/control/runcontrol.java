package control;

import main.*;
import models.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class runcontrol  extends abstractcontrol implements ActionListener {

	private JButton volgendeStap;
	private JButton volgendeStappen;
	private JButton start;
	private JButton stop;

	/**
	 * Creates buttons and frame
	 */
	public runcontrol(logiccarpark carPark) {
		super(carPark);
		setSize(450, 50);
		
		/*Button voor enkele stap*/
		volgendeStap = new JButton("1 stap");
		volgendeStap.addActionListener(this);
		volgendeStap.setBackground(Color.BLUE);
		volgendeStap.setOpaque(true);
		
		/*button voor meerdere stappen*/
		volgendeStappen = new JButton("1000 stappen");
		volgendeStappen.addActionListener(this);
		volgendeStappen.setBackground(Color.BLUE);
		volgendeStappen.setOpaque(true);
		
		/*Button voor het starten van het parkeren*/
		start = new JButton("Start");
		start.addActionListener(this);
		start.setBackground(Color.GREEN);
		start.setOpaque(true);
		
		/*Button voor het stoppen van het parkeren*/
		stop = new JButton("Stop");
		stop.addActionListener(this);
		stop.setBackground(Color.RED);
		stop.setOpaque(true);
	
		this.setLayout(null);
		add(volgendeStap);
		add(volgendeStappen);
		add(start);
		add(stop);
		volgendeStappen.setBounds(405, 10, 120, 30);
		volgendeStap.setBounds(555, 10, 100, 30);
		start.setBounds(40, 10, 120, 30);
		stop.setBounds(170, 10, 120, 30);
		setVisible(true);
	}
	


	@Override
	/**
	 * Making the buttons and text field of this controller react to input of the user.
	 * Saving the input to the model carPark.
	 */
	public void actionPerformed(ActionEvent e) {
		logiccarpark carPark = (logiccarpark) super.model;
		
		if (e.getSource() == volgendeStap) {
			try {
				carPark.tick();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			return;
		}
		if (e.getSource() == volgendeStappen) {
			try {
				carPark.tick();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			return;
		}
		if (e.getSource() == start) {
			parking.run = true;
		}
		
		if (e.getSource() == stop) {
			parking.run = false;
		}
		
	}
	

}
