import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CollectionAssignment
{
	public static ArrayList<Employee> populateEmp() throws ParseException
	{
		ArrayList<Employee> elist = new ArrayList<>();
		Date doj=null;
		doj = new SimpleDateFormat("dd-MM-yyyy").parse("29-06-2000");
		elist.add(new Employee("10000_FS","Luke","Wayne",200000,doj,new Department("254","IT","Noida"), new Address("111","line 01","Noida","UP")));
		doj = new SimpleDateFormat("dd-MM-yyyy").parse("29-06-2000");
		elist.add(new Employee("12000_FS","Nell","Hartong",30000,doj,new Department("254","IT","Gurugram"), new Address("342","line 04","Gajraula","UP")));
		doj = new SimpleDateFormat("dd-MM-yyyy").parse("01-04-1975");
		elist.add(new Employee("10300_JI","Hugh","Queen",25000,doj,new Department("876","Management","Pune"), new Address("343","line 01","Okhla","Delhi")));
		doj = new SimpleDateFormat("dd-MM-yyyy").parse("11-12-1978");
		elist.add(new Employee("19900_SS","Olivia","Freecs",310000,doj,new Department("344","Service","Mumbai"), new Address("567","line 10","Rudrapur","Uttarakhand")));
		doj = new SimpleDateFormat("dd-MM-yyyy").parse("01-01-1998");
		elist.add(new Employee("09900_HR","Theodora","Crain",45000,doj,new Department("654","HR","Bengalore"), new Address("899","line 08","Hasanpur","UP")));
		return elist;
		
	}
	
	public static ArrayList<Employee> sortByEmpId(ArrayList<Employee> emplist)
	{
		Collections.sort(emplist, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2)
			{
				return o1.getEmployeeID().compareTo(o2.getEmployeeID());
			}
		});
		return emplist;
	}
	
	public static ArrayList<Employee> sortByFirstName(ArrayList<Employee> emplist)
	{
		Collections.sort(emplist, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2)
			{
				return o1.getFirstName().compareTo(o2.getFirstName());
			}
		});
		return emplist;
	}
	
	public static ArrayList<Employee> sortByLastName(ArrayList<Employee> emplist)
	{
		Collections.sort(emplist, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2)
			{
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		return emplist;
	}
	
	public static ArrayList<Employee> sortBySalary(ArrayList<Employee> emplist)
	{
		Collections.sort(emplist, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2)
			{
				return ((Float)o1.getSalary()).compareTo(o2.getSalary());
			}
		});
		return emplist;
	}
	
	public static ArrayList<Employee> sortByDepartmentId(ArrayList<Employee> emplist)
	{
		Collections.sort(emplist, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2)
			{
				return o1.getDepartment().getDepartmentId().compareTo(o2.getDepartment().getDepartmentId());
			}
		});
		return emplist;
	}
	
	public static ArrayList<Employee> sortByDepartmentName(ArrayList<Employee> emplist)
	{
		Collections.sort(emplist, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2)
			{
				return o1.getDepartment().getDepartmentName().compareTo(o2.getDepartment().getDepartmentName());
			}
		});
		return emplist;
	}
	
	public static ArrayList<Employee> sortByDepartmentLocation(ArrayList<Employee> emplist)
	{
		Collections.sort(emplist, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2)
			{
				return o1.getDepartment().getLocation().compareTo(o2.getDepartment().getLocation());
			}
		});
		return emplist;
	}
	
	public static ArrayList<Employee> sortByAddressId(ArrayList<Employee> emplist)
	{
		Collections.sort(emplist, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2)
			{
				return o1.getAddress().getAddressID().compareTo(o2.getAddress().getAddressID());
			}
		});
		return emplist;
	}
	
	public static ArrayList<Employee> sortByAddressLine1(ArrayList<Employee> emplist)
	{
		Collections.sort(emplist, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2)
			{
				return o1.getAddress().getAddressLine1().compareTo(o2.getAddress().getAddressLine1());
			}
		});
		return emplist;
	}
	
	public static ArrayList<Employee> sortByAddressCity(ArrayList<Employee> emplist)
	{
		Collections.sort(emplist, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2)
			{
				return o1.getAddress().getCity().compareTo(o2.getAddress().getCity());
			}
		});
		return emplist;
	}
	
	public static ArrayList<Employee> sortByAddressState(ArrayList<Employee> emplist)
	{
		Collections.sort(emplist, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2)
			{
				return o1.getAddress().getState().compareTo(o2.getAddress().getState());
			}
		});
		return emplist;
	}
	
	public static void main(String [] args) throws ParseException
	{
		ArrayList<Employee> employeeList = populateEmp();
		for(Employee emp : employeeList)
		{
			System.out.println(emp.toString());
		}
		
		try(Scanner sc = new Scanner(System.in)) {
			
			System.out.println("Employees before sorting.");
			System.out.println();
			
			System.out.println("Sort Employee\r\n"
					+ "a. ByEmployeeId\r\n"
					+ "b. ByFirstName\r\n"
					+ "c. ByLastName\r\n"
					+ "d. BySalary\r\n"
					+ "e. ByAddress\r\n"
					+ "f. ByDeprtment");
			if (sc.hasNext()) {
				String choice = sc.next();
				switch(choice) {
				case "a":
					employeeList = sortByEmpId(employeeList);
					for(Employee emp : employeeList)
					{
						System.out.println(emp.toString());
					}
					System.out.println();
					break;
				case "b": 
					employeeList = sortByFirstName(employeeList);
					for(Employee emp : employeeList)
					{
						System.out.println(emp.toString());
					}
					break;
				case "c":
					employeeList = sortByLastName(employeeList);
					for(Employee emp : employeeList)
					{
						System.out.println(emp.toString());
					}
					break;
				case "d":
					employeeList = sortBySalary(employeeList);
					for(Employee emp : employeeList)
					{
						System.out.println(emp.toString());
					}
					break;
				case "e":
					System.out.println("Choose address: \n1. By city\n2. By State\n3. By address\n4. By id");
					int addressChoice = sc.nextInt();
					if (addressChoice == 1) {
						employeeList = sortByAddressCity(employeeList);
						for(Employee emp : employeeList)
						{
							System.out.println(emp.toString());
						}
					} else if (addressChoice == 2) {
						employeeList = sortByAddressState(employeeList);
						for(Employee emp : employeeList)
						{
							System.out.println(emp.toString());
						}
						
					}else if (addressChoice == 3) {
						employeeList = sortByAddressLine1(employeeList);
						for(Employee emp : employeeList)
						{
							System.out.println(emp.toString());
						}
						
					}else if (addressChoice == 4) {

						employeeList = sortByAddressId(employeeList);
						for(Employee emp : employeeList)
						{
							System.out.println(emp.toString());
						}
					}
					break;
				case "f":
					System.out.println("Choose how to want to sort.: \n1. By department id\n2. By department name\n3. By department location");
					int deptChoice = sc.nextInt();
					if (deptChoice == 1) {

						employeeList = sortByDepartmentId(employeeList);
						for(Employee emp : employeeList)
						{
							System.out.println(emp.toString());
						}
					} else if (deptChoice == 2) {
						employeeList = sortByDepartmentName(employeeList);
						for(Employee emp : employeeList)
						{
							System.out.println(emp.toString());
						}
						
					}else if (deptChoice == 3) {
						employeeList = sortByDepartmentLocation(employeeList);
						for(Employee emp : employeeList)
						{
							System.out.println(emp.toString());
						}
					}
					break;
				}
			}
			}
		
	}
}