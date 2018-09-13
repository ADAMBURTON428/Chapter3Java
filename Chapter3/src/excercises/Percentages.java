package excercises;

import java.util.Scanner;

public class Percentages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
double x;
double y;
System.out.print("Enter a number for x: ");
x = input.nextInt();
System.out.print("Enter a number for y: ");
y = input.nextInt();
	computePercent(x , y);
	}
public static void computePercent(double x , double y) {
	
	double compute;
	
	compute = (x / y) * 100;
	
	System.out.println(x + " divided by " + y + " = " + compute + "%");
	
}
}
