import java.util.Scanner;

public class asknumbers {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("pick two numbers, a big and a small");
		int sum=0;
		int choice =  userInput.nextInt();
		int counter= userInput.nextInt();
		for(int i= choice; i<=counter; i++ )
		{
		sum= sum + i;
		
		}
		System.out.println(sum);
		}

	}


