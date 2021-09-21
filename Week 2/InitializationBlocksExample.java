package oopBasics2;

public class InitializationBlocksExample {

	int a,b,c;
	
	//constructor
	
	InitializationBlocksExample() 
	{
		System.out.println("constructor");
		a=3;
	}
	
	
		
	//Initialization Block
	{
		System.out.println("instance intializer block invoked");
		a=1;
	}
	
	//Initialization Block2
		{
			System.out.println("instance intializer block2 invoked");
			b=1;
		}
	
}

class DemoInitBlock{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InitializationBlocksExample IB =new InitializationBlocksExample();
		
		System.out.println(IB.a +" B = "+ IB.b);
		
		
	}

}


