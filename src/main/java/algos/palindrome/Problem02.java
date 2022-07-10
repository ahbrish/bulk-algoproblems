package algos.palindrome;

import java.util.HashMap;
import java.util.Map;

public class Problem02 {
    public static Boolean isPalindrome(String s){

        // return type Boolean
        // first turn to lowercase, remove all spaces, and punctuations and store in a variable
        String preppedWord = s.toLowerCase().replaceAll("[^A-Za-z]+", "");

        // split letters and store in an array
        String[] letters = preppedWord.split("");

        // create a lettersMap
        Map<String, Integer> lettersMap = new HashMap<>();

        for (int i = 0; i < letters.length; i++){

            if (!lettersMap.containsKey(letters[i])){
                lettersMap.put(letters[i], 1);
            } else {
                Integer count = lettersMap.get(letters[i]);
                lettersMap.put(letters[i], ++count);
            }
        }

        Integer oddCount = 0;
        for (Map.Entry<String, Integer> entry : lettersMap.entrySet()){
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
