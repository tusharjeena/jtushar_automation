package Package1;

public class ChildStatic extends ParentStatic {
	
	public void meth2() {
		System.out.println("This is Child Static Method");
		System.out.println("Committed change to rep");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParentStatic p = new ParentStatic();
		ChildStatic c = new ChildStatic();
		p.meth1();
		c.meth2();

		/*ParentStatic.meth1();
		ChildStatic.meth2();*/
	
	}

}
