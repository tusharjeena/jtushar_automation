package Package1;

public class Horse extends Polymorph {
	
	public void sound() {
	//method override
	System.out.println("Neigh");	
	}

	public static void main(String[] args) {
		
		Polymorph ob = new Polymorph();
		ob.sound();	
		
	}

}
