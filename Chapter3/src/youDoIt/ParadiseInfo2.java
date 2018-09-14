package youDoIt;

import java.util.Scanner;

public class ParadiseInfo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double price;
		double discount;
		double savings;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter cutoff price for discout >> ");
		price = keyboard.nextDouble();
		
		System.out.print("Enter discout rate as a whole a whole number >> ");
		discount = keyboard.nextDouble();
		
		ParadiseInfo.displayInfo();
		
		
		savings = computeDiscountInfo(price ,discount);
		System.out.println("Special this week on any service over " + price );
		System.out.println("Discount of " + discount + " percent");
		System.out.println("That's a savings of at least $" + savings);
	}
public static double computeDiscountInfo(double pr, double dscnt) {
	double savings;
	savings = pr * dscnt / 100;
	return savings;
}
}
