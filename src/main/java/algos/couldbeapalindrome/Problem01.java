package algos.couldbeapalindrome;

import java.util.HashMap;
import java.util.Map;

public class Problem01 {
    public static Boolean couldBeAPalindrome(String input){

        // return type boolean
        // take the input and split by letter and store in an array
        String[] letters = input.split("");

        // create a map to store each letter and its number of occurrence
        Map<String, Integer> lettersMap = new HashMap<>();

        // using a for loop iterate through the array and fill up the lettersMap
        for (int i = 0; i < letters.length; i++) {
            // declare a variable to store the current letter
            String currentLetter = letters[i];
            if (!lettersMap.containsKey(currentLetter)) {
                lettersMap.put(currentLetter, 1);
            } else {
                Integer count = lettersMap.get(currentLetter);
                lettersMap.put(currentLetter, ++count);
            }
        }

            // a word is said to be a palindrome if at most it has one odd letter
            // declare a variable to hold the oddCount
            Integer oddCount = 0;
            for (Map.Entry<String, Integer> entry : lettersMap.entrySet()){
                // declare a variable to hold the key
                String key = entry.getKey();
                // declare a variable to hold the value
                Integer value = entry.getValue();

                if (value % 2 != 0){
                    oddCount++;
                }

                if (oddCount > 1){
                    return false;
                }
            }
        return true;
    }
}
