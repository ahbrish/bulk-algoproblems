package algos.codeprep02;

import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class Problem01 {
    public int Solution(String S) {
        // return type int
        // return the minimum number of arrows that must be rotated to make the all point in the same direction
        // keep a count of each arrow direction to determine the direction most arrows are pointed
        // look at the substrings of the String
        // use a switch statement to watch for each direction, increase count of each direction depending on which one is spotted
        // look at the count for each direction and store the greatest one in String goal

        int upArrow = 0;
        int downArrow = 0;
        int leftArrow = 0;
        int rightArrow = 0;

        for (int i = 0; i < S.length(); i++){
            String subString = S.substring(i, i + 1);
            switch (subString){
                case "^":
                    upArrow++;
                    break;
                case "v":
                    downArrow++;
                    break;
                case "<":
                    leftArrow++;
                    break;
                case ">":
                    rightArrow++;
                    break;
            }
        }
        ArrayList<Integer> directions = new ArrayList<>();
        directions.add(upArrow);
        directions.add(downArrow);
        directions.add(leftArrow);
        directions.add(rightArrow);

        Collections.sort(directions);
        int result = S.length() - directions.get(directions.size()-1);

        return result;
    }
}
