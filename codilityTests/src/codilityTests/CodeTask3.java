package codilityTests;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CodeTask3 {
	
	int solution(int[] A) {
		int head=0,tail=0; 
        int n = A.length;
        int result = 0;
        for (int i = 0; i < n - 1; i++) {
            if (A[i] == A[i + 1])
            	// count of no of heads and no of tails added by me
            	head = A[i]==1? head+1: head; // 
            tail = A[i]==0? tail+1: tail;
                result = result + 1;
        }
        int r = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            if (i > 0) {
                if (A[i - 1] != A[i]) // match present position to previous position 
                    count = count + 1;
                else
                    count = count - 1;
                head = head;
            }
            if (i < n - 1) {
                if (A[i + 1] != A[i]) // match presnet with previous
                    count = count - 1; // if we have 4 of 1's, next position is 0, then we increase the count
                else
                    count = count + 1; // doesn't match make count+1
            }
            head = A[i]==1&&count>0? count+head: head; // if not flipped return count+head, else return head
            tail = A[i]==0&&count>0? count+tail: tail; //if not flipped for count+tail, else return tail
            r = Math.max(r, count);
        }
        return head>=tail?head: tail;
    }
	
}
