package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	 Robot austin = new Robot();
	 austin.setSpeed(100);
	 austin.penDown();
	 for (int i = 0; i < 15; i++) {
		austin.move(50);
		austin.turn(15);
	 }
		
	}
}
