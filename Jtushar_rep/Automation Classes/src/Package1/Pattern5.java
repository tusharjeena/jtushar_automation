package Package1;

import java.util.Scanner;

public class Pattern5 {
	
	public static void main(String args[])
	{
		System.out.println("No. of rows:");
		
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		scan.close();
		
		for(int i=1; i<=a; i++)
		{
			for(int j=i; j<a; j++)
			{
				System.out.print(" ");
			}
			
			for(int k=1; k<=i; k++)
			{
				System.out.print("*");
				
			}
			
			System.out.println();
			
		}	
		
	}
	

}
