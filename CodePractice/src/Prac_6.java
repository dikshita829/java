class Employee1{
	int salary;
	String name;
	public int getSalary() {
		return salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name=n;
	}
}
class cellPhone{
	public void ring() {
		System.out.println("vibrating");
		
	}
	public void vibrate() {
		System.out.println("vibrating");
		
	}
	public void callFreind() {
		System.out.println("call friend monu");
		
	}
}
class squre{
	int side;
	public int area() {
		return side*side;
		
	}
	public int areaPerimeter() {
		return 4*side;
		
	}
}
class Tommy{
	public void run() {
		System.out.println("running from the enemy");
		
	}
	public void fir() {
		System.out.println("firing from the enemy");
		
	}
	public void hit() {
		System.out.println("hitting from the enemy");
		
	}
}
public class Prac_6 {

	public static void main(String[] args) {
		/*Create a class Employee with the following properties and methods:
			Salary (property) (int)
			getSalary (method returning int)
			name (property) (String)
			getName (method returning String)
			setName (method changing name)*/
		Employee1 dk = new Employee1();
		dk.salary=23;
		dk.name="dikshita";
		dk.getName();
		System.out.println(dk.getName());
		dk.getSalary();
		System.out.println(dk.getSalary());
		dk.setName("manjusha");
		
		//Create a class cellphone with methods to print “ringing…”, “vibrating…”, etc.
		 cellPhone q = new cellPhone();
		 q.vibrate();
		 q.ring();
		 q.callFreind();
// Create a class Square with a method to initialize its side, calculating area, perimeter etc.
		 squre r = new squre();
		 r.side=4;
		 System.out.println(r.area());
		 System.out.println(r.areaPerimeter());
//Create a class TommyVecetti for Rockstar Games capable of hitting (print hitting…), running, firing, etc.
		 Tommy st = new Tommy();
		 st.run();
		 st.fir();
		 st.hit();
		 
		 
 		
	}

}
