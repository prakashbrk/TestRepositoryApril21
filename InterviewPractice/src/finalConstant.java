
public class finalConstant {
	
	final  int MAX;
	final  double PI;
	 finalConstant(int max){
		 MAX=max;
		 PI = 0;
		 
		System.out.println(MAX + " 1st constructor " + PI);
	 }
	 public finalConstant(double pi) {
		this.MAX = 0;
		this.PI=pi;
		System.out.println(MAX +" 2nd Constructor "+ PI);
	}
	 
	 public static String reverse(String str) {
		 
		 if (str.isEmpty()){
			 return str;
		 }
		 
		 
		 
//		 StringBuffer bStr=new StringBuffer(str);
//		 System.out.println(bStr.reverse());
//		 String revStr="";
//		 for(int i=str.length()-1;i>=0;i--) {
//			 revStr=revStr + str.charAt(i);
//		 }
//		 //return revStr;
		 return reverse(str.substring(1)) + str.charAt(0);
		 
	 }
	 

	public static void main(String[] args) {
		
		finalConstant obj= new finalConstant(10);
		finalConstant obj1= new finalConstant(11.11);
		String revStr=reverse("");
		System.out.println("Revrse of String: " + revStr);
		
				
	}

}
