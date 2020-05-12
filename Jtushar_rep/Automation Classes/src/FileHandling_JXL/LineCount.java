package FileHandling_JXL;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LineCount {
	
	public void read_transfer(int a) throws IOException {
		File fread = new File("/home/tushar/Desktop/HandlingTushar1");
		FileReader fr = new FileReader(fread);
		BufferedReader br = new BufferedReader(fr);
		
		File fwrite = new File("/home/tushar/Desktop/HandlingTushar2");
		FileWriter fw = new FileWriter(fwrite);
		BufferedWriter bw = new BufferedWriter(fw);
		
		int counter = 0;
		String s;
		
		while((s=br.readLine())!= null) {
			
			System.out.println(s);
			counter = counter+1;
			if(counter>a)
			{
				bw.write(s);
				bw.newLine();
			}
			
		} bw.close();
		
	} 

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Line count till where you want to write data:");
		
		int x = scan.nextInt();
		
		LineCount lc = new LineCount();
		lc.read_transfer(x);
	}

}
