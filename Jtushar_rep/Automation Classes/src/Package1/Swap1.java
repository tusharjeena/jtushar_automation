package Package1;

import java.util.*;

public class Swap1 {
	
	public static void main(String[] args) {
		
		int a,b,x;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value of both numbers");
		a=scan.nextInt();
		b=scan.nextInt();
		
		System.out.println("Before swapping: " +a+" "+b);
		x=a;
		a=b;
		b=x;
		
		System.out.println("After swapping:" +a+ " "+b);
		System.out.println();		
		

	}

}
