package oopConcepts;

public class Polymorphism1 {
}


class MultiplyFun{
	
	
	static int Multiply (int a, int b)
	{
		
		return a*b;
	}
	
	static double Multiply (double a, double b)
	{
		
		return a*b;
	}
	
	
}

class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(MultiplyFun.Multiply(2, 4));
		System.out.println(MultiplyFun.Multiply(5.5, 6.3));
	}

}
