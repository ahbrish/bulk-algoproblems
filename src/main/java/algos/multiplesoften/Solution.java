package algos.multiplesoften;

public class Solution {
    public int[] multipleOfTens(int[] nums){
        // return type integer array
        // return the array where each integer is updated to the next closest multiple of the integer and 10

        // using a for loop iterate through the array
        // if the num at current index modulus 2 yields a remainder, multiple current num by 2
        // if the num at current index modulus 5 yields a remainder, multiple current num by 5


        for (int i = 0; i < nums.length; i++){
            int currentNum = nums[i];
            if(currentNum % 2 != 0){
                currentNum = currentNum * 2;
            }
            if(currentNum % 5 != 0){
                currentNum = currentNum * 5;
            }
        }
        return nums ;

//        for (int i = 0; i < nums.length; i++){
//            if(nums[i] % 2 != 0){
//                nums[i] = nums[i] * 2;
//            }
//            if(nums[i] % 5 != 0){
//                nums[i] = nums[i] * 5;
//            }
//        }
//        return nums ;
    }
}
