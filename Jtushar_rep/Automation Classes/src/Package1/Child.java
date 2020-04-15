package Package1;

public class Child extends Parent {
	
	public Child() {
		
		this(11,22,33);
		System.out.println("Child: Default Constructor");
	}
	
	public Child(int a) {
		
		this();
		System.out.println("Child: 1-Parameterized Constructor");
	}
	
	public Child(int a,int b) {
		
		this(11,22,33,44);
		System.out.println("Child: 2-Parameterized Constructor");
	}

	public Child(int a,int b,int c)
	{
		super(11,22);
		System.out.println("Child: 3-Parameterized Constructor");
		
	}
	
	public Child(int a,int b,int c,int d) {
		
		this(22);
		System.out.println("Child: 4-Parameterized Constructor");			
	}
	
	public static void main(String args[])
	{
		Child ch = new Child(11,22);
	}
}


