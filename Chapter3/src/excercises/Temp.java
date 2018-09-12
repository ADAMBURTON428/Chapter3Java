package excercises;

import java.util.Scanner;

public class Temp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double temp;
		
		System.out.print("Enter the temp in celsius at 8: ");
		temp = input.nextDouble();
		displayTemp(temp);
		

	}
public static void displayTemp(double temp) {
	double fahrenheit;
	fahrenheit = temp * 1.8 + 32;
	
	System.out.print("The temp in fahrenheit  at 8am is " + fahrenheit);
}


}
