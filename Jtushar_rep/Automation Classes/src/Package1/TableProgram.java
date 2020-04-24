package Package1;

import java.util.Scanner;

public class TableProgram {

	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int i;
		
		for(i=1;i<=10;i++)
		{
			System.out.println("The Multiplication table is:" +a*i);
		}
		
	}

}
