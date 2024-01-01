package EF138;
import java.util.Scanner;
public class CombinationPermutation {
	static int factorial(int n) {
		if (n == 1 || n == 0)
			return 1;
		else
			return factorial(n) * factorial(n-1);
	}
	
	static int nCr(int n, int r) {
		if(n == 1 || n == 0)
			return 1;
		else
			return factorial(n)/(factorial(r)*factorial(n-r));
	}
	
	static int nPr(int n, int r) {
		if(n == 0)
			return 1;
		else
			return factorial(n)/factorial(n-r);
	}
	
	public static void main(String args[]) {
		System.out.println("Enter option 1/2. 1: for nCr 2: for nPr \n");
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		System.out.println("Enter the value of r: ");
		int r = sc.nextInt();
		switch(val) {
		case 1:
			if(n>=r)
				System.out.println("nCr: " + nCr(n, r));
			else
				System.out.println("Invalid input! n should be greater than equal to r!");
		case 2:
			if(n>=r)
				System.out.println("nPr: " + nPr(n, r));
			else
				System.out.println("Invalid input! n should be greater than equal to r!");
		default: System.out.println("Invalid input!");
		sc.close();
		}
	}
}
