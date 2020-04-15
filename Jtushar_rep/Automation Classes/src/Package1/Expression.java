package Package1;

import java.util.Scanner;

public class Expression {

	public int add(int i, int j) {
		int k = i+j;
		return k;
	}
	
	public int sub(int l, int m) {
		int n = l-m;
		return n;
	}
	
	public int mult(int o, int p) {
		int q = o*p;
		return q;
	}
	
	public void divd(int r, int s) {
		int t = r/s;
		System.out.println("The Final Result is: "+t);
		System.out.println("Tushar New Committ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the value of x1");
		int x1=scan.nextInt();
		
		System.out.println("Enter the value of x2");
		int x2=scan.nextInt();
		
		System.out.println("Enter the value of x3");
		int x3=scan.nextInt();
		
		System.out.println("Enter the value of x4");
		int x4=scan.nextInt();
		
		System.out.println("Enter the value of x5");
		int x5=scan.nextInt();
		
		Expression ob = new Expression();
		int A = ob.add(x1, x2);
		int B = ob.sub(A, x3);
		int C = ob.add(B,x4);
		int D = ob.mult(C, x4);
		ob.divd(D, x5);		
		
	}

}
