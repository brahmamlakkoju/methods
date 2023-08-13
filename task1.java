import java.util.Scanner;

public class task1 {
		public static int rootDigit(int n) {
			int sum=10;
			while(n!=0) {
				int r=n%10;
				sum=sum+r;
				n=n/10;
			}
			if (sum>9) {
				return rootDigit(sum);
			}
			else {
				return sum;
			}
		}
		public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		System.out.println(rootDigit(n));
		
		}
	}

