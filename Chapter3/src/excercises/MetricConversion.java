package excercises;

import java.util.Scanner;

public class MetricConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double centimeters;
		double liters;
		
		System.out.print("Enter the amount of centimeters you want to know in a inch: ");
		centimeters = input.nextDouble();
		System.out.print("Enter the amount of liters you want to know in a gallon: ");
		liters = input.nextDouble();
		conversion(centimeters, liters);
	}
public static void conversion(double centimeters, double liters) {
	double gallons;
	double inches;
	
	gallons = liters * 0.264 ;
	inches = centimeters * .39;
	System.out.println(centimeters + " centimeters is equal to " + inches + " inches");
	System.out.println(liters + " liters is equal to " + gallons + " gallons");
}
}
