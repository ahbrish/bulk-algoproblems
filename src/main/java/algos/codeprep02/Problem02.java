package algos.codeprep02;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Problem02 {

    public boolean solution(int[] A){
        return false;
    }

    public static void main(String[] args) {
        Integer A [] = {1,2,2,3};

        Arrays.sort(A);
        Map<Integer, Integer> records = new HashMap<>();
        int maxnumPairs = 0;
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                Integer num1 = A[i];
                Integer num2 = A[j];
                if (num1.equals(num2)) {
                    records.put(num1, num2);
                }
            }
            System.out.println(maxnumPairs / 2);
        }
//        Arrays.sort(A);
//
//        // put all the pairs in here whether they have one or not
//        HashMap<Integer, List<Integer>> theList = new HashMap<>();
//
//        Set<Integer> numbers = new ArrayList<>();
//
//        theList.put(A[0], numbers);
//
//        for (int i = 0; i < A.length; i++){
//            for (int j = i + 1; j < A.length; j++) {
//                Integer currentNum = A[j-1];
//                Integer nextNum = A[j];
//
//                if(currentNum.equals(nextNum)){
//                    numbers.add(currentNum);
//                    numbers.add(nextNum);
//                }
//                else {
//                    numbers = new ArrayList<>();
//                    theList.put(currentNum, numbers);
//                    int save = 0;
//                }
//            }
//
//        }
//        System.out.println(numbers);
    }
}
