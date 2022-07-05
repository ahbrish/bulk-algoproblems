package algos.couldbeapalindrome;

import java.util.HashMap;
import java.util.Map;

public class Problem01 {
    public static Boolean couldBeAPalindrome(String input){

        // return type Boolean
        // split the input word and store in a String array
        String[] letters = input.split("");
        // create a hashmap that will hold each letter and its occurrence
        Map<String, Integer> letterMap = new HashMap<>();

        // using a for loop iterate through the array and put the letters in the map with the occurrences
        for (int i = 0; i < letters.length; i++){
            String letter = letters[i];
            if(!letterMap.containsKey(letter)){
                letterMap.put(letter, 1);
            } else {
                Integer count = letterMap.get(letter);
                letterMap.put(letter, ++count);
            }
        }
        // a word can form a palindrome if at most have 1 one character occurs odd number of times
        // therefore I need to track the odd count and make sure its <= 1
        Integer oddCount = 0;

        for (Map.Entry<String, Integer> entry : letterMap.entrySet()){
            String letterKey = entry.getKey();
            Integer letterValue = entry.getValue();
            // if the letterValue modulus 2 is not 0, increase oddCount
            // if oddCount is > 1 that means there is more than 1 letter that occurs only once
            if (letterValue % 2 != 0){
                oddCount++;
            }
        }

        if(oddCount > 1){
            return false;
        }
        return true;
    }
}
