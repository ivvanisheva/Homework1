import java.util.Scanner;

public class Task0e_ReadNNumbersOnNewLines {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = sc.nextInt();
		int b = 1;
		do {
			System.out.print(b++ + " ");
		} while (b <= a);

		sc.close();

	}

}
