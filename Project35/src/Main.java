import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
    try (PrintWriter writer = new PrintWriter("player.csv")) {
        StringBuilder sb=new StringBuilder();

        System.out.println("Enter the Player Name");
        String name=sc.nextLine();

        System.out.println("Enter the Team name");
        String team=sc.nextLine();

        System.out.println("Enter number of matches played");
        int played=sc.nextInt();

        sb.append("Player Name:"+name+",Team:"+team+",Number of matches:"+played);
        

        writer.write(sb.toString());

        System.out.println("INPUT DATA IS SAVED IN PLAYER.CSV");
    }catch(FileNotFoundException e){
        System.out.println(e.getMessage());


    }
  }}