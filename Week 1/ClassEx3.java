package oopBasics1;

public class ClassEx3 {

	int i;
	
	ClassEx3(){i=5;  //instance variable
	} 
	//ClassEx3() {this.i =5;}
	
	 ClassEx3 (int myInteger) //my integer is a local variable
	 {
		 i=myInteger;
	 }
	
	//ClassEx3(int i){ this.i = i;}
	
	
	
	public static void main(String[] args) {
		System.out.println("A simple class with 2 different constructors");
		System.out.println("This is also an example of constructor overloading");
		ClassEx3 obA = new ClassEx3();
		ClassEx3 obB = new ClassEx3(75);
		System.out.println("obA.i= "+ obA.i);

		System.out.println("obA.i= "+ obB.i);
		
	}

}
