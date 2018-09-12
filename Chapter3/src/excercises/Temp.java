package excercises;

import java.util.Scanner;

public class Temp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double temp;
		
		System.out.print("Enter the temp in fahrenheit at 8:00 am: ");
		temp = input.nextDouble();
		System.out.print("Enter the temp in fahrenheit at 12:00 pm: ");
		temp = input.nextDouble();
		System.out.print("Enter the temp in fahrenheit at 5:00 pm: ");
		temp = input.nextDouble();
		displayTemp(temp);
		

	}
public static void displayTemp(double temp) {
	double celsius;
	celsius = (temp - 32) * 5/9 ;
	
	System.out.print("The temp in celsius at 8 am is " + celsius);
	System.out.print("The temp in celsius at 12 pm is " + celsius);
	System.out.print("The temp in celsius at 5 pm is " + celsius);

}


}
