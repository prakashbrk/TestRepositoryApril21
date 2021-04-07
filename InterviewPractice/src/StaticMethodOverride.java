
class Superclass {
	
	int a=10;
	int b=10;
	public void use() {
		System.out.println(a);
	}
	public void useAnother() {
		System.out.println("Super class method");
	}
	public static void staticMethod() {
		
		System.out.println("Static methd in super class");
	}
	
	public void overriddenMethod() {
		System.out.println("in Super class");
	}

}

class ChildClass extends Superclass{
	
	int a=100;
	public void use() {
		System.out.println(a);
	}
	
	public void useAnotherChild() {
		System.out.println("Child method");
	}
	public static void staticMethod() {
			
			System.out.println("Static methd in child class");
		}
	public void overriddenMethod() {
		System.out.println("in child class");
	}
	
}

public class StaticMethodOverride{
	

	public static void main(String[] args) {
		 ChildClass obj= new ChildClass();
		 System.out.println(obj.a);
		 obj.useAnother();
		 obj.useAnotherChild();
		 obj.overriddenMethod();
		 System.out.println("b value for child ref" + obj.b);
		 
		 
		 Superclass obj1=new ChildClass();
		 System.out.println(obj1.a);
		 obj1.useAnother();
		 obj1.overriddenMethod();
		 System.out.println("b val for sup ref " + obj1.b);
		 
		 Superclass obj2=new Superclass();
		 obj2.overriddenMethod();
		 
		// ChildClass obj3= (ChildClass) new Superclass();
		 
		 ChildClass.staticMethod();
		 System.out.println(4=='4');
		 

	}
}
