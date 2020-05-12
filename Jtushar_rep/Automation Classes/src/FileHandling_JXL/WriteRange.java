package FileHandling_JXL;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteRange {
	
	public void read_transfer(int a, int b) throws IOException {
		
		File fread = new File("/home/tushar/Desktop/HandlingTushar1");
		FileReader fr = new FileReader(fread);
		BufferedReader br = new BufferedReader(fr);
		
		File fwrite = new File("/home/tushar/Desktop/HandlingTushar2");
		FileWriter fw = new FileWriter(fwrite);
		BufferedWriter bw = new BufferedWriter(fw);
		
		int counter=0;
		String s;
		
		while((s=br.readLine())!= null) {
			
			System.out.println(s);
			counter=counter+1;
			if (counter>=a && counter <=b)
			{
				bw.write(s);
				bw.newLine();			
			}
				} bw.close();		
	}
	
	
	@SuppressWarnings({ "resource" })
	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter initial Line Count:");
		int x = scan.nextInt();
		
		System.out.println("Enter the last Line count:");
		int y = scan.nextInt();
		
		WriteRange range = new WriteRange();
		range.read_transfer(x,y);
	}

}
