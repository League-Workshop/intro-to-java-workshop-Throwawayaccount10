package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot rob = new Robot();
	//how do I make it wait so I don't immediately crash
	//and also a while loop
	rob.setSpeed(20000);
	rob.hide();
	
	int red = 100;
	int x = 1;
	//int green = 200;
	//int blue = 11;
	while(red == 100) {
	
	rob.penDown();
	rob.turn(x);
	rob.move(x);
	rob.setPenColor(0,0,0);
	//red = red + 1;
	//green = green + 1;
	//blue = blue + 1;
	x = x + 1;
	rob.setRandomPenColor();
	}
	rob.sparkle();
	
	}
}
