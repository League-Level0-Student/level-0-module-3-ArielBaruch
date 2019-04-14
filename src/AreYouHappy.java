import javax.swing.JOptionPane;

public class AreYouHappy {
public static void main(String[] args) {
	

String k = JOptionPane.showInputDialog(null, "Are You Happy?");
 if(k.equals("yes")) {
	 JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing");
 }
 else if(k.equals("no")) {
	String o = JOptionPane.showInputDialog(null, "Do you want to be happy?");
	  
	if(o.equals("yes")) {
		 JOptionPane.showMessageDialog(null, "Change Something!");
	 }
	 else if(o.equals("no")) {
		 JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing");
	 }

 }











}




























}
