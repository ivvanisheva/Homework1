import java.util.Scanner;

public class Task1a_PrintFirstDigit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a, fa;
		sc = new Scanner(System.in);
		System.out.print("Please enter a number:");
		a = sc.nextInt();
		fa = a;
		while (fa >= 10) {
			fa = fa / 10;
		}

		System.out.println("The first digit is " + fa + ".");
	}

}
