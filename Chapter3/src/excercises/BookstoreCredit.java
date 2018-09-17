package excercises;

import java.util.Scanner;

public class BookstoreCredit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double gradePoint;
		String name;
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is your name: ");
		name = input.next();
		
		System.out.print("What is your grade point average: ");
		gradePoint = input.nextDouble();
		
		gradeCredit(gradePoint, name);

	}
public static void gradeCredit(double gradePoint, String name) {
	
	double credit;
	
	credit = gradePoint * 10;
	
	System.out.println(name + " your grade point average of $" + gradePoint + 
			" gives you a creadit of " + credit);
	
}
}
