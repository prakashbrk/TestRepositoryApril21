interface FunctionalInterFac{
	
	void sub(int a, int b);
}
public class LambdaConcept {

	public static void main(String[] args) {
		
		FunctionalInterFac f=(a,b)->{
			(a+b);
		};
		System.out.println(f.sub(10, 20));
	}

}
