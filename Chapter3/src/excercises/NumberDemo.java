package excercises;

import java.util.Scanner;

public class NumberDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	int x;
	int y;
	System.out.print("Enter a number for x: ");
	x = input.nextInt();
	System.out.print("Enter a number for y: ");
	y = input.nextInt();
	
		displayTwiceTheNumber(x , y);
		displayNumberPlusFive(x , y);
		displayNumberSquared(x , y);
	}
public static void displayTwiceTheNumber(int x, int y) {
	
	int x2;
	int y2;
	
	x2 = x * 2;
	y2 = y * 2;
	System.out.println("x = " + x2 +" y = "  + y2);
}
public static void displayNumberPlusFive(int x, int y) {
	int x5;
	int y5;
	
	x5 = x + 5;
	y5 = y + 5;
	
	System.out.println("x = " + x5 + " y = " + y5);
	
}
public static void displayNumberSquared(int x, int y) {
	int xs;
	int ys;
	
	xs = x * x;
	ys = y * y;
	
	System.out.println("x = " + xs + " y = " + ys);
	
	
}
}
