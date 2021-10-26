package project27;

import java.util.Scanner;

public class ExceptionHandling {

@SuppressWarnings("resource")
public static void main(String[] args) {

//Scanner class to take the input from user
Scanner sc=new Scanner(System.in);


System.out.println("Enter the total runs scored:");
String runs=sc.next();

//Using try block to check whether it is integer or not  if not throw Number format exception
try {
Integer.parseInt(runs);
}
//catch block to catch that exception and print it here
catch(NumberFormatException e) {
System.out.println(e);
System.exit(0);
}
System.out.println("Enter the total overs faced:");

String overs=sc.next();
//Using try block to check whether it is integer or not  if not throw Number format exception
try {
Integer.parseInt(overs);
}
//catch block to catch that exception and print it here
catch(NumberFormatException e) {
System.out.println(e);
System.exit(0);

}


float runRate= (float)Integer.parseInt(runs)/Integer.parseInt(overs);

//Using try block to check whether it is infinity or not  if yes throw Arithmetic exception
try {
   
    if(runRate==Double.POSITIVE_INFINITY || runRate==Double.NEGATIVE_INFINITY)
    {
    throw new ArithmeticException();
   

    }
}

//catch block to catch that exception and print it here
catch(ArithmeticException ae)
{
System.out.println(ae);
System.exit(0);
}
finally
{
System.out.println("Current Run Rate:"+runRate);
}
sc.close();
}

}
