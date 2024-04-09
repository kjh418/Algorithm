import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
 
		int d = gcd(a, b);
 
		//최대공약수
		System.out.println(d);
		//최소공배수
		System.out.println(a * b / d);
 
	}
 
	public static int gcd(int a, int b) {
		if (b == 0)
			return a;
            
		return gcd(b, a % b);
	}
}