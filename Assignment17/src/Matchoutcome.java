import java.util.Scanner;
class Matchoutcome
{
    String matchdate[];
    String teamone[];
    String teamtwo[];	
    String venue[];
    String status[];
    String winnerteam[];
 	
    String outcomestatus;
    String outcomewinnerteam;
    String str1;
    String str2;
    String result1;
    String result2;					
    int n ;
    void matches()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of matches");
        n = sc.nextInt(); 
	matchdate = new String[n];
	teamone = new String[n];
	teamtwo = new String[n];
	venue = new String[n];
	status = new String[n];
	winnerteam = new String[n];
        for(int i=0;i<n;i++)
        {
		Scanner sc1 = new Scanner(System.in);
                System.out.println("Enter match"+" "+(i+1)+" "+"details");
		System.out.println("Enter match date");
		matchdate[i]=sc1.nextLine();
		System.out.println("Enter team one");
		teamone[i]=sc1.nextLine();
		System.out.println("Enter team two");
		teamtwo[i]=sc1.nextLine();
		System.out.println("Enter venue");
		venue[i]=sc1.nextLine();
		System.out.println("Enter status");
		status[i]=sc1.nextLine();
		System.out.println("Enter winner team");
		winnerteam[i]=sc1.nextLine();
		
        }
    }
	
    void mdetail()
    {
	System.out.println("Match Details");
	
		String s1=String.format("%-15s","Date");
                String s2=String.format("%-15s","Team One");
                String s3=String.format("%-15s","Team Two");
		String s4=String.format("%-15s","Venue");
		String s5=String.format("%-15s","Status");
		String s6=String.format("%-15s","Winner");
                System.out.println(s1+s2+s3+s4+s5+s6);
		for(int j=0;j<n;j++)
       		 {
                String s7=String.format("%-15s",matchdate[j]);
                String s8=String.format("%-15s",teamone[j]);
                String s9=String.format("%-15s",teamtwo[j]);
		String s10=String.format("%-15s",venue[j]);
		String s11=String.format("%-15s",status[j]);
		String s12=String.format("%-15s",winnerteam[j]);
		System.out.println(s7+s8+s9+s10+s11+s12);
        	}
    }	
    void mdetailos()
	{
		System.out.println("Enter outcome status");
		Scanner sc3 = new Scanner(System.in);
		outcomestatus=sc3.nextLine();
		str1=outcomestatus.trim();
		System.out.println("Match Details");

		
		String sos1=String.format("%-15s","Date");
                String sos2=String.format("%-15s","Team1");
                String sos3=String.format("%-15s","Team2");
		String sos4=String.format("%-15s","Venue");
		String sos5=String.format("%-15s","Status");
		String sos6=String.format("%-15s","Winner");
                System.out.println(sos1+sos2+sos3+sos4+sos5+sos6);

		
			for(int d=0;d<status.length;d++)
			{
					if(status[d].equals(str1))
					{	
						String sos7=String.format("%-15s",matchdate[d]);
               					String sos8=String.format("%-15s",teamone[d]);
                				String sos9=String.format("%-15s",teamtwo[d]);
						String sos10=String.format("%-15s",venue[d]);
						String sos11=String.format("%-15s",status[d]);
						String sos12=String.format("%-15s",winnerteam[d]);
						System.out.println(sos7+sos8+sos9+sos10+sos11+sos12);
					}
			
			}
		
	}
	void mdetailowt()
	{
		System.out.println("Enter outcome winner team");
		Scanner sc4 = new Scanner(System.in);
		outcomewinnerteam=sc4.nextLine();
		str2=outcomewinnerteam.trim();
		System.out.println("Match Details");

		String sowt1=String.format("%-15s","Date");
                String sowt2=String.format("%-15s","Team1");
                String sowt3=String.format("%-15s","Team2");
		String sowt4=String.format("%-15s","Venue");
		String sowt5=String.format("%-15s","Status");
		String sowt6=String.format("%-15s","Winner");
                System.out.println(sowt1+sowt2+sowt3+sowt4+sowt5+sowt6);

		
			for(int e=0;e<winnerteam.length;e++)
			{
					if(winnerteam[e].equals(str2))
					{	
						String sowt7=String.format("%-15s",matchdate[e]);
               					String sowt8=String.format("%-15s",teamone[e]);
                				String sowt9=String.format("%-15s",teamtwo[e]);
						String sowt10=String.format("%-15s",venue[e]);
						String sowt11=String.format("%-15s",status[e]);
						String sowt12=String.format("%-15s",winnerteam[e]);
						System.out.println(sowt7+sowt8+sowt9+sowt10+sowt11+sowt12);
					}
			
			}
		
	}				
}
class MatchBo
{
    public static void main(String[] args)
    {
        Matchoutcome matchoutcome = new Matchoutcome();
        matchoutcome.matches();
	
	for(int i=0;i<4;i++)
	{
	System.out.println("Menu:");
	System.out.println("1.View match details");
	System.out.println("2.Filter match details with outcome status");
	System.out.println("3.Filter match details with outcome winner team");
	System.out.println("4.Exit");
	System.out.println("Enter your choice");
	Scanner sc2 = new Scanner(System.in);
	int m=sc2.nextInt();
	switch(m)
	{
   		 case 1:
       		 	matchoutcome.mdetail();
		        break;
    		 case 2:
			matchoutcome.mdetailos();
                        break;
		 case 3:
			matchoutcome.mdetailowt();
			break;
   		 case 4:		
			System.exit(0);
			break;
		default:
			System.out.println("Invalid Input!");
	}
        }
    }
}