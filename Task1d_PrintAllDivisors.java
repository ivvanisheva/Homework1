import java.util.Scanner;

public class Task1d_PrintAllDivisors {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:  ");
		long y = sc.nextLong(), i;

		System.out.print("Divisors of " + y + " = 1 , ");

		for (i = 2; i < y; i++) {
			long z = y % i;
			if (z != 0)
				continue;
			System.out.print(i + " , ");

		}

		System.out.println(y);

	}

}
