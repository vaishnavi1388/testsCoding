package codilityTests;

public class codeTask1 {
	 public int solution(int A,int B) 
	 {
	// converting integer to string in order to compare 
	String a = Integer.toString(A);
	String b = Integer.toString(B);
	//System.out.println(b.indexOf(a)); // prints "4"
	//int returnValue =Integer.parseInt(b); // prints "22"
	return b.indexOf(a);// returning the position of A in B, if there is no match then it will return -1 
	}
						
}
