package algos.makemeapalindrome;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Problem01 {

    // Check to see if it is a palindrome
    private static Boolean couldBePalindrome(String input){
        String[] letters = input.split("");
        Map<String, Integer> letterCount = new HashMap<>();
        for (String letter : letters) {
            if (!letterCount.containsKey(letter)) {
                letterCount.put(letter, 1);
            } else {
                Integer count = letterCount.get(letter);
                letterCount.put(letter, ++count);
            }
        }
        Integer oddCount = 0;
        for (Map.Entry<String, Integer> entry : letterCount.entrySet()) {
            if ((entry.getValue() % 2) != 0)
                oddCount++;
        }
        return oddCount<=1;
    }

    public static String makeMeAPalindrome(String input) {
    /*
        check to see if it CAN be a palindrome
        if it can be, then sort the string.toCharArray in alphabetical order
        make a set, override each occurrence, so we have one of each letter
        build out the new string but only appending half of the # of occurrences,
        reverse the string, and append it to the end of the first string
    */

        Arrays.sort(input.toCharArray());
        if (!couldBePalindrome(input) ) {
            return "nope";
        }
        TreeMap<Character, Integer> entry = new TreeMap<>();
        for( Character c : input.toCharArray()){
            if(!entry.containsKey(c)){
                entry.put(c,1);
            }
            else{
                int value = entry.get(c);
                entry.put(c,value+1);
            }
        }

        String evenOutput = "";
        String oddOutput = "";
        for (Map.Entry<Character, Integer> a : entry.entrySet()) {
            if(a.getValue()%2 ==0){
                evenOutput += new String(new char[a.getValue()/2]).replace("\0",a.getKey().toString());
            }
            else{
                oddOutput = new String(new char[a.getValue()]).replace("\0", a.getKey().toString());
            }
        }
        return evenOutput + oddOutput+ new StringBuilder(evenOutput).reverse();
    }
}
