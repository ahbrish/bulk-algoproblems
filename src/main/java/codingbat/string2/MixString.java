package codingbat.string2;

public class MixString {
    /*
    Given two strings, a and b,
    create a bigger string made of the first char of a,
    the first char of b, the second char of a, the second char of b, and so on.
    Any leftover chars go at the end of the result.
     */

    public String mixString(String a, String b){

        // return type is String
        // alternate between the 2 words string a and string b and make a new word

        // first create a variable to hold the result
        String mix= "";

        // find the string with the smaller length and store it in a variable
        int min = Math.min(a.length(),b.length());

        // using a for loop iterate through the length of the smallest string
        for(int i = 0; i < min; i++) {
            char charOfA = a.charAt(i);
            char charOfB = b.charAt(i);

            mix += charOfA + charOfB;
        }
        String bWord = b.substring(min);
        String aWord = a.substring(min);
        mix += bWord + aWord;
        return mix;
    }

}