
	import java.util.Scanner;

	public class ClassMain {

		public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter the total runs scored");
			int totalRun=scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter the total over faced");
			int totalOver=scanner.nextInt();
			scanner.nextLine();
			
			try {
				if(totalOver>=20) {
					throw new OverRangeException();
				}else {
					float runRate=totalRun/totalOver;
					System.out.println("Current Run Rate:"+runRate);

				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	 class OverRangeException extends Exception{
		 OverRangeException(){
			 super("Over is not the specified range");
		 }
		
	}
