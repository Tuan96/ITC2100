/**
 * Create a Hangman game.
 * @author Tony
 */
import java.util.Scanner;

public class SecretPhrase {

	private static final String[] secretword = {"incredible","windows","linux"};
	private static final String word = secretword[(int) (Math.random() * secretword.length)];
	private static String asterisk = new String(new char[word.length()]).replace("\0", "*");
	private static int count = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

                System.out.println("Hi. Let's play a quick game. This is a simple version of the 'Hangman' game.");
                System.out.println("You have a total of 8 guesses. Please type the letter here whenever you are ready:");
                
		while (count < 8 && asterisk.contains("*")) { 
                        System.out.println("Guess any letter in the word");
			System.out.println(asterisk);
			String guess = sc.next();
			hang(guess);
		}
		sc.close();
	}

	public static void hang(String guess) {
		String newasterisk = "";
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == guess.charAt(0)) {
				newasterisk += guess.charAt(0);
			} 
                        
                        else if (asterisk.charAt(i) != '*') {
				newasterisk += word.charAt(i);
			} 
                        
                        else {
				newasterisk += "*";
			}
                        
		}

		if (asterisk.equals(newasterisk)) {
			count++;
                        guess();
		} 
                
                else {
			asterisk = newasterisk;
		}
                
		if (asterisk.equals(word)) {
                        System.out.println("________________________________________________");
			System.out.println("CONGRATULATIONS!"
                                + "\n" + "The correct word is " + word + ".");
                        
		}
                
	}

	public static void guess() {
            
		if (count == 1) {
			System.out.println("Wrong guess, try again");
		}
                
		if (count == 2) {
			System.out.println("Wrong guess, try again");
		}
                
		if (count == 3) {
			System.out.println("Wrong guess, try again");
		}
                
		if (count == 4) {
			System.out.println("Wrong guess, try again");
		}
                
		if (count == 5) {
			System.out.println("Wrong guess, try again");
		}
                
		if (count == 6) {
			System.out.println("Wrong guess, try again");
                }
                        
                if (count == 7) {
			System.out.println("Wrong guess, try again");
              
		}
                
		if (count == 8) {
                        System.out.println("_______________________________________________");
			System.out.println("GAME OVER!");
			System.out.println("The correct word was " + word + ".");
                        
		}
                
	}
        
    }
       