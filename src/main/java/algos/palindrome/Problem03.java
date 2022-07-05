package algos.palindrome;

public class Problem03 {

    private static boolean checkPalindrome(String s, int frontPointer, int endPointer) {

        String word = s;
        int front = frontPointer;
        int end = endPointer;

        for (int x = frontPointer; x < s.length()/2; x++ ){
            Character firstChar = s.charAt(frontPointer);
            Character lastChar = s.charAt(endPointer);
            if (firstChar == lastChar){
                return true;
            }
            endPointer += -1;
        }
        return false;
    }

    public static Boolean validPalindrome(String s){

        // declare a variable to store the lastChar
        int endPointer = s.length()-1;


        for (int frontPointer = 0; frontPointer < s.length()/2; frontPointer++){
            Character firstChar = s.charAt(frontPointer);
            Character lastChar = s.charAt(endPointer);
            if (firstChar != lastChar){
                return (checkPalindrome(s,frontPointer ,endPointer - 1) || checkPalindrome(s,frontPointer + 1,endPointer));
            }
            endPointer += -1;
        }
        return true;
    }
}
