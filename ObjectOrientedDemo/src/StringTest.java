import java.util.Arrays;
import java.util.Scanner;

public class StringTest {
	public static void main(String args[]) {
		String players = "David, Sean, Will, TJ, Person";
		String[] splitPlayers = players.split(", ");
		System.out.println(Arrays.toString(splitPlayers));
		for(String player : splitPlayers) {
			System.out.println(player);
		}
		int num = splitPlayers.length;
		System.out.println(num);
		int myNum = 5;
		System.out.println(myNum);
		
		
		switch(myNum) {
			case 1:
				System.out.println("It is January");
				break;
			case 2:
				System.out.println("It is February");
				break;
			case 3:
				System.out.println("It is March");
				break;
			default:
				System.out.println("It is not january, february, or march.");
				break;
		}
				
			int test = 10;
			while(test > 0) {
				System.out.println(test);
				test--;
			
		}
			
			
			try {
				Scanner in = new Scanner(System.in);
				System.out.println("Enter a number");
				int number = in.nextInt();
			}
			catch(Exception e){
				System.out.println(e);
			}
			
			
			
	}
}
