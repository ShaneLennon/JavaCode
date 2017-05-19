/*
 * A simple dice game is played with two dice (store that 
 * values in two variables). For a normal dice throw, the 
 * amount of points you get will be calculated by multiplying 
 * the eyes from each dice, i.e. a throw of 4 and 2 would 
 * give you 8 points. There are some exceptions to this rule:
 * 
 * � 6 is a special number: Whenever at least one 6 is 
 *     thrown, the sum of the eyes will be used instead of 
 *     the multiplication.
 * � 3 is your lucky number: For each 3, you will get 10 
 *     bonus points.
 * � 5 is your unlucky number: For each 5, your score will 
 *     be decreased by 4 points.
 */
package sheet3ControlFlow;

import java.util.Random;

public class Ex14DiceGame2 {

	public static void main(String[] args) {
		/* Use Math.random() and the Random class to 
		 * get the values for each die.
		 */
		int die1 = (int)(Math.random() * 6) + 1;
		int die2 = new Random().nextInt(6) + 1;
		int score = 0;
		System.out.printf("die 1: %d\ndie 2: %d\n", die1, die2);
		
		if (die1 == 6 || die2 == 6) {
			score = die1 + die2;
		} else {
			score = die1 * die2;
		}
		
		if (die1 == 3)
			score += 10;
		else if (die1 == 5)
			score -= 4;
		
		if (die2 == 3)
			score += 10;		
		else if (die2 == 5)
			score -= 4;
		
		System.out.println("Score: " + score);
	}
}