import java.util.Scanner;

public class Permutation {


	public static void main(String[] args)  
    {  
        int n, r, per, fact1, fact2;  
        Scanner sc =  new Scanner(System.in);  
        System.out.print("Enter the Value of n : ");  
        n = sc.nextInt(); 
        System.out.print("Enter the Value of r : ");
        r = sc.nextInt();  
        fact1 = n;  
        for (int i = n - 1; i >= 1; i--)  
        {  
            fact1 = fact1 * i;  
        }  
        int number;  
        number = n - r;  
        fact2 = number;  
        for (int i = number - 1; i >= 1; i--)  
        {  
            fact2 = fact2 * i;  
        }  
        per = fact1 / fact2;  
        System.out.println("nPr = "+per);  
}  

}

