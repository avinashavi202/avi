package demo;

class GrandFather
{
	void House()
	{
		System.out.println("villa");
	}
}
class Father extends GrandFather
{
	void vehicle()
	{
		System.out.println("car");
	}
}

public class MultiLevel extends Father
{
	void mobile()
	{
		System.out.println("iphone");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiLevel m = new MultiLevel();
		m.House();
		m.vehicle();
		m.mobile();
		

	}

}
