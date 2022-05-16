package algos.codeprep02;

import java.util.Arrays;

public class Problem02 {

    public boolean solution(int[] A) {
        // return type boolean
        // given an array A consisting of N integers, return whether it is possible to split all integers into pairs
        // if possible return true, else false

        if (A.length % 2 != 0){
            return false;
        }
        Arrays.sort(A);

        for (int i = 0; i < A.length-1; i+=2){
            Integer currentNum = A[i];
            Integer nextNum = A[i+1];
            if (!currentNum.equals(nextNum)){
                return false;
            }
        }
        return true;
    }
}
