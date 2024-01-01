package EF138;
import java.util.Scanner;

abstract class Bank
{
	public abstract double calculateEMI(double principal, int duration, double rateOfInterest);
}

class HDFC extends Bank
{
	@Override
	public double calculateEMI(double principal, int duration, double rateOfInterest)
	{
		double monthlyInterestRate = rateOfInterest / 1200;
		double emi = (principal * monthlyInterestRate) / (1-Math.pow(1 + monthlyInterestRate, -duration));
		return emi;
	}
}

class SBI extends Bank
{
	@Override
	public double calculateEMI(double principal, int duration, double rateOfInterest)
	{
		double monthlyInterestRate = rateOfInterest / 1200;
		double emi = (principal * monthlyInterestRate) / (1-Math.pow(1 + monthlyInterestRate, -duration));
		return emi;
	}
}

class IDFC extends Bank
{
	@Override
	public double calculateEMI(double principal, int duration, double rateOfInterest)
	{
		double monthlyInterestRate = rateOfInterest / 1200;
		double emi = (principal * monthlyInterestRate) / (1-Math.pow(1 + monthlyInterestRate, -duration));
		return emi;
	}
}

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter principal amount in INR: ");
		double principal = sc.nextDouble();
		System.out.println("Enter duration in months: ");
		int duration = sc.nextInt();
		System.out.println("Enter rate of interest for HDFC (%): ");
		double rateOfInteresthdfc = sc.nextDouble();
		System.out.println("Enter rate of interest for SBI (%): ");
		double rateOfInterestsbi = sc.nextDouble();
		System.out.println("Enter rate of interest for IDFC (%): ");
		double rateOfInterestidfc = sc.nextDouble();
		HDFC hdfc = new HDFC();
		SBI sbi = new SBI();
		IDFC idfc = new IDFC();
		double emihdfc = hdfc.calculateEMI(principal, duration, rateOfInteresthdfc);
		double emisbi = sbi.calculateEMI(principal, duration, rateOfInterestsbi);
		double emiidfc = idfc.calculateEMI(principal, duration, rateOfInterestidfc);
		System.out.println("Monthly EMI (HDFC): INR => " + emihdfc);
		System.out.println("Monthly EMI (SBI): INR => " + emisbi);
		System.out.println("Monthly EMI (IDFC): INR => " + emiidfc);
		sc.close();
	}
}