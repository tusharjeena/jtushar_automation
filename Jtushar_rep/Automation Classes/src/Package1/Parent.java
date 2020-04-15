package Package1;

public class Parent {
	
	public Parent() {
		
		this(11,22,33);
		System.out.println("Parent: Default");
	}
	
	public Parent(int a) {
		
		this();
		System.out.println("Parent: 1-Parameterized");
	}
	
	public Parent(int a,int b) {
		this(11);
		System.out.println("Parent: 2-Parameterized");
	}
	
	public Parent(int a,int b,int c) {
		System.out.println("Parent: 3-Parameterized");
	}
}
