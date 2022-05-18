package algos.codeprep01;

import java.util.*;

public class Problem03 {
    public Integer[] numberFamily(Integer number, Integer[] possibleFamilyMembers){
        // return type Integer array
        // find the given number's family members
        // what qualifies a familyMember? any value that is within 1 of any other number in the family

        // sort the Integer Array
        Arrays.sort(possibleFamilyMembers);
        // declare a treeSet to store family members in
        Set<Integer> subFamily = new TreeSet<>();
        // I need to put the numbers in their own array then but the array in a map as the value in the K,V pair
        // declare a map with Integer as Key and a tree set as the value
            // I'll use a treeSet because it will sort the elements inorder, and it will not include duplicates
        Map<Integer, Set<Integer>> familiesMap = new HashMap<>();

        // create the first K,V pair in the FamiliesMap
        familiesMap.put(0, subFamily);

        // iterate through possibleFamilyMembers array starting i at 0
        for (int i = 0; i < possibleFamilyMembers.length; i++) {
            // create an inner for loop to iterate through the array starting at i + 1
            // this way I can compare two numbers next to each other
            for (int j = i + 1; j < possibleFamilyMembers.length; j++) {
                Integer currentNum = possibleFamilyMembers[j-1];
                Integer nextNum = possibleFamilyMembers[j];

                // if the difference between the numbers is less than or equal to 1 add both to treeSet
                // else create a new treeSet and add the nextNum at the key and the new treeSet as the value
                if (nextNum - currentNum <= 1) {
                    subFamily.add(currentNum);
                    subFamily.add(nextNum);
                } else {
                    subFamily = new TreeSet<>();
                    familiesMap.put(nextNum, subFamily);
                }
            }
        }

        // now that I have all the subFamilies in the map I need to return the largest subFamily
        // the return type is an array, so I'll declare a new empty array
        Integer response[] = null;
        // iterate through the map to look at each value
        for (Map.Entry<Integer, Set<Integer>> entry : familiesMap.entrySet()){
            // declare a variable to hold the value (remember the value is a Set)
            Set<Integer> entryValue = entry.getValue();

            if (entryValue.contains(number)){
                response = new Integer[entryValue.size()];
                System.arraycopy(entryValue.toArray(),0, response, 0, entryValue.size());
            }
        }
        return response;
    }
}
