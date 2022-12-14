class Employee{
	int id;
	String name;
	int salary;
	public void PrintDetail(){
		System.out.println("my id is:"+id);
		System.out.println("my name is:"+name);
		
	}
	public int getsalary(){
		return salary;
		
		
	}
}
public class Prac_5 {
	
	
	public static void main(String[] args) {
		System.out.println("This our coustum class");
		//instantiating a object
	Employee dikshita =new Employee();
	Employee manjusha = new Employee();
	//setting attributes
	  dikshita.id=12;
	  dikshita.name="ankit";
	  manjusha.id=23;
	  manjusha.salary=2000;
	  manjusha.name="sanjay";
	 // System.out.println(dikshita.id);
	 // System.out.println(dikshita.name);
	 dikshita.PrintDetail();
	 manjusha.PrintDetail();
	 int salary=manjusha.getsalary();
	 System.out.println("may salary is:"+salary);
		
	}

}
