
public class Rectangle {
	int length;
	int breadth;
	public Rectangle(int length, int breadth) {
		this.length=length;
		this.breadth=breadth;
	}

	public int area() {
		return length*breadth;
	}
	public static void main(String[] args) {
		Rectangle r1=new Rectangle(4,5);
		System.out.println("area of the rectangle:"+r1.area());
	}

}
