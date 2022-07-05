package algos.palindrome;

public class Problem01 {
    public static Boolean isPalindrome(int x){

        // anything talking about a palindrome is going to be an array or arraylist
        // a palindrome can have an odd set of characters but only one
        // use a for loop to detect a palindrome
            // 1st iteration check the first and last index at the same time
                // if they are not equal it is not a palindrome
            // 2nd iteration check the second index and second to last index

        // return type Boolean
        // convert the integer input into a String
        StringBuilder builder = new StringBuilder();
        builder.append(x);

        Integer length = builder.length();
        Integer lastLetter = length-1;

        // using a for loop iterate through the String number
        for (int i = 0; i < builder.length()/2; i++){
            // declare a variable to store the letter at the beginning
            Character currentLetter = builder.charAt(i);
            // declare a variable to store the letter at the end
            Character endMatching = builder.charAt(lastLetter);
            // after store each letter to be compared

            lastLetter = lastLetter - 1;

            if (currentLetter == endMatching){
                return true;
            }
        }

        return false;
    }
}
