package views;
import main.parking;
import models.logiccarpark;
import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import models.*;

public class circelView extends abstractview {
	private int aantalAdHoc;
	private int aantalPassCar;
	private parking parking;
	private int aantalReserved;
	private static circelView circelView;
	public circelView(parkcar parkcar) {
		this.parking = parking;
		
		JPanel circelViewer = new JPanel();
		circelView.setLayout(new FlowLayout());
		circelView.setBackground(Color.WHITE);
		JLabel cars = new JLabel("Auto's");
		circelView.add(circelView);
		this.add(circelView);
		
	}
	
	public void updateView(){

		aantalAdHoc = logiccarpark.getTotalCars()-1;
		aantalPassCar = logiccarpark.getTotalPassHolders()-1;
		aantalReserved = logiccarpark.getTotalReservations()-1;
		repaint();
	}
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 200, 200);
		g.setColor(Color.red);
		g.fillArc(10, 10, 180, 180, 0, aantalAdHoc);
		g.setColor(Color.blue);
		g.fillArc(10, 10, 180, 180, aantalAdHoc, aantalPassCar);
		g.setColor(Color.black);
		g.fillArc(10, 10, 180, 180, aantalAdHoc+aantalPassCar, aantalReserved);

	}	
}