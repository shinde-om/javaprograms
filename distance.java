package EF138;
import java.util.Scanner;
public class distance{
	int feet, inches;
	
	public void Read() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter distance in feet: \n");
		feet = sc.nextInt();
		System.out.println("Enter distance in inches: \n");
		inches = sc.nextInt();
		sc.close();
	}
	
	public void Display() {
		System.out.println("Feet: "+feet+"\t Inches: "+inches);
	}
	
	public void Addition(distance D1, distance D2) {
		inches = D1.inches + D2.inches;
		feet = D1.feet + D2.feet + (inches/2);
		inches = inches%12;
	}
	
	public static void main(String args[]) {
		while(true) {
			System.out.println("Enter your option 1/0: 1: for continue and 0: for exit");
			Scanner sc = new Scanner(System.in);
			int val = sc.nextInt();
			switch(val) {
			case 1:
				distance D1 = new distance();
				distance D2 = new distance();
				distance D3 = new distance();
				
				System.out.println("Enter first distance: ");
				D1.Read();
				System.out.println("Enter second distance: ");
				D2.Read();
				
				D3.Addition(D1, D2);
				
				System.out.println("Total distance is:");
				D3.Display();
				break;
				
			case 0:
				default: System.out.println("Rnter the valid input 1/0");
			sc.close();
			}
		}
	}
}