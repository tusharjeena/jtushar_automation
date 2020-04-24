package Package1;

import java.util.Scanner;

public class Primenumber {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the number:");
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int m = 0;
		
		if (n==0||n==1) {
			System.out.println("0 or 1 are not Prime Numbers");
		}
		
			
		for(int i=2; i<=n/2; i++) {
				
				if(n%i == 0) {
					
					m=1;
					
					}
				if(m==1) {
					System.out.println("It is not a Prime Number");
					break;
				}
				
				else {
					System.out.println("It is a Prime Number");
				}
		}	
	}
}