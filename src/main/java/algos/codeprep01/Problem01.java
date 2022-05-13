package algos.codeprep01;

import java.util.HashMap;


public class Problem01 {
    public Integer countDuplicateLetters(String input, String letter){
        // return type Integer
        // count the number of times you see the letter specified

        // declare an array and split the input
        String wordArray[] = input.split(" ");

        // declare a hashmap with a character and integer key value pair to store the occurrences of each letter
        HashMap<String, Integer> letterMap = new HashMap<>();

        // using a for loop iterate through the indexed words
        for (int i = 0; i < wordArray.length; i++) {
            String[] letterArray = wordArray[i].split("");
            for(int j = 0; j < letterArray.length; j++){
            String currentLetter = letterArray[j];

            if (!letterMap.containsKey(currentLetter.toLowerCase())){
                letterMap.put(currentLetter.toLowerCase(), 1);
            } else {
                Integer count = letterMap.get(currentLetter.toLowerCase());
                letterMap.put(currentLetter.toLowerCase(), ++count);
                }
            }
        }

        return letterMap.get(letter);
    }
}
