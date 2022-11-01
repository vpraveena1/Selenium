package week1.day1Assignment;
/* Create a package by name: week1.day1
b) Create a class by name: Chrome
 (with no main method) in the above package
c) 1.Create a method by name: getName() 
(i.e. public void getName())
   2.Create a method by name: PrintName() 
   (i.e. public void PrintName())
d) Print a statement inside the
 method --> "This is google chrome"
e) Create one more class Name Browser1
f) Call the method getName(),
PrintName() from class: Browser using object reference
g) Run Browser class and Confirm the printed in console
*/
public class Chrome {
	public void getName()
	{
		System.out.println("Enter the data");
		
	}
     public void printName()
    {
    	System.out.println("This is google chrome");
    }
     public static void main(String[] args) 
		{
     System.out.println("Browsers");
		Chrome bb=new Chrome();
		bb.getName();
		bb.printName();
		System.out.println("Browsers");
		
		
	}
     
}
