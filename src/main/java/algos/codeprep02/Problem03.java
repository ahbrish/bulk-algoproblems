package algos.codeprep02;

import java.util.*;

public class Problem03 {
    public String solution(String S){

        ArrayList<Character> lowerCaseLetters = new ArrayList<>();
        ArrayList<Character> upperCaseLetters = new ArrayList<>();

        for (int i = 0; i < S.length(); i++) {
            char currentLetter = S.charAt(i);

            if (Character.isUpperCase(currentLetter)) {
                upperCaseLetters.add(currentLetter);
            } else {
                lowerCaseLetters.add(currentLetter);
            }
        }

        Collections.sort(upperCaseLetters);
        System.out.println(upperCaseLetters);

        for (int i = upperCaseLetters.size()-1; i >= 0; i--){
            char currentChar = Character.toLowerCase(upperCaseLetters.get(i));

            if(lowerCaseLetters.contains(currentChar)){
                return upperCaseLetters.get(i).toString();
            }
        }


        return "NO";
    }
}
















