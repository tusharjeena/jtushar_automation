package Package1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		System.out.println("Enter the number:");
		
		Scanner scan = new Scanner(System.in);
		int pal = scan.nextInt();
		
		int t,a,b=0;
		t=pal;
		
		while(pal!= 0) {
			
			a=pal%10;
			b=b*10+a;
			a=a/10;
			break;	
		}
		
		if(b==t) {
			System.out.println("The number is a Palindrome");
			
		}
		
		else {
			System.out.println("The number is not Palindrome");
		}

	}

}
