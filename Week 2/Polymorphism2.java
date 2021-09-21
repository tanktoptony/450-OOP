package oopConcepts;

public class Polymorphism2 {
}



class Parent {
	
	
	void print ()
	{
		System.out.println("parent class");
		
	}
}

class subclass1 extends Parent {
	
	void print ()
	{
		System.out.println("sub class1");
		
	}
	
}

class subclass2 extends Parent {
	
	void print ()
	{
		System.out.println("sub class2");
		
	}
	
}
	
class DemoPoly2
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent a;
		a= new subclass1();
		a.print();
		a =new subclass2();
		a.print();
	}

}
