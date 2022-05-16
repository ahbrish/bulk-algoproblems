package algos.codeprep01;

import java.util.HashMap;


public class Problem01 {
    public Integer countDuplicateLetters(String input, String letter){
//        // return type Integer
//        // count the number of times you see the letter specified
//
//        // declare a char array, turn input into lowercase letters and convert toCharArray
        char[] wordArray = input.toLowerCase().toCharArray();

//        // declare a hashmap with a character and integer key value pair to store the occurrences of each letter
        HashMap<Character, Integer> letterMap = new HashMap<>();

//        // using a for loop iterate through the indexed words
        for (int i = 0; i < wordArray.length; i++) {
            char currentLetter = wordArray[i];

            if (!letterMap.containsKey(currentLetter)){
                letterMap.put(currentLetter, 1);
            } else {
                Integer count = letterMap.get(currentLetter);
                letterMap.put(currentLetter, ++count);
                }
            }

        char theLetter = letter.charAt(0);
//        boolean isLetterInMap = letterMap.containsKey(theLetter);
//        Integer valueOfLetter = letterMap.get(theLetter);
//        Integer output = isLetterInMap? valueOfLetter : 0; // is 'a' in the letterMap? if yes return the value : if no return 0;
        return letterMap.get(theLetter);
    }
//


//        input = input.toLowerCase();
//
//        HashMap<Character, Integer> charCounter = new HashMap<>();
//
//        for (int i = 0; i < input.length(); i++){
//            Character c = input.charAt(i);
//
//            if(charCounter.containsKey(c)){
//                int count = charCounter.get(c) +1;
//                charCounter. put(c, count);
//            }
//
//            else{
//                charCounter.put(c, 1);
//            }
//        }
//
//        Integer response = (charCounter.containsKey(letter.charAt(0)))? charCounter.get(letter.charAt(0)):0;
//        return response;
//    }
}
