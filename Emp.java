
public class Emp {
     int id;
     String name;
     double salary;

     void readEmp(int i, String n, double s) {
        id = i;
        name = n;
        salary = s;
    }

    void printEmp() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {
        Emp em = new Emp();
        em.readEmp(1, "brahmam", 50000.0);
        em.printEmp();
    }   
}
