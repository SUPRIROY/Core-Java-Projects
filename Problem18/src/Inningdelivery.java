
import java.util.Scanner;
class Inningdelivery
{
    String delivery[];
    String inning[];
    String result;
    String str;	
    int n ;int m;int a; 
    String[] split1;	
    void inning()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of innings");
        n = sc.nextInt(); 
	inning = new String[n];
        for(int i=0;i<n;i++)
        {
		Scanner sc1 = new Scanner(System.in);
                System.out.println("Enter innings"+" "+(i+1)+" "+"details");
		inning[i]=sc1.nextLine();
		
        }
    }
    void delivery()
    {
	 Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter number of deliveries");
        m = sc2.nextInt(); 
	delivery = new String[m];
        for(int j=0;j<m;j++)
        {
		Scanner sc3 = new Scanner(System.in);
                System.out.println("Enter inning"+" "+(j+1)+" "+"details");
		delivery[j]=sc3.nextLine();
		
        }
    }
   void result()
    {
	 Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter the delivery number for which you need to find the innings number");
        a = sc3.nextInt(); 
	str=String.valueOf(a);  
        for(int k=0;k<m;k++)
        {
		result = delivery[k];
		System.out.println(result);
		split1 = result.split(",");
		for(int c=0;c<split1.length;c++)
		{
		if(split1[c].equals(str))
		{	
		  System.out.println("Innings:"+split1[c+4]);
		}
		}
			
        }
    }
  
}
class DeliveryBo
{
    public static void main(String[] args)
    {
        Inningdelivery inningdelivery = new Inningdelivery();
        inningdelivery.inning();
	inningdelivery.delivery();
	inningdelivery.result();
    }
}