package algos.seeingdouble;

public class Solution {
    public String seeingDouble(String message) {
        // return type String
        // return a new message where every character in the original message is doubled in the new message
        // abe ---> aabbee

        // declare a String variable to store the result
        String newMessage = "";

        // using a for loop iterate through the message
        for (int i = 0; i < message.length(); i++){
            // declare a String variable to store each letter
            Character letter = message.charAt(i);
            // output equals the letter plus letter
            newMessage += letter + "" +letter;
        }
    return newMessage;
    }
}
