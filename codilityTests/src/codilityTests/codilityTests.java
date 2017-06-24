package codilityTests;
import java.util.*;
import  java.util.Arrays;
import java.util.stream.IntStream;

public class codilityTests {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		/*****************Test Problem 1******************************/
		/*Description:- Given two ints passed to a method return the position of first  in second
		 *  If there is no match return -1
		 * eg if A=23 and B=21234 return :2 
		 *    if A=11 and B=2345 return :-1
		 * */
		int A1=23;
		int B1=10345895;
		codeTask1 x= new codeTask1();
		int result1=x.solution(A1, B1);
		System.out.println(result1);

		/*****************Test Problem 2******************************/
		/* Given array {1,3,-3} as test case
		 * abs{LHS:max{1}-RHS:{max of(3,-3)}} => 2
		 * abs{LHS:max{1,3}-RHS:{max of(-3)}}=> 6
		 * abs{LHS:max{-3}-RHS:{0}=> -3
		 * 
		 * The max of 3 iterations above is 6, return this 
		 */

		int B[]={1,3,-3};
		CodeTask2 y=new CodeTask2();
		int result2=y.solution(B);
		System.out.println(result2);


		/*****************Test Problem 3******************************/
		/*The task is to find the defect in the code
		 * 	The code is to find longest trail of heads or tails when one value is flipped among adjacent coin in sequence of coins
		 * The unit test failed for scenario {1,1,1,1,0,0,0,0}=> {1,1,1,1,1,0,0,0} result should be 5
		 * Consider N coins aligned in a row. Each coin is showing either heads or tails. The adjacency of these coins is the number of adjacent pairs of coins with the same side facing up.
		 * that, given a non-empty zero-indexed array A consisting of N integers representing the coins, returns the maximum possible adjacency that can be obtained by reversing exactly one coin (that is, one of the coins must be reversed). Consecutive elements of array A represent consecutive coins in the row. Array A contains only 0s and/or 1s
		 * */

		int A[]={1,1,1,1,0,0,0,0};
		CodeTask3 z=new CodeTask3();
		int result3=z.solution(A);	
		System.out.println(result3);




		// collections tutorial calling array list and returning 

		//callArrayList callArray= new callArrayList();
		//callArray.itterateArrayList();


	}
}
