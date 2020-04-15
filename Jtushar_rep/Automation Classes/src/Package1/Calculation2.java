package Package1;

public class Calculation2 {
	
	public int sum(int a, int b)
	{
		int c;
		c=a+b;
		return c;
	}
	
	public int sub(int x, int y)
	{
		int z;
		z=x-y;
		return z;
	}
	
	public int mul(int i, int j)
	{
		int k;
		k=i*j;
		return k;
	}
	
	public void divs(int o, int p)
	{
		int q;
		q=o/p;
		System.out.println("The Result is: "+q);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation2 ob = new Calculation2();
		int sum_result = ob.sum(10, 2);
		int sub_result = ob.sub(sum_result, 2);
		int sum_res2 = ob.sum(sub_result,2);
		int mul_result = ob.mul(sum_res2, 2);
		ob.divs(mul_result,2);
	}

}
