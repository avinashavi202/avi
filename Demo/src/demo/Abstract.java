package demo;

abstract class Cycle
{
    abstract void run();	
}
class Atlas extends Cycle
{
	public void run()
	{
		System.out.println("cycle is moveing");
	}
}
public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Atlas a = new Atlas();
		a.run();

	}

}
