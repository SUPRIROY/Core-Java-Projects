import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

//read data into the file
public class ReadingFile {

	

		public static void main(String[] args)
	    {
	        File file = new File("C:\\Core Java Programs\\Project34\\src\\demo.txt");
	        Scanner sc = new Scanner(System.in);
	        System.out.println("enter start index");
	        int startIndex = sc.nextInt();
	        System.out.println("enter end index");
	        int endIndex = sc.nextInt();
	        StringBuffer sb = new StringBuffer();
	        String line;
	 
	        try {
	            BufferedReader reader = new BufferedReader(new FileReader(file));
	            while ((line = reader.readLine()) != null) {
	                sb.append(line+ " ");
	            }
	            System.out.println(sb.substring(startIndex, endIndex));
	            reader.close();
	        }
	        catch (IOException e) {
	           System.out.println("File not found ");
	        }
	        
	        sc.close();
	    }
}