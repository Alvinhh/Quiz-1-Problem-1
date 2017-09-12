package quiz1;

import java.util.Scanner;

public class quiz1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Value of (TD)");
		double TD = input.nextDouble();

		System.out.println("Value of (YARDS)");
		double YARDS = input.nextDouble();
		
		System.out.println("Value of (INT)");
		double INT = input.nextDouble();
		
		System.out.println("Value of (COMP)");
		double COMP = input.nextDouble();
		
		System.out.println("Value of (ATT)");
		double ATT = input.nextDouble();
		
		double QB = eqns(TD, YARDS, INT, COMP, ATT);

		System.out.printf("The QB rating is %4.1f ", QB);
		
		input.close();

	}

	public static double eqns(double TD, double ATT, double YARDS, double COMP, double INT) {

		double a = ((COMP / ATT) - 0.3) * 5;
		if (a > 2.375){
			a = 2.375;
		}
		else if (a < 0){
			a = 0;
		}
		
		double b = ((YARDS / ATT) - 3) * 0.25;
		if (b > 2.375){
			b = 2.375;
		}
		else if (b < 0){
			b = 0;
		}
		
		double c = (TD / ATT) * 20;
		if (c > 2.375){
			c = 2.375;
		}
		else if (c < 0){
			c = 0;
		}
		
		double d = 2.375 - ((INT / ATT) * 25);
		if (d > 2.375){
			d = 2.375;
		}
		else if (d < 0){
			d = 0;
		}
		
		
		System.out.print("\n");
		System.out.print(a);
		System.out.print("\n");

		System.out.print(b);
		System.out.print("\n");

		System.out.print(c);
		System.out.print("\n");

		System.out.print(d);
		System.out.print("\n");

		double Passer_Rating = ((a + b + c + d) / 6) * 100;

		return Passer_Rating;

	}

}