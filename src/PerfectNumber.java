import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class PerfectNumber {

	public static void main(String[] args) throws InterruptedException {
		int qt;
		Scanner readQt = new Scanner(System.in);
		Scanner readNumb = new Scanner(System.in);
		Scanner readOp = new Scanner(System.in);
		int sum = 0;
		boolean cont = true;
		int index = 0;
		String option;
		
		System.out.println("How many numbers do you want to enter?");
		qt = readQt.nextInt();
		int[] numbers = new int[qt];
		
		while (cont) {
			
			if (index >= qt) {
				index = 0;
			}
			
			System.out.println("Enter a number: ");
			numbers[index] = readNumb.nextInt();
			
			System.out.println("Do you want to continue? [Y/N]");
			option = readOp.nextLine();
			
			if (option.toUpperCase().equals("N")) {
				cont = false;
				System.out.println("Okay, no other numbers will be entered. Processing...");
				TimeUnit.SECONDS.sleep(10);
			}
			
			index++;
		}
		
		System.out.println("");
		Arrays.sort(numbers);
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 1; j < numbers[i]; j++) {
				if (numbers[i] % j == 0) {
					sum += j;
				}
			}
			
			if (sum == numbers[i]) {
				System.out.println(numbers[i] + ": Is a perfect number");
			} else {
				System.out.println(numbers[i] + ": Is not a perfect number");
			}
			
			sum = 0;
		}
		
		TimeUnit.SECONDS.sleep(5);
			
		
	}
	
}
