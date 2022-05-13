package algos.codeprep02;

import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class Problem01 {
    public int Solution(String S) {
        // return type int
        // return the minimum number of arrows that must be rotated to make the all point in the same direction
        // declare a hashmap to tally up the number of occurrences for each direction
        // split the String, then using a for loop iterate through the array
        // put each direction in map with number of occurrences <String,Integer>
        // turn map into an array list then sort it using collections.sort method
        // subtract the largest value(occurrence) from the length of the string

        HashMap<String, Integer> directionsMap = new HashMap<>();
        String directionsArray [] = S.split("");

        for(String arrow: directionsArray){
            if(!directionsMap.containsKey(arrow)){
                directionsMap.put(arrow, 1);
            }
            else{
                Integer count = directionsMap.get(arrow);
                directionsMap.put(arrow, ++count);
            }
        }

        ArrayList<Integer> arrayList = new ArrayList<>(directionsMap.values());
        Collections.sort(arrayList);
        Integer result = S.length() - arrayList.get(arrayList.size()-1);

        return result;
    }
}
