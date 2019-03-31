//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot hi = new Robot();
		//3. Ask the user what color they would like the robot to draw
Random r = new Random();
		
hi.setSpeed(30);	
		for(int i = 0; i < 10; i++) {
		String hu =	JOptionPane.showInputDialog(null,"What color do you want the robot to draw?");
	
	//5. Use an if/else statement to set the pen color that the user requested
	hi.setPenWidth(10);
	hi.penDown();		
	 if(hu.equals("red")) { hi.setPenColor(255,0,0);
	hi.turn(100);
	hi.move(100);			
			}
	else if(hu.equals("blue")) {
		hi.setPenColor(0, 0, 255);
		hi.turn(r.nextInt(-200));
		hi.move(r.nextInt(-200));
		}
	
	
	else if(hu.equals("green")) {
		hi.setPenColor(0,255,0);
	hi.turn(r.nextInt(200));
	hi.move(r.nextInt(200));
	}
		
		
		
		//6. If the user doesn’t enter anything, choose a random color
	else {
		hi.setPenColor(r.nextInt(256),r.nextInt(256),r.nextInt(256));
		hi.move(r.nextInt(300));
		hi.turn(r.nextInt(300));
	}
	 //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		
	    //2. Make the robot draw a shape (this will take more than one line of code)


	}
}
}