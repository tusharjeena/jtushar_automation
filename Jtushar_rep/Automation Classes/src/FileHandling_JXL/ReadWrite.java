package FileHandling_JXL;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWrite {

	public void read_trans() throws IOException{
		
		File fread = new File("/home/tushar/Desktop/HandlingTushar1");
		FileReader fr = new FileReader(fread);
		@SuppressWarnings("resource")
		BufferedReader buffer = new BufferedReader(fr);
		
		File fwrite = new File ("/home/tushar/Desktop/HandlingTushar2");
		FileWriter fw = new FileWriter(fwrite);
		BufferedWriter buff = new BufferedWriter(fw);
		
		
		String s;
		while((s=buffer.readLine())!= null) {
		
		System.out.println(s);
		
		buff.write(s);
		buff.newLine();
	}
		buff.close();

	}
	
public static void main(String args[]) throws IOException {
	
	ReadWrite rw = new ReadWrite();
	rw.read_trans();	
	}
	
}

