package algos.palindrome;

public class Problem01 {
    public static Boolean isPalindrome(int x){

        // return type boolean
        // convert integer into a string using StringBuilder
        StringBuilder builder = new StringBuilder();
        builder.append(x);

        // declare a variable to hold the index of the last character
        Integer lastIndex = builder.length()-1;

        // using a for loop iterate through the string
        for (int i = 0; i < builder.length()/2; i++){
            // holds the letter in the front
            Character frontPointer = builder.charAt(i);
            // holds the letter in the back
            Character endPointer = builder.charAt(lastIndex);

            if (frontPointer != endPointer){
                return false;
            }
        }
        return true;
    }
}
