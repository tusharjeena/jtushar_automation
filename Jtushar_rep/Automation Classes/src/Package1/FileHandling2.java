package Package1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling2 {

	public void method(int x, int y) throws IOException {
		File f = new File("/home/tushar/Desktop/Tushar2.txt");
		FileReader fr = new FileReader(f);
		BufferedReader b = new BufferedReader(fr);
		
		String s;
		int a = 0;
		
		while((s = b.readLine())!= null)
		{
			a=a+1;
			
			if((a == x)||(x<a)&&(a<=y)) {
				
				System.out.println("The value of the String is: "+s);
				
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		FileHandling2 ob = new FileHandling2();	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first line number: ");
		int c = scan.nextInt();

		System.out.println("Enter last line number: ");
		int d = scan.nextInt();
		
		ob.method(c,d);

	}

}
