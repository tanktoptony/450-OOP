package oopBasics2;

public class AccessControlExample {
 
	public int publicInt =1;
	
	public void showPublicMethod() {
	
		System.out.println("The showPublicMethod() is a public method.");
	
	}
	
    private int privateInt =2;
	
	private void showPrivateMethod() {
	
		System.out.println("The showPrivateMethod() is a private method.");
	
	}
}
	
class Demo{	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Access Control Example. Using private and public modifiers");
		AccessControlExample sampleOb = new AccessControlExample();
		
		System.out.println("The pubInt=" +sampleOb.publicInt);
		sampleOb.showPublicMethod();
		
	//	System.out.println("The pubInt=" +sampleOb.privateInt);
		
	//	sampleOb.showPrivateMethod();

	}

}

}