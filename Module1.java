import java.util.Random;
import java.util.Scanner;

	public class Module1 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int randomInt = random.nextInt(10);
		
		System.out.println("Please guess a number you have 5 attempts = ");
		int guess = scanner.nextInt();
		for(int i = 0;i < 5; i++){
			
			if (guess < randomInt) {
				System.out.println("Too low, try again. ");
				guess = scanner.nextInt();
			}else if(guess > randomInt) {
				System.out.println("Too high, try again. ");
				guess = scanner.nextInt();
			}else {
			System.out.println("Congratulations! You've guessed the correct number");
			return;
			}
		}
		System.out.println("Sorry you didn't guess correctly the number was " + randomInt);
		scanner.close();
	}

}