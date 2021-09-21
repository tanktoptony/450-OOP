package oopBasics2;

public class GetterSetterExample {

	private int privateInt;
	
	
	//Getter
	public int getPrivateInt() {
		
		return privateInt;
	}
	
	
	//Setter
	public void setPrivateInt(int privateInt)
	{
		this.privateInt=privateInt;
		
	}
	
}
	class DemoGetterSetter{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GetterSetterExample sampleOb = new GetterSetterExample ();
		//sampleOb.privateInt=2; 
		//generates compile error 
		
		sampleOb.setPrivateInt(2);
		
		System.out.println("The priInt ="+ sampleOb.getPrivateInt());
		
	}

}
