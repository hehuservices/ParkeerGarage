package views;

import models.logiccarpark;
import models.*;
import java.awt.*;
import javax.swing.*;


public class parkingview extends abstractview{

    private Image carParkImage;
    private Dimension size;
    private JLabel huidigedag;

    /**
     * Constructor creates an instance of the CarParkView.
     * It stores its data to the given model.
     *
     * @param model The model that applies to this view
     */
    public parkingview(logiccarpark model) {
        super(model);
        
        size = new Dimension(0, 0); 
             
    }

    @Override
    /**
     * Scaling the carParkImage.
     */
    public void paintComponent(Graphics g) {
        if (carParkImage == null) {
            return;
        }

        Dimension currentSize = getSize();
        if (size.equals(currentSize)) {
            g.drawImage(carParkImage, 0, 0, null);
        }
        else {
            // Rescale the previous image.
            g.drawImage(carParkImage, 0, 0, currentSize.width, currentSize.height, null);
        }
    }

    /**
     * Notify the model that applies to the view that the view should be updated.
     * Creating a visual representation of the car park with cars entering and leaving
     * when updateView() is called.
     */
    public void updateView() {

    	logiccarpark carPark = (logiccarpark) super.model;
        
        // Create a new car park image if the size has changed.
        if (!size.equals(getSize())) {
            size = getSize();
            carParkImage = createImage(size.width, size.height);
        }

        Graphics graphics = carParkImage.getGraphics();


        for (int floor = 0; floor < carPark.getNumberOfFloors(); floor++) {
            for (int row = 0; row < carPark.getNumberOfRows(); row++) {
                for (int place = 0; place < carPark.getNumberOfPlaces(); place++) {
                    location location = new location(floor, row, place);
                    car car = carPark.getCarAt(location);
                    

                    Color color = Color.WHITE;
                    if (car == null) {
                    	color = Color.WHITE;
                    } else if(car instanceof passholder) {
                    	color = Color.YELLOW;
                    } else if(car instanceof reservation){
                    	color = Color.BLUE; 
                    } else {
                    	color = Color.RED;
                    }
                    drawPlace(graphics, location, color);
                }
            }
        }


        setVisible(true);
        super.updateView();
    }

    /**
     * Paint a parking spot on the screen in a given color.
     */
    private void drawPlace(Graphics graphics, location location, Color color) {
        graphics.setColor(color);
        graphics.fillRect(
                (location.getFloor() * 260 + (1 + (int) Math.floor(location.getRow() * 0.5)) * 60 + (location.getRow() % 2) * 20) -59,
                location.getPlace() * 10 + 30,
                20 - 1,
                10 - 1); 
    }
}
