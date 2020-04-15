package Package1;

public class Calculation3 {
	
	public int div(int a, int b)
	{
		int c;
		c=a/b;
		return c;
	}
	
	public int sub(int a1, int b1)
	{
		int d;
		d=a1-b1;
		return d;
	}
	
	public int sum(int a2, int b2)
	{
		int e;
		e=a2+b2;
		return e;
	}

	public void multi(int a3, int b3)
	{
		int f;
		f=a3*b3;
		System.out.println("The Result is: "+f);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculation3 obj = new Calculation3();
		int div_result = obj.div(10, 2);
		int sub_result = obj.sub(div_result, 2);
		int sum_result = obj.sum(sub_result, 2);
		int sub2_result = obj.sub(sum_result,2);
		int sum2_result = obj.sum(sub2_result,2);
		obj.multi(sum2_result,2);

	}

}
