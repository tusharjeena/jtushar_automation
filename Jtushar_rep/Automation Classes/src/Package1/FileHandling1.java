package Package1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling1 {
	
	@SuppressWarnings({ "resource" })
	public void method(int x) throws IOException {
		
		File f = new File("/home/tushar/Desktop/Tushar.txt");
		FileReader fr = new FileReader(f);
		BufferedReader buffer = new BufferedReader(fr);
		
		String s;
		int a =0;
		
		while((s = buffer.readLine())!= null)
		{
			a=a+1;
			if(a == x)
			{
				System.out.println("The value of the String is: "+s);
			}	
		}		
	}
	
	public static void main(String[] args) throws IOException {
		
		FileHandling1 fh =  new FileHandling1();
	
		@SuppressWarnings({"resource" })
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the line number: ");
			
		int c = scan.nextInt();
		fh.method(c);
		
	}

}
