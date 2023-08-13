import java.util.Scanner;

public class Circle {
	float area(double r) {
		float ar=(float)(Math.PI*r*r);
		return ar;
	
	}
	float circ(double r) {
		float cr=(float)(2*Math.PI*r);
		return cr;
	}
	public static void main (String []args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the r value ");
		double r =s.nextDouble();
		Circle ob=new Circle();
		float area =ob.area(r);
		System.out.println("Area of Circle:"+area);
		float cir=ob.circ(r);
		System.out.println("Circumeference of Circle:"+cir);
	}
}
