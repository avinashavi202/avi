package demo;

class Parent
{
	void house()
	{
		System.out.println("villa");
	}
	void vehicle()
	{
		System.out.println("audi");
	}
}
class Child1 extends Parent
{
	void laptop()
	{
		System.out.println("dell");
	}
}

public class Hirearical extends Parent {

	void mobile()
	{
		System.out.println("iphone");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hirearical h = new Hirearical();
		Child1 c = new Child1();
		c.house();
		c.vehicle();
		c.laptop();
		System.out.println("==================");
		h.house();
		h.mobile();
		h.vehicle();
		

	}

}
