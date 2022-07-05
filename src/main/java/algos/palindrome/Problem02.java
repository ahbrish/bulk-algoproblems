package algos.palindrome;

public class Problem02 {
    public static Boolean isPalindrome(String s){

        // return type Boolean

        // make all letter to lowercase and remove punctuations
        String word = s.toLowerCase().replaceAll("[^A-Za-z]+", "");
        // using for loop iterate through the String s and remove non-alphanumeric characters

        // declare a variable to store index of last character
        Integer endOfWord = word.length() - 1;

        // using for loop iterate through the String s
        for (int i = 0; i < word.length()/2; i++){
            // declare a variable to store the currentLetter
            Character currentLetter = word.charAt(i);
            // declare a variable to store the lastLetter
            Character lastLetter = word.charAt(endOfWord);

            endOfWord = endOfWord -1;

            if(currentLetter != lastLetter){
                return false;
            }
        }
        return true;
    }
}
