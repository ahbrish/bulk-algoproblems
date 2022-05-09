package algos.ultraEncryptor;

public class Solution {
    public static String greatEncrypt (String message, int shift){
        // declare a String variable to store the output
        String newMessage = "";

        // using a for loop iterate through the message
        for (int i = 0; i < message.length(); i++){
            // declare a variable to store current character
            Character currentChar = message.charAt(i);
            // if currentChar is not a letter don't shift, just return it
            switch (currentChar){
                case ' ':
                    newMessage += " ";
                    break;
                case '!':
                    newMessage += "!";
                    break;
                case ',':
                    newMessage += ",";
                    break;

            }
            // if the currentChar is an uppercase letter do the following
            if (Character.isUpperCase(currentChar)) {
                // declare a variable to store new character once shifted
                newMessage += (char) ((currentChar + shift - 'A') % 26 + 'A');
            }
            // if the currentChar is a lowercase letter do the following
            if (Character.isLowerCase(currentChar)) {
                // declare a variable to store new character once shifted
                newMessage += (char) ((currentChar + shift - 'a') % 26 + 'a');
            }
        }
        System.out.println(newMessage);
        return newMessage;
    }
}
