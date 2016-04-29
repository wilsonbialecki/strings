import java.util.Scanner;

public class comfortstrings
	{
		static String userSent;
		public static void main(String[] args)
		{
			greeting();
			spaces();
			report();
			MHSprint();
			
		}
		public static void greeting()
		{
			Scanner userInput=new Scanner(System.in);
			System.out.println("What is your name?");
			String name=userInput.nextLine();
			int randomNumber=(int)(Math.random()*3);
			String [] compliments= {"You look amazing today!!", "You sound like a movie star!", "You sound very nice today!"};
			System.out.println(name+", " + compliments[randomNumber]);
			}
		public static void spaces()
		{
			Scanner userInput=new Scanner(System.in);
			System.out.println("Type a sentences with at least five words with no punctuation");
			userSent =userInput.nextLine();
		} 
		public static void report()
			{
				int sum=0;
				int letters=0;
				int vowels=0;
				int cons=0;
				for(int i=0; i< userSent.length(); i++)
					{	
				switch(userSent.substring(i,i+1))
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
				for (int i= 0; i<userSent.length(); i++)
					{
						letters=letters+1;
						switch(userSent.substring(i,i+1))
						{
							case " ":
									{
										vowels= vowels-1;
									}
									default:
									{
										vowels=vowels+1;
									}
									
						}
						switch(userSent.substring(i,i+1))
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
							case " ":
									{
										cons=cons-1;
									}
							default:
									{
										cons=cons+1;
									}
									
						}
						
					}
				System.out.println("There are " +letters +" characters in your sentence.");
				System.out.println("There are " +vowels +" letters in your sentence.");
				System.out.println("There are " +cons +" consonants in your sentence.");
				}
			
		public static void MHSprint()
			{
				String rank= "Mullen High School";
			
				
				for (int i= 0; i<rank.length(); i++)
					{
				System.out.println(rank.substring(0,i+1));
					}
					}
		
	}
