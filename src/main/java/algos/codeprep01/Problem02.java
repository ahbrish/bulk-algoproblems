package algos.codeprep01;

import java.util.ArrayList;

public class Problem02 {
    public static Integer cousinTag(ArrayList<String> cousins, Integer startIndex, String targetName){
        // return type Integer
        // Given the name of the next person needed, determine the minimum number of left or right moves to reach it

        // we know target location, the name of the person we want to find
        int targetLocation = cousins.indexOf(targetName);
        int goLeft = Math.abs(startIndex - targetLocation);
        int length = cousins.size();
        int goRight = Math.abs(cousins.size()-startIndex-targetLocation);

        return Math.min(goLeft,goRight);
    }
}
