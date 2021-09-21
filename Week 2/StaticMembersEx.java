package oopBasics2;

public class StaticMembersEx {

	//static variables
	static double length =25.5, breadth = 10.0;
	
	//static method
	
	public static double area() 
	{
		return length * breadth;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//	StaticMembersEx obA = StaticMembersEx();
		// obA.length
System.out.println("length of the Rectangle is :" + StaticMembersEx.length +" unit");
System.out.println("Breadth of the Rectangle is :" + StaticMembersEx.breadth +" unit");
System.out.println("Area of the Rectangle is :" + StaticMembersEx.area() +" sq.unit");
			
		
	}

}
