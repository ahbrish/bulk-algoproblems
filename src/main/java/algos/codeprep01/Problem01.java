package algos.codeprep01;

import java.util.HashMap;
import java.util.Map;


public class Problem01 {
    public Integer countDuplicateLetters(String input, String letter){
        // return type integer
        // given a letter count the number of times it appears in the input

        // convert the input to all lowercase letters and separate each character
        char charArray[] = input.toLowerCase().toCharArray();

        // create a hashmap to store the number of occurrence of each letter
        Map<Character, Integer> charMap = new HashMap<>();

        // iterate through the charArray
        for (int i = 0; i < charArray.length; i++){
            Character currentChar = charArray[i];

            if(!charMap.containsKey(currentChar)){
                charMap.put(currentChar, 1);
            }
            else{
                Integer valueCount = charMap.get(currentChar);
                charMap.put(currentChar, ++valueCount);
            }
        }

        for (Map.Entry<Character, Integer> entry: charMap.entrySet()){
//            System.out.println(entry);
        }

        Character theCharToFind = letter.charAt(0);
        Boolean isCharInMap = charMap.containsKey(theCharToFind);
        Integer valueOfChar = charMap.get(theCharToFind);
        Integer output = isCharInMap? valueOfChar : 0;

        return output;
    }
}
