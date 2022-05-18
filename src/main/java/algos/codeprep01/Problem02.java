package algos.codeprep01;

import java.util.ArrayList;

public class Problem02 {
    public static Integer cousinTag(ArrayList<String> cousins, Integer startIndex, String targetName) {
        // return type Integer
        // determine the minimum number of left or right moves to reach the target

        // determine the index of the person to be tagged
        Integer targetIndex = cousins.indexOf(targetName);
        // determine the distance going left, take the index of the target person and subtract the index of the start person
        Integer goLeft = Math.abs(targetIndex - startIndex);
        // determine the distance going right, take the size of the array or number of players and subtract the index of the starting person
        Integer goRight = Math.abs(cousins.size()-startIndex);

        // use the math.min function to store the shortest distance
        Integer shortestDistance = Math.min(goLeft,goRight);

        return shortestDistance;
    }
}
