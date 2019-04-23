import java.util.Scanner;

public class DigitCalculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		String num = sc.nextLine();
		int answer = 0;

		while (num.length() != 1) {

			answer = 0;

			for(int i = 0; i < num.length(); i++) {
			    answer += Character.digit(num.charAt(i), 10);

			    System.out.println("Adding + " + num.charAt(i));
			}

			num = answer + "";
			System.out.println("Answer so far: " + answer);

		}

		System.out.println("Added together: " + num);

	}

}
