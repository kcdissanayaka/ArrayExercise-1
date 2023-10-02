import java.util.Scanner;
public class Quis2 {

	public static void main(String[] args) {
		
		String [] myStringArray = {	"Actions speak louder than words.",
									"A barking dog never bites.",
									"A penny saved is a penny earned.",
									"All things come to those who wait."};
		
		Scanner console = new Scanner(System.in);
		
		System.out.println("Pick number from 1-4.");
		int userInput = console.nextInt();
		
		if (userInput==1) {
			
			System.out.println(myStringArray[0]);
			
		} else if (userInput==2) {
			
			System.out.println(myStringArray[1]);
		} else if (userInput==3) {
			
			System.out.println(myStringArray[2]);
		} else {System.out.println(myStringArray[3]);}
		
		

	}

}
