

//importing the header files
import java.io.FileReader;
import java.util.*;
import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;




class FileUtility
{
	public static void main(String[] args) throws Exception 
	{
		FileReader fr = new FileReader("C:\\Core Java Programs\\Project32\\src\\text.txt");
		//Reading the file
		BufferedReader br = new BufferedReader(fr); 

		List<String> lines1 = new ArrayList<String>();
		String line = null;
		while ((line = br.readLine()) != null)
		{
			lines1.add(line);
		}
		br.close();
		//Convert total file into string of lines
		String[] lines= lines1.toArray(new String[] {}); 
		//Taking the instance player class
		Player[] p= new Player[lines.length];
		for(int k=0;k<lines.length;k++)
		{
			String[] word = lines[k].split(",");
	
				
				String s= word[0];
				String s1=word[1];
				String s2= word[2];
				String s3= word[3];
				String s4= word[4];
				//Passing the values to Constructor
				p[k]=new Player(s,s1,s2,s3,s4);
		}
		
		//Declaring the Path of the file
	  File f1= new File("C:\\Core Java Programs\\Project32\\output.csv");
	  FileWriter fw= new FileWriter(f1);
	  ArrayList<String> li= new ArrayList();
	  for(int i=0;i<lines.length;i++)
	  {
	li.add(p[i].getCapnumber());
	  }
	  int i=0,j=0;
	  //Sorting the list
	  Collections.sort(li);
	  System.out.println(li);
	  boolean flag=true;
	  fw.append("CapNumber"+","+"PlayerName"+","+"Skills"+","+"Country"+","+"MatchesPlayed");
	  fw.append("\n");
//System.out.println("CapNumber"+","+"PlayerName"+","+"Skills"+","+"Country"+";"+"MatchesPlayed");

	//displaying the details in the order of Cap Number
	  while(flag)
	  {
		  if(li.get(i).equals(p[j].getCapnumber()))
		  {
			  fw.append(p[j].getCapnumber()+","+p[j].getPlayername()+","+p[j].getSkill()+","+p[j].getCountry()+","+p[j].getMatchesplayed());  
			  System.out.println(p[j].getCapnumber()+","+p[j].getPlayername()+","+p[j].getSkill()+","+p[j].getCountry()+","+p[j].getMatchesplayed());
			  fw.append("\n");
			  if(i==lines.length-1)
			  {
				  flag=false;
				  fw.close();
				  System.out.println("Data successfully transferred from txt file to csv file");
				  System.exit(0);
			  }
			  j=0;
		i++;
		  }
		  else
		  {
			  j++;
		  }
	  }
	  
	 
	 
	}
}

