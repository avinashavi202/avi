package demo;

class Car{
	private String colour;
	public String getcolour()
	{
		return colour;
	}
	public void setcolour(String newcolour) {
		colour = newcolour;
	}
}
class Skoda extends Car{
	private String model;
	public String getmodel() {
		return model;
	}
	public void setmodel(String newmodel) {
		model = newmodel;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Skoda s = new Skoda();
		s.setcolour("red");
		s.setmodel("highend");
		System.out.println(s.getcolour() +" colour");
		System.out.println(s.getmodel() +" model");

	}

}
