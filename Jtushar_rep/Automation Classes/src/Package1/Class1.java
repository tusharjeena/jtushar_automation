package Package1;

public class Class1 { //boundary of the class

	int a; //declared a variable
	
	public void tushar() // () indicates this is a method
	{
		
	System.out.println("Welcome");
	
	}
	public static void main(String args[])
	{
		Class1 obj = new Class1(); //object created
		obj.tushar(); //call the method
		obj.a=23;
		System.out.println(obj.a);
		obj.a=35;
		System.out.println(obj.a);
	}
}
