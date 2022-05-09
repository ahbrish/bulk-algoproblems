package algos.seeinghalf;

public class Solution {
    public String seeHalf(String message){
        // return type String
        // if the original word has letter that are double letter make them single letter
        // if the original word has letter was a single letter, double it


        String checkLetter = "";
        String currentChar = "";
        String nextChar = "";
        int i = 0;
        while (i < message.length()-1) {
            currentChar = String.valueOf(message.charAt(i));
            nextChar  = String.valueOf(message.charAt(i+1));

            if(currentChar.equals(nextChar)) {
                checkLetter += currentChar;
                i += 2;
            }
            else{
                checkLetter += currentChar + currentChar;
                if(i == message.length()-2){
                    checkLetter += nextChar + nextChar;
                }
                i++;
            }
        }
        return checkLetter;
    }
}
