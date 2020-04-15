package Package1;

public class Student {

	int rollno;
	int age;
	
	public void show1() {
		System.out.println("Welcome");
	}
	
	public void show2() {
		System.out.println("Welcome all of you");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student Tushar = new Student();
		Tushar.show1();
		Tushar.show2();
		Tushar.rollno=7;
		System.out.println(Tushar.rollno);
		Tushar.age=28;
		System.out.println(Tushar.age);

	}

}
