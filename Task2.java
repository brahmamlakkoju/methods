
public class Task2 {
	 int a;
	 int b;
	{
	a=10;
	b=20;
	System.out.println("value of a:"+a);
	System.out.println("value of b:"+b);
	}
	static {
		System.out.println("execute");
	}
	Task2(){
		System.out.println("executed after instance block");
	}
	public static void main(String[] args) {
		Task2 ob=new Task2();
	}
}
