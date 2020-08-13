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
			userscore += 1;
			JOptionPane.showMessageDialog(null, "Correct.");
		}	
		else {
			userscore -= 1;
		JOptionPane.showMessageDialog(null, "You stupid it's 4.");}
		// 4.  if the user's answer was correct, add one to their score 
		String answer2;
answer2 = JOptionPane.showInputDialog("Consider 10 days. If someone gave you 1 candy, and every day the candy(ies) cloned themselves, how "
		+ "many candies would you have?");
if(answer2.equals("512")){
	userscore += 1;
	 JOptionPane.showMessageDialog(null, "Correct again.");
}
else {
	userscore -= 1;
	JOptionPane.showMessageDialog(null, "It's ok, that was hard.");
}
	
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
	String answer3;
	answer3 = JOptionPane.showInputDialog("Here's a story : there's a fox, a lion and a wolf inside a lunar crater." + "The fox is about to bite the lion, which is about to bite the wolf, which is about to bite the fox." + "It's snowing and a shrub is watching the scene." + "Who's enjoying the story?");
	if(answer3.equals("me")){
	userscore += 2;
	JOptionPane.showMessageDialog(null, "That was really hard, wasn't it?");
	}
	else {
		userscore -= 1;
				JOptionPane.showMessageDialog(null, "Wrong");}
	JOptionPane.showMessageDialog(null, "you're score is " + userscore + " out of 4!");
	
	}
	// 6. After all the questions have been asked, print the user's score

}
