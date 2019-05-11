import java.util.Scanner;

public class Task0c_ReadAge {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:");
		byte a = sc.nextByte(); 
			if( a < 18) { 
			System.out.println("You are a minor."); 
		} else {
			System.out.println("You are an adult.");
			
		sc.close();
		}
		 
	}
}


