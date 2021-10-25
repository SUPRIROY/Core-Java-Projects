

	import java.util.Scanner;
	public class PersonalFinancialApp { public static void main(String[] args) {
	//User Input
	Scanner salary=new Scanner(System.in);
	System.out.println("Enter Your income this month :");
	String s = salary.next();
	double income = Double.parseDouble(s);
	//create setters for the given data
	moneyManagement Moneymanagement=new moneyManagement();
	Moneymanagement.setNec(income*0.55);
	Moneymanagement.setFfa(income*0.10);
	Moneymanagement.setEdu(income*0.10);
	Moneymanagement.setLtss(income*0.10);
	Moneymanagement.setPlay(income*0.10);
	Moneymanagement.setGive(income*0.05);
	//create getters for the setters
	System.out.println("NEC : " + Moneymanagement.getNec()+ "\t LTSS : " + Moneymanagement.getLtss());
	System.out.println("FFA : " + Moneymanagement.getFfa()+ "\t PLAY : " + Moneymanagement.getPlay());
	System.out.println("EDU : " + Moneymanagement.getEdu()+ "\t GIVE : " + Moneymanagement.getGive());
	}
	}
