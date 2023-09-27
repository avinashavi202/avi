package demo;

public class MethodOverloading {
	public void sub(int a, int b)
	{
		System.out.println(a-b);
	}
	public void sub(int a, int b, int c)
	{
		System.out.println(a-b-c);
	}
	public void sub(int a, float d)
	{
		System.out.println(a-d);
	}
	public void sub(int a, float d, float e)
	{
		System.out.println(a-d-e);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    MethodOverloading m = new MethodOverloading();
	    m.sub(5, 20.5f);
	    m.sub(6, 3);
	    m.sub(12, 69, 78);
	    m.sub(63, 56.2f, 84.6f);

	}

}
