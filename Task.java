class A{  //Bean class
	private int a;
	private int b;
	public void setA(int a) {
		this.a=a;
}
	public int getA() {
		return a;
	}
	public void setB(int b) {
		this.b=b;
}
	public int getB() {
		return b;
	}
	}
public class Task {
		

	public static void main(String[] args) {
		A ob = new A();
		ob.setA(12);
		System.out.println("value of a  "+ob.getA());
		ob.setB(13);
		System.out.println("value of b  "+ob.getB());
	}
}
