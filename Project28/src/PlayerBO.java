

import java.util.Scanner;

public class PlayerBO {
	
	public static void main(String[] args) {
		
		String capName;
		String capCountry;
		String capSkill;
		String dec;
		System.out.println("Enter Number of players:");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		//Using try block to check whether it is infinity or not  if yes throw NullPointer exception
		try
		{
			System.out.println("Do you know the details of the captain. Type yes/no:");
			   dec=sc.next();
			if(dec.equals("no"))
			{
				 throw new NullPointerException();
				 
				
			}
			
			else if(dec.equals("yes"))
			{
				System.out.println("Enter Name of the captain:");
			 capName=sc.next();
				System.out.println("Enter Country of the captain:");
				 capCountry=sc.next();
				System.out.println("Enter Skill of the captain:");
				 capSkill=sc.next();
				 
				 System.out.println("Player Details:");
				//Taking the instance of Player class and passing values to parameterised constructor
				 Player[] p1=new Player[num];
					for(int i=0;i<num;i++)
					{
						
						//Inputting the Values of Players
						System.out.println("Enter name of player "+(i+1));
						String name1=sc.next();
						
						System.out.println("Enter country player "+(i+1));
						String country1=sc.next();
						
						System.out.println("Enter skill of player "+(i+1));
						String skill1=sc.next();
						//passing values to constructor
						p1[i]= new Player(name1,country1,skill1);
					}
					System.out.println("Captain Details:");
					System.out.println(capName+" "+capCountry+" "+capSkill);
					System.out.println("Player Details:");
					for(int i=0;i<num;i++)
					{
						
						System.out.println(p1[i].getName()+" "+p1[i].getCountry()+" "+p1[i].getSkill());
						
					}
			}
		}
		//catch block to catch that exception and print it here
		catch(NullPointerException np)
		{
			
			 System.out.println("Player Details:");
			 
			 //Taking the instance of Player class and passing values to parameterised constructor
			 Player[] p1=new Player[num];
				for(int i=0;i<num;i++)
				{
					//Inputting the Values of Players
					System.out.println("Enter name of player "+(i+1));
					String name1=sc.next();
					
					System.out.println("Enter  country of player"+(i+1));
					String country1=sc.next();
					
					System.out.println("Enter skill of player "+(i+1));
					String skill1=sc.next();
					
					p1[i]= new Player(name1,country1,skill1);
				}
				//Printing the type of Exception
				System.out.println(np);
				System.out.println("Captains Details not available");
				System.out.println("Player Details:");
				for(int i=0;i<num;i++)
				{
					
					System.out.println(p1[i].getName()+" "+p1[i].getCountry()+" "+p1[i].getSkill());
					
				}
		}
		}
		
	
		
		
		
	}


