package algos.seeinghalf;

public class Solution {
    public String seeHalf(String message) {
        // return type String
        // if the original word has letters that are double letters make them single letters
        // if the original word has a letter that was a single letter, double it

        String newMessage = "";

        int i = 0;
        int length = message.length();
        while (i < length-1) {
            String currentLetter = String.valueOf(message.charAt(i));
            String nextLetter = String.valueOf(message.charAt(i + 1));

            if (currentLetter.equals(nextLetter)) {
                newMessage += currentLetter;
                i+=2;
            }

            else {
                newMessage += currentLetter + currentLetter;

                if(i == message.length()-2){
                    newMessage += nextLetter + nextLetter;
                }
                i++;
            }
        }
        return newMessage;
    }
}
