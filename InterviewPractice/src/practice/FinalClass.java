package practice;

 class Test{
	
	final int i;
	static final int j;
	Test(){
		
	}
	{
		i=10;
	}
	
	static{
		j=100;
	}
	
	void TestMethod(){
		System.out.println("Test method");
	}
	
	static void staticMethod() {
		System.out.println("Superclass static method");
	}
}

class childClass extends Test{
	
	static void staticMethod() {
		System.out.println("childclass static method");
	}
	
}
public class FinalClass {
	
	public static void main(String[] args) {
		
		childClass obj=new childClass();
		obj.staticMethod();
		childClass.staticMethod();
		Test.staticMethod();
		childClass.staticMethod();
	
	}

}
