package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {

	// 2. Create a new Robot
	Robot rob = new Robot();
	
	void go() {
		rob.hide();
		rob.penDown();
		// 4. Make the robot move as fast as possible
		rob.setSpeed(9999999);
		//999999 is fine who knows how fast I'll make it go
		// 5. Set the pen width to 5
		rob.setPenWidth(5);
		// 6. Use a for loop to repeat steps #7 to #8, four times...
		//Wait isn't that in the drawSquare part ^
		//where
		for (int i = 0; i < 4; i = i + 1 ) {
			// 7. Set the pen color to random
			rob.setRandomPenColor();
			// 1. Call the drawSquare() method
			drawSquare();
			//okay. I think I did everything though.
			
			// 8. Turn the robot 90 degrees to the right
			rob.turn(90);
		}
		
		}

	
	void drawSquare() {
		//JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		/* 3. Fill in the code to draw a square inside the method below. */
		for (int i = 0; i < 4; i = i + 1 ) {
		rob.move(50);
		rob.turn(90);
		}
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



