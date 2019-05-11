import java.util.Scanner;

public class Task0d_ReadNNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = sc.nextInt();
		int b = 1;
		do {
			System.out.println(b++);
		} while (b <= a); 
		
		sc.close();
		
		}
	}


