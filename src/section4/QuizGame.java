package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
 int userscore = 0;
		// 2.  Ask the user a question 
 String answer1;
 answer1 = JOptionPane.showInputDialog("2 + 2 =");
		
		// 3.  Use an if statement to check if their answer is correct
		if(answer1.equals("4")) {
			userscore = +1;
		}	
		else
			userscore = -1;
		JOptionPane.showMessageDialog(null, "You stupid it's 4.");
		// 4.  if the user's answer was correct, add one to their score 
		String answer2;
answer2 = JOptionPane.showInputDialog("Consider 10 days. if someone gave you 1 candy, and every day the candy(ies) clone themselves. how m"
		+ "many candies would you have?");
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
		
	}
}
