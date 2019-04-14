
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.awt.print.Printable;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "January 24th";
		String dadsBirthday = "June 9th";
		String myBirthday = "November 30th";

		// 2. Find out which birthday the user wants and and store their response in a variable
String hi = 	JOptionPane.showInputDialog(null, "Who's birthday do you want to know? mom's birthday, dad's birthday, or my birthday?");
		// 3. Print out what the user typed
		
		// 4. if user asked for "mom"
		if(hi.equals("moms birthday")) {
			System.out.println(momsBirthday);
		}	
		//print mom's birthday
		// 5. if user asked for "dad"
		else if(hi.equals("dads birthday")) {
			System.out.println(dadsBirthday);
		}	
		
		else if(hi.equals("your birthday"))	{
			System.out.println(myBirthday);
		}
		
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			JOptionPane.showMessageDialog(null, "I don't remember that persons birthday");
		}
	} 
}
