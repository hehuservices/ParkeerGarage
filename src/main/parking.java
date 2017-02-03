package main;

import javax.swing.*;

import control.*;
import models.*;
import views.*;

public class parking {
	private JFrame screen;
	private abstractview parkview;
    private logiccarpark parkcar;
    private abstractcontrol runController;
    private abstractview circelView;

    private int tickPause;
    public static boolean run;
	
	/**
	 * Maakt nieuwe instantie voor Controllers en scherm
	 * Zet de waarden neer voor titels layouts en 
	 */
	public parking() {
		parkcar = new logiccarpark(3, 6, 30);
		runController = new runcontrol(parkcar);
		parkview = new parkingview(parkcar);
		circelView = new circelView(parkcar);
		screen=new JFrame("Design & Build Parkeer Garage");
		
		screen.setSize(800, 500);
		screen.setLayout(null);
		screen.getContentPane().add(circelView);
		screen.getContentPane().add(parkview);
		screen.getContentPane().add(runController);
		
	
		
		
		parkview.setBounds(50, 10, 700, 330);
		runController.setBounds(0, 360, 750, 80);

		screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		screen.setVisible(true);
		 // Load the view
        parkview.updateView();
        run = false;
        tickPause = 500;

        while(true){
            if (run) {
                parkcar.tick();
            }
            try{
                Thread.sleep(tickPause);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

	}
}
