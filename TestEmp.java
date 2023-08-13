class Emp1{
	 int id;
     String name;
     double salary;
     public Emp1(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public void showEmp() {
    	 System.out.println("Employee ID: " + id);
         System.out.println("Employee Name: " + name);
         System.out.println("Employee Salary: " + salary);
     }
}
public class TestEmp {

	public static void main(String[] args) {
		Emp1 e1=new Emp1(100,"brahmam",50000);
		e1.showEmp();
		Emp1 e2=new Emp1(104,"sravan",55000);
		e2.showEmp();
	}

}
