package algos.palindrome;

public class Problem03 {

    private static Boolean checkPalindrome(String s, int frontPointer, int endPointer){

        for (int x = frontPointer; x < s.length()/2; x++){
            if (s.charAt(frontPointer) == s.charAt(endPointer)){
                return true;
            }
            endPointer += -1;
        }
        return false;
    }

    public static Boolean validPalindrome(String s){

        // split string s and put letter into an array
        String[] letters = s.split("");
        // store the index of last variable into a variable
        Integer lastIndex = s.length()-1;
        // using a for loop iterate through the letters array
        for (int frontPointer = 0; frontPointer < letters.length/2; frontPointer++){
            // declare a variable to hold the front letter and end letter
            String firstChar = letters[frontPointer];
            String lastChar = letters[lastIndex];

            if (firstChar != lastChar) {
                return (checkPalindrome(s, frontPointer, lastIndex - 1)
                        ||
                        checkPalindrome(s, frontPointer + 1, lastIndex));
            }
            lastIndex += -1;
        }
        return true;
    }
}
