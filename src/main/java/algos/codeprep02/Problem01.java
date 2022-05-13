package algos.codeprep02;

import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class Problem01 {
    public int Solution(String S) {
        // return type int
        // return the minimum number of arrows that must be rotated to make the all point in the same direction

        // declare a hashmap to tally up the number of occurrences for each direction
        HashMap<String, Integer> directionsMap = new HashMap<>();

        // split the String
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

//        List<Integer> valuesList = new ArrayList<>(directionsMap.values());
//        Collections.sort(valuesList);
//        System.out.println(valuesList);  //[1,4]

        System.out.println(arrayList);
//        Integer largestValue = valuesList.lastIndexOf();
//        System.out.println(largestValue);
        Integer lengthOfString = S.length();
        Integer largestVal = arrayList.get(arrayList.size()-1);

        Integer result = lengthOfString - largestVal;





//        // keep a count of each arrow direction to determine the direction most arrows are pointed
//        int upArrow = 0;
//        int downArrow = 0;
//        int leftArrow = 0;
//        int rightArrow = 0;
//
//        for (int i = 0; i < S.length(); i++){
//            // look at the substrings of the String
//            String subString = S.substring(i, i + 1);
//            // use a switch statement to watch for each direction, increase count of each direction depending on which one is spotted
//            switch (subString){
//                case "^":
//                    upArrow++;
//                    break;
//                case "v":
//                    downArrow++;
//                    break;
//                case "<":
//                    leftArrow++;
//                    break;
//                case ">":
//                    rightArrow++;
//                    break;
//            }
//        }
//// look at the count for each direction and store the greatest one in String goal
//        ArrayList<Integer> directions = new ArrayList<>();
//        directions.add(upArrow);
//        directions.add(downArrow);
//        directions.add(leftArrow);
//        directions.add(rightArrow);
//
//        Collections.sort(directions);
//
//        System.out.println(directions);
//
//        Integer largestValue = directions.get(3);
//        Integer lengthOfString = S.length();
//
//
//        return lengthOfString-largestValue;
//    }
        return result;
    }
}
