package demo;

class Over{
	public void display()
	{
		System.out.println("i am from first class");
	}
}

public class OverRiding extends Over{
	public void display()
	{
		System.out.println("i am from second");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverRiding or = new OverRiding();
		or.display();

	}

}
