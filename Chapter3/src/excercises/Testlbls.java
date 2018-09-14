package excercises;

import java.util.Scanner;

public class Testlbls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int weight;
		
System.out.print("What is your weight in pounds: ");
weight = input.nextInt();
poundsInKilograms(weight);
poundsInOunces(weight);
poundsInMiligrams(weight);


	}
public static void poundsInKilograms(int weight) {
	double convertedWeight;
	
	convertedWeight = weight * .45359237;
	System.out.println("In kilograms: " + convertedWeight);
}
public static void poundsInOunces(int weight) {
	double convertedWeight;	
	convertedWeight = weight * 16;
	System.out.println("In ounces: " + convertedWeight);
}
public static void poundsInMiligrams(int weight) {
	double convertedWeight;
	convertedWeight = weight * 453592;
	System.out.println("In Miligrams: " + convertedWeight);
}
}
