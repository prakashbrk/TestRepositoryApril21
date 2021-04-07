import java.util.TreeSet;

public class treeSet {
	
	
	public static void main(String[] args) {
		
		TreeSet<String> ts=new TreeSet<>();
		ts.add("Prak");
		ts.add("PrakashBarik");
		ts.add("Prak");
		ts.add("Prakash");
		
		
		for (String item : ts) {
			System.out.println(item);
		}
	}

}
