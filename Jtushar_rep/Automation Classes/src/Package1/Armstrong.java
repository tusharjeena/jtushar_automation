package Package1;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		
		//Logic: If it is equal to the sum of cubes of its digits
		
		System.out.println("Please enter a positive number:");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int check,rem, sum=0;
		
		check=n;
			
		while(check != 0) {
			
			rem = check % 10;
			sum = sum + (rem*rem*rem);
			check = check /  10;
	}
		
		if(sum==n) {
			System.out.println("It is an Armstrong Number");
		
		}

		
		else {
			System.out.println("It is not an Armstrong Number");
		}

	}

}
