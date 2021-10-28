import java.io.*;
import java.io.FileReader;
import java.util.*;


class IdentifyPatterns 
{
     
    //Calculate the frequency of the searched string in the text file
	int countfrequency(String whole,String searched)
	{
		int m=whole.length();
		int c=searched.length();
		
		int count=0;
		for(int i=0;i<=m-c;i++)
		{
			if((whole.substring(i,i+c)).equals(searched))
			{
				count++;
			}
		}
		return count;//returns count of searched string in the text file
	}
	

public static void main(String args[])throws IOException
{
	String str="";
	
 //The words to be searched are taken as input using BufferedReader 

        BufferedReader ob= new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter number of words");
	int n=Integer.parseInt(ob.readLine());
	String s1[]= new String[n];
	for(int i=0;i<n;i++)
	{
	System.out.println("Enter words to be searched:");
	s1[i]=ob.readLine();
	}

      //Handling file not found exception occured
	try
	{
	BufferedReader br= new BufferedReader(new FileReader("team"));
	str= br.readLine();
	}
	catch(FileNotFoundException e)
	{
		System.out.println(e);
	}

//prints the word searched and frequency calling countfrequency() method
	for(int j=0;j<n;j++)
	{
		IdentifyPatterns obj= new IdentifyPatterns();
		System.out.println("Word:"+s1[j]+" "+"Count:"+obj.countfrequency(str, s1[j]));
}
}
}