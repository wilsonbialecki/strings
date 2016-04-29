import java.util.Scanner;

public class IntrotoStrings
	{

		public static void main(String[] args)
			{
				insideVoice();
				print();
				counter();
			}
		public static void insideVoice()
			{
				Scanner userInput=new Scanner(System.in);
				System.out.println("Yell at me about something!!!!");
				String name=userInput.nextLine();	
				
				 String Input =  name.toLowerCase();
				 
				 System.out.println("You should have said "+ Input.substring(0,1).toUpperCase()+ Input.substring(1));
				 

			}
		public static void print()
		{
			Scanner userInput=new Scanner(System.in);
			System.out.println("Type a word");
			String print=userInput.nextLine();
			for(int i=0; i< print.length();i++)
			{
				System.out.println(print.substring(i,i+1));
				
			}
		}
		public static void counter()
		{
			Scanner userInput=new Scanner(System.in);
			System.out.println("Type a sentence");	
			String word=userInput.nextLine();
		int sum=0;
		for(int i=0; i< word.length(); i++)
			{	
		switch(word.substring(i,i+1))
			{
				case "a":
				case "A":
				case "e":
				case "E":
				case "i":
				case "I":
				case "o":
				case "O":
				case "u":
				case "U":
						{
							sum=sum+1;
							break;
						}
						
				}
		
				}
		if (sum == 1)
			{
				System.out.println("There is "+ sum + " vowel in your sentence.");
			}
		else
			{
				System.out.println("There are "+ sum + " vowels in your sentence.");
			}
		}
	}
	
