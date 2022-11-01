package week1.day1Assignment;

public class Mobile {
	
void makeCall()
{
	String mobileModel="VivoV17Pro";
	float mobileWeight= 140.5f;
	System.out.println("Calling function: Calling sashwath\n");
}
void sendMsg()
{
	boolean fullCharged=true;
	int mobilecost= 17560;	
	System.out.println("My Message:  Hi friends happy morning\n  ");
}
public static void main(String[] args) {
	
	Mobile mm =new Mobile();
	mm.makeCall();
	mm.sendMsg();
	System.out.println("This is my mobile");
}
}
