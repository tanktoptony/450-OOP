package oopBasics2;

public class StaticInitializationBlockExample {

	static int i;
	
	int j;
	
	//start of static
	
	static {
		i =10;
		System.out.println("Static block called");
		
		
	}
	
	{
		System.out.println("non Static block");
		
	}
	
	
	
	
	
	
}

class Main {
	
	public static void main(String[] args) {
		
		System.out.println(StaticInitializationBlockExample.i);
		StaticInitializationBlockExample SIB = new StaticInitializationBlockExample();
		
	}
	
	
}
