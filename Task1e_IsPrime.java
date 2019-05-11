import java.util.Scanner;

public class Task1e_IsPrime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = sc.nextInt();
		
		switch (a) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
			System.out.println(a + " is a prime number."); break;
		default:
			System.out.println(a + " is not a prime number.");
		
		}

		
	}
}
