
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		
		Robot rob = new Robot();
		int x = 60;
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.
		rob.setX(x);
		// 2. Make the robot draw a star shape. Hint: 144.
	rob.setSpeed(40);
	rob.penDown();
	rob.setPenColor(244, 235, 66);
	rob.setPenWidth(10);
	rob.setAngle(20);
	for(int j=0; j<10; j++) {
		for(int i=0; i<5; i++) {
	rob.move(50);
	rob.turn(144);
	rob.penDown();
		}
		x=(x+75);
		rob.setX(x);		
	}

// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/RobotWalk
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
