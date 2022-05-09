package algos.seeingdouble;

public class Solution {
    public String seeingDouble(String message) {
        // return type String
        // return a new message where every character in the original message is doubled in the new message

        String newMessage = "";

        for (int i = 0; i < message.length(); i++){
            char letter = message.charAt(i);
            newMessage += letter + "" + letter;
        }
        return newMessage;
    }
}
