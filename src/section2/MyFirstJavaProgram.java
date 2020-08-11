package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	 Robot dale = new Robot();
	 dale.setSpeed(10);
	 dale.penDown();
	 for (int i = 0; i < 4; i++) {
		dale.move(200);
		dale.turn(90);
		dale.move(200);
	 }
		
	}
}
