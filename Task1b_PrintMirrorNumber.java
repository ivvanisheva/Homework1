import java.util.Scanner;

public class Task1b_PrintMirrorNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int i = sc.nextInt(), n;
		while (i > 0) {
			n = i % 10;
			i = (i / 10);
			System.out.print(n);
		}
	}

}
