class Student {
    int rollNum;
    String studName;
    int mark1,mark2,mark3,totalMarks;
    public void setStudDetails(int r, String s, int m1, int m2, int m3) {
        rollNum = r;
        studName = s;
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
    }
    public int calculateTotal() {
    	totalMarks=mark1+mark2+mark3;
    	return totalMarks;
    }
    public void displayStudDetails() {
        System.out.println("name: " + studName);
        System.out.println("Roll no: " + rollNum);
        System.out.println("Total Marks: " + calculateTotal());
    }
}
public class StudentDemo{
	

    public static void main(String[] args) {
        Student s1= new Student();
        s1.setStudDetails(123,"brahmam", 90, 89, 99);
        s1.displayStudDetails();
    }
}
