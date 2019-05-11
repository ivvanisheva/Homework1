import java.util.Scanner;

public class Task0b_ReadLine {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String a = sc.nextLine();
		
		System.out.println(a);
		
		sc.close();
	}

}
