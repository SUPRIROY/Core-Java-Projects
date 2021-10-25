import java.util.ArrayList;
	import java.util.Scanner;

public class Employee {

	String name, email, address, birthday;
	void work() {
	System.out.println("working");
	}
	}
	class Programmer1 extends Employee {
	String prog_lanuguages;
	void code() {
	System.out.println("coding");
	}
	void fixbugs() {
	System.out.println("fixing the bugs");
	}
	}
	class Tester1 extends Employee {
	ArrayList<String> testing_methodologies = new ArrayList<String>();
	void test() {
	System.out.println("testing");
	}
	void verify() {
	System.out.println("verifying code");
	}
	}
	class Designer1 extends Employee {
	String design_philosophy;
	ArrayList<String>design_tools_used=new ArrayList<String>();
	void design() {
	System.out.println("designing application");
	}
	class BusinessDeveloper extends Employee {
	ArrayList<String>specialized_domains=new ArrayList<String>();
	void collectRequirements() {
	System.out.println("collecting requirements");
	}
	void analyzeRequirements() {
	System.out.println("analyzing requirements");
	}
	void writeDocuments() {
	System.out.println("writing documents");





	}
	}
	class TeamLeader extends Employee {
	ArrayList<String>team_collaboration_tools=new ArrayList<String>();
	ArrayList<String>development_methods=new ArrayList<String>();
	void schedule() {
	System.out.println("scheduling");
	}
	void organize() {
	System.out.println("organizing");





	}
	void manage() {
	System.out.println("managing programmer");
	this.hashCode();
	//testing inheritance
	System.out.println("managing designer");





	}
	}
	class Architect extends Employee
	{
	String design_methodology;
	void designSystem() {
	System.out.println("designing systems");





	}
	}
	final class CTO extends Architect
	{
	ArrayList<String>technology_domains=new ArrayList<String>();
	void adviseTechnologies() {
	System.out.println("advising technologies");
	}
	}
	final class CEO extends Employee {
	String vision,mision;
	void execManangement() {
	System.out.println("managing execs");
	}
	}
	final class CFO extends Employee {
	String fin_management_skills;
	void manageFinances() {
	System.out.println("managing finances");
	}






	@SuppressWarnings("unused")
	public void main(String[] args) {





	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("enter designation");
	}
	}
	
}
