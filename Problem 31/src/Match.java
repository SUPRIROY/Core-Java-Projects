import java.io.FileReader;
import java.util.*;
import java.io.*;

class Match
{
private String teamOne;
private String teamTwo;
private String venue;
private String matchDate;

public void setTeamone(String teamOne)
{
this.teamOne=teamOne;
}
public void setTeamtwo(String teamTwo)
{
this.teamTwo=teamTwo;
}
public void setVenue(String venue)
{
this.venue=venue;
}
public void setMatchdate(String matchDate)
{
this.matchDate=matchDate;
}
public String getTeamone()
{
return teamOne;
}
public String getTeamtwo()
{
return teamTwo;
}
public String getVenue()
{
return venue;
}
public String getMatchdate()
{
return matchDate;
}

public void displayMatch(ArrayList<String> team1,ArrayList<String> team2,ArrayList<String> ven,ArrayList<String> mdate)
{
System.out.println("The Match Details are :");
int n= team1.size();
for(int i=0;i<n;i++)
{
int x= i+1;
System.out.println("Match"+" "+ x);
System.out.println("Teamone: "+ " "+team1.get(i));
System.out.println("Teamtwo: "+ " "+team2.get(i));
System.out.println("Venue: "+ " "+ven.get(i));
System.out.println("MatchDate: "+ " "+mdate.get(i));
}
}

}

class Main
{
public static void main(String[] args) throws Exception
{
File file = new File("C:\\Core Java Programs\\Problem 31\\src\\text.txt");

BufferedReader br = new BufferedReader(new FileReader(file)); //Reading the file

List<String> lines1 = new ArrayList<String>();
String line = null;
while ((line = br.readLine()) != null)
{
lines1.add(line);
}
br.close();
String[] lines= lines1.toArray(new String[] {}); //To convert the list to array of string to store the information of Match
ArrayList<String> team1 = new ArrayList<String>(); //Creating different list for storing the information of the team and venue and Matchdate
ArrayList<String> team2 = new ArrayList<String>();
ArrayList<String> ven = new ArrayList<String>();
ArrayList<String> mdate = new ArrayList<String>();
for(int k=0;k<lines.length;k++)
{
String[] word = lines[k].split("\\s");
for(int j=0;j<word.length;j++)
{
Match m = new Match();
m.setTeamone(word[j]);
m.setTeamtwo(word[j+1]);
m.setVenue(word[j+2]);
m.setMatchdate(word[j+3]);
String s= m.getTeamone();
String s1=m.getTeamtwo();
String s2= m.getVenue();
String s3= m.getMatchdate();
team1.add(s);
team2.add(s1);
ven.add(s2);
mdate.add(s3);
m=null;
j=word.length;
}
}
Match fin = new Match();
fin.displayMatch(team1,team2,ven,mdate); //Passing the details to display method
}
}