package oopConcepts;

public class SuperVariable {

}

class ParentCls{
	
	protected int a;
	private int b;
	ParentCls(int a, int b)
	{
		System.out.println("Parent constructor");
		this.a=a;
		this.b=b;
		
	}
	
	
	void parentClsMethod() {
		
		System.out.println("I am a parent Method");
	}
	
}

class ChildCls extends ParentCls {
	
	private int c;
	//private int 
	
	ChildCls(int a, int b, int c)
	{
		super(a,b);
		System.out.println("Child Constructor");
		this.c =c;
		
	}
	void childClsMethod() {
	System.out.println("this is a child method");
	System.out.println("I am calling the parent method");
	
	//Super is used to invoke parent class method
	super.parentClsMethod();
	
	// refer to immediate class instance variable
	
	System.out.println("a==="+super.a);
	
	}
}


class DemiInheritanceSuperExample{
	
	public static void main (String[] args)
	{
		
		ChildCls sampleObj = new ChildCls(1,2,3);
		sampleObj.childClsMethod();
		
		
	}
	
	
}