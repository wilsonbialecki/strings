import java.util.Scanner;

public class Donuts {

	public static void main(String[] args)
	{
		for(int i=1; i<=5; i++)
		{
		System.out.println("i love donuts");
		}
	coinFlip();
	}
	static int flipCoin=0;
	public static void coinFlip() 
	{
		Scanner userInput = new Scanner(System.in);
		System.out.println("How many times should I flip a coin.");
		int userChoice= userInput.nextInt();
		int heads= 0;
		int tails= 0;
		for(int w=0; w< userChoice; w++)
		{
			int randomNumber=(int)(Math.random()*2)+1;
			if( randomNumber == 1)
			{
				heads= heads +1;
			}
			else
			{
				tails= tails+1;
			}
		
		}
		System.out.println("You flipped "+heads+" heads");
		System.out.println("You flipped "+tails+" tails");
	}}



