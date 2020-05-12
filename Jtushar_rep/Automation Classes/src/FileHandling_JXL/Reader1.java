package FileHandling_JXL;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Reader1 {
	
	public static void main(String[] args) throws IOException {
	
		File f = new File("/home/tushar/Desktop/HandlingTushar1");
		FileReader fr = new FileReader(f);
		
		@SuppressWarnings("resource")
		BufferedReader buffer = new BufferedReader(fr);
		String s;
		
		int a=0;
		while((s=buffer.readLine())!= null){

		a=a+1;
		if(a==3)
		{
			System.out.println(s);
			break;
		}
		
		}

	}
}
