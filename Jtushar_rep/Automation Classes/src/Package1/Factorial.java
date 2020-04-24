package Package1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c,f=1;
		
		System.out.println("Enter the number:");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		if (n < 0)
		      System.out.println("Number should be non-negative.");
		    else
		    {
		      for (c = 1; c <= n; c++)
		        f = f*c;

		      System.out.println("Factorial of "+n+" is = "+f);
		    }
	}

}