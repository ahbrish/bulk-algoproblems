package algos.codeprep01;

import java.util.*;

public class Problem03 {
    public Integer[] numberFamily(Integer number, Integer[] possibleFamilyMembers){
        // return type Integer[]
        // find the "number" family members,
        // a family member is any value that's with in 1 of any other number in the family
        // if number = 4, then the family members are [3,4,5]

        // sort the array
        Arrays.sort(possibleFamilyMembers);
        // declare a hashmap to store all the subfamilies in one.
        HashMap<Integer, Set<Integer>> allFamilies = new HashMap<>();
        // declare a treeSet to store the individual subfamilies in
        TreeSet<Integer> subFamilies = new TreeSet<>();
        // put the first number in the index in the hashmap to begin with
        allFamilies.put(possibleFamilyMembers[0], subFamilies);
        // using a for loop iterate through the possibleFamilyMembers array
        for (int i = 0; i < possibleFamilyMembers.length; i++){
            // create a nested for loop that start at i+1 to iterate through the same array
            for(int j = i + 1; j < possibleFamilyMembers.length; j++){
                // declare an Integer currentNum and make it equal to possibleFamilyMembers[j-1]
                Integer currentNum = possibleFamilyMembers[j-1];
                // declare an Integer nextNum and make it equal to possibleFamilyMembers[j]
                Integer nextNum = possibleFamilyMembers[j];
                // if currentNum - nextNum is less than or equal to 1
                if(nextNum - currentNum <= 1){
                    // put currentNum in treeSet
                    subFamilies.add(currentNum);
                    // put nextNum in treeSet
                    subFamilies.add(nextNum);
                } else {
                    // initialize a new treeSet
                    subFamilies = new TreeSet<>();
                    allFamilies.put(currentNum, subFamilies);
                }
            }
        }

        Integer[] response = null;
        // this is a way to iterate through a map
        for(Map.Entry<Integer, Set<Integer>> entry : allFamilies.entrySet()){
            Set<Integer> value = entry.getValue(); // [1,2,3,4]
            if(value.contains(number)){
                response = new Integer[value.size()];
                System.arraycopy(value.toArray(),0,response,0,value.size());
            }
        }


        return response;
    }
}
