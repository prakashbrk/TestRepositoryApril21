import java.time.format.DateTimeFormatter;

abstract class Test{
	Test(){
		System.out.println("Default constructor in abstract class");
	}
	Test(int a){
		System.out.println("in parameterised constructor " + a);
	}
	
	abstract void checking();
	
	
	
}

public class COnstructorInAbstractClass extends Test{
	

	public static void main(String[] args) {
		
		Test obj=new COnstructorInAbstractClass();
		obj.checking();
		//DateTimeFormatter d=DateTimeFormatter.ofPattern("yyyy/mm/dd");
		

	}

	@Override
	void checking() {
		System.out.println("abstarct method in child class");
		
	}

}
