package week1.day1Assignment;

public class Bike {
	public void twoWheeler()
	{
		System.out.println("Bike class");
	}
	
public static void main(String[] args) {
	
	System.out.println("Bike class");
	Car cc=new Car();
	cc.applyBreak();
	cc.soundBreak();
	Bike bb=new Bike();
	bb.twoWheeler();
}
}
