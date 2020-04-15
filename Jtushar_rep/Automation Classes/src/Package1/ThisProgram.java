package Package1;

public class ThisProgram {
	
	public ThisProgram() {
		this(5,6,7,8);
		System.out.println("Default Constructor");
	}

	public ThisProgram(int a, int b, int c, int d){
		System.out.println("4-Parameterized Constructor");
		
	}
	
	public ThisProgram(int a, int b) {
		this();
		System.out.println("2-Parameterized Constructor");
	}
	
	public ThisProgram(int a) {
		this(9,10);
		System.out.println("1-Parameterized Constructor");
	}
	
	public ThisProgram(int a, int b, int c) {
		this(10);
		System.out.println("3-Parameterized Constructor");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ThisProgram dis = new ThisProgram(15,16,17);
		
	}

}
