package harmlessransomnote;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public Boolean harmlessRansomNote(String message, String magazineText){
        // return type Boolean
        // the harmless ransom note will return false when the word "secret" is used twice, and it's found once in the magazine text.
        // the harmless ransom note will return ture when the word "secret" is used once, and it's found once in the magazine text.

        // first I need to get the words by themselves by splitting them, and put them into an array
        // next I want to tally mark the number of occurrences of each word in the magazineText and message so a map would be best to use
            // declare and initialize 2 HashMaps
        // then we want to put these individual words into the maps that we created
            // use a for loop to iterate through the inputs magazineText and message and add them to the Maps
                // when adding them to the maps
                    // if the word does not currently exist in the map add it and give it a value of 1 as the key(for occurrence)
                    // else increase the count of occurrence if the word appears more than once.
        // once the words are added to their respective maps I want to start comparing
            // since it has fewer strings, pick the messageMap and iterate through it using a for each loop, they will be an entry set (key, value) pair
            // if the word from the messageMap occurs less than or equal to the number of times it occurs in the magazineMap, simply move on
            // else return false (meaning that the word occurs more times in the message than in the magazineText)

        String messageArray [] = message.split(" ");
        String magazineTextArray [] = magazineText.split(" ");

        Map<String, Integer> messageMap = new HashMap<>();
        Map<String, Integer> magazineTextMap = new HashMap<>();

        for (String messageWord: messageArray) {
            if(!messageMap.containsKey(messageWord)){
                messageMap.put(messageWord, 1);
            }
            else {
                Integer count = messageMap.get(messageWord);
                messageMap.put(messageWord, ++count);
            }
        }

        for (String magazineWord: magazineTextArray) {
            if(!magazineTextMap.containsKey(magazineWord)){
                magazineTextMap.put(magazineWord, 1);
            }
            else {
                Integer count = magazineTextMap.get(magazineWord);
                magazineTextMap.put(magazineWord, ++count);
            }
        }

        for (Map.Entry<String, Integer> messageEntry : messageMap.entrySet()) {
            if (magazineTextMap.containsKey(messageEntry.getKey())){
                Integer messageValue = messageEntry.getValue();
                Integer magazineTextValue = magazineTextMap.get(messageEntry.getKey());

                if (messageValue <= magazineTextValue){
                    continue;
                } else{
                    return false;
                }
            }

        }

        return true;
    }
}
