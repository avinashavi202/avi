package demo;

 class Single {
	void student()
	{
		System.out.println("Avinashavi");
	}
}
public class SingleInheritance extends Single
{
	void rollno()
	{
		System.out.println("1234");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleInheritance s = new SingleInheritance();
		s.rollno();
		s.student();

	}

}
