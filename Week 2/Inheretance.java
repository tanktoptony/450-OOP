package oopConcepts;

public class Inheretance {
}


class ParentClass{
	
	
	ParentClass(){ 
		System.out.println("inside Parent Constructor");
	}
	
	
}

class ChildClass extends ParentClass{
	
	ChildClass(){ 
		System.out.println("inside child Constructor");
	}
}
	

class GrandChildClass extends ChildClass{
	
	GrandChildClass(){ 
		System.out.println("inside Grandchild Constructor");
	}
}

class DemiConsorder{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GrandChildClass grandchild = new GrandChildClass();
		
	}
	
}


