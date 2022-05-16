package algos.codeprep03;

import java.util.*;

public class MaxOccurringChar {
    /*
    Complete the 'maximumOccurringCharacter' function below.

    The function is expected to return a CHARACTER.
    The function accepts STRING text as parameter.
     */

    public static char maximumOccurringCharacter(String text){
        // return type char
        // look at the String and return the character that occurs the most

        // declare a Hashmap to store the chars in and tally mark their occurrences
        // iterate through the String text and put each letter into a hashmap
        // if the letter is not in the map add it and give it the value of 1
        // otherwise find the letter in the map and increase its count before adding it back into the map
        // declare a map entry that takes in a character key and an integer value pair and make it equal to null
        // iterate through the map using a foreach loop inorder to access each entry<K,V> pair in the map
        // declare a variable to hold the current key
        // declare a variable to hold the current key's value
        // if the mapEntry is currently null or the entryValue co

        HashMap<Character, Integer> characterMap = new HashMap<>();

        for(char c : text.toCharArray()){
            if (!characterMap.containsKey(c)){
                characterMap.put(c, 1);
            } else {
                Integer count = characterMap.get(c);
                characterMap.put(c, ++count);
            }
        }

        Map.Entry<Character, Integer> maxEntry = null;

        for (Map.Entry<Character, Integer> entry : characterMap.entrySet()){
            Integer entryValue = entry.getValue();

            if (maxEntry == null || entryValue.compareTo(maxEntry.getValue()) > 0){
                maxEntry = entry;
            }
        }
        return maxEntry.getKey();
    }
}
