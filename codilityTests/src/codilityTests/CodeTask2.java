package codilityTests;
import java.util.Arrays;

public class CodeTask2 {
	 public int solution(int[] A) 
	    {
	    	int maxLeft,maxRight;
	    	int result=0,lastIndex=0,currentValue=0,equilibriumValue=0,leftSum=0,rightSum=0;
	    	// loop through array
			for (int i=0;i<A.length-1;++i)
			{
				int[]leftHandArray,rightHandArray;
		    	
				lastIndex=A.length-1;
				currentValue=A[i];
				//make Left array  range from 0 to value of present value in loop
				//and right array range from value of next  to end of array
             leftHandArray = Arrays.copyOfRange(A, 0, i+1);
             rightHandArray = Arrays.copyOfRange(A, i+1, A.length);
             
             // find maximum of left hand array, if array is empty replace with 0
             maxLeft=leftHandArray.length>0?Arrays.stream(leftHandArray).max().getAsInt():0;

             // find maximum of right hand array, if array is empty replace with 0
             maxRight=rightHandArray.length>0?Arrays.stream(rightHandArray).max().getAsInt():0;
            // Math.abs(maxLeft-maxRight);
              //Arrays.sort(leftHandArray);
            // int maxLeft=leftHandArray[leftHandArray.length-1];
             //int maxRight=leftHandArray[leftHandArray.length-1];
             /* 
              * 1)substract max of left with max of right and  put it in result variable 
              * 2) compare the  previous value of result  with current result and assign the max value to result*/
             result = i==0 ?  Math.abs(maxLeft-maxRight) : result> (Math.abs(maxLeft-maxRight))?result:Math.abs(maxLeft-maxRight);
         
           
			}
			 return result;
	        
	    }
}
