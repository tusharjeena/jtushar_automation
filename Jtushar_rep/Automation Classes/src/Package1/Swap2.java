package Package1;

import java.util.*;

public class Swap2 {

	public static void main(String[] args) {
		System.out.println("Enter both the numbers:");
		Scanner sca = new Scanner(System.in);
		
		int x = sca.nextInt();  
        int y = sca.nextInt();  
        System.out.println("Before swapping numbers: "+x +" "+ y);  
        
        x = x + y;   
        y = x - y;   
        x = x - y;   
        
        System.out.println("After swapping numbers: "+x +"  " + y);   
    }		

	}
