package algos.harmlessransomnote;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public Boolean harmlessRansomNote(String message, String magazineText) {
        // return type Boolean
        // return false if the ransomNote has a word that occurs more times than it does in the magazineText
        // return true if the ransomNote has a word that occurs equal number of times as it does in the magazineText

        // put the message and the magazineText both into an array inorder to index every word
        // use a for loop to iterate through the arrays and store the words into the hashmaps
        // declare two HashMaps and store the messageArray and the magazineTextArray
            // if the word is not currently in the hashmap give it a value of 1
            // else increase the value
        // once all the words are indexed and tally marked for their occurrences iterate through the small array the messageMap
        // compare the occurrences of each word from both the messageMap and the magazineTextMap

        String messageArray[] = message.split(" ");
        String magazineTextArray[] = magazineText.split(" ");

        HashMap<String, Integer> messageMap = new HashMap<>();
        HashMap<String, Integer> magazineTextMap = new HashMap<>();

        for (int i = 0; i < messageArray.length; i++){
            String currentWord = messageArray[i];
            if(!messageMap.containsKey(currentWord)){
                messageMap.put(currentWord, 1);
            } else {
                Integer count = messageMap.get(currentWord);
                messageMap.put(currentWord, ++count);
            }
        }

        for (int i = 0; i < magazineTextArray.length; i++){
            String currentWord = magazineTextArray[i];
            if(!magazineTextMap.containsKey(currentWord)){
                magazineTextMap.put(currentWord, 1);
            } else {
                Integer count = magazineTextMap.get(currentWord);
                magazineTextMap.put(currentWord, ++count);
            }
        }

        for (Map.Entry<String, Integer> messageEntry: messageMap.entrySet()) {   // waterfall : 1
            // if the magazineTextMap contains the word
            if(magazineTextMap.containsKey(messageEntry.getKey())){
                // get the value/number of occurrence of the word in the message and in the magazine then compare them
                Integer messageValue = messageEntry.getValue();
                Integer magazineValue = magazineTextMap.get(messageEntry.getKey());
                // if the value in message is greater than the value in magazineText return false else return true
                if(messageValue > magazineValue){
                    return false;
                }
            }
        }


        return true;
    }
}
