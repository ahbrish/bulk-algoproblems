package algos.distinctelements;

import java.lang.reflect.Array;
import java.util.*;

public class DistinctElements {

    private Map<Integer, Integer> mapNumbers(int[] arr){

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++){
            Integer currentNum = arr[i];

            if (!map.containsKey(currentNum)){
                map.put(currentNum, 1);
            } else {
                Integer count = map.get(currentNum);
                map.put(currentNum, ++count);
            }
        }

        return map;
    }

    private ArrayList<Map.Entry<Integer, Integer>> sortListOfMapEntries(Map<Integer, Integer> map) {
        ArrayList<Map.Entry<Integer, Integer>> mapList = new ArrayList<>(map.entrySet());
        Collections.sort(mapList, DistinctElements::compareEntries);
        return mapList;
    }

    private static int compareEntries(Map.Entry<Integer, Integer> a, Map.Entry<Integer, Integer> b){
        return a.getValue().compareTo(b.getValue());
    }

    private LinkedHashMap<Integer, Integer> sortedMap(ArrayList<Map.Entry<Integer, Integer>> list){
        LinkedHashMap<Integer, Integer> linkedMap = new LinkedHashMap<>();
        for (Map.Entry<Integer,Integer> entry : list){
            linkedMap.put(entry.getKey(), entry.getValue());
        }
        return linkedMap;
    }



    public int distinctIds(int[] arr, int limit){

        // return type int
        // create a hashmap and store the values and their occurrences
        Map<Integer, Integer> map = mapNumbers(arr);

        // create a list of map entries <Integer, Integer>
        ArrayList<Map.Entry<Integer, Integer>> list = sortListOfMapEntries(map);

        // add to a linkedhashmap to maintain order
        LinkedHashMap<Integer, Integer> sortedMap = sortedMap(list);

        // remove entries in original map by the current key's value in the sorted map
        // this will both remove the entry from the map
        // as well as decreasing the limit until no more are taken
        // since map was sorted and order maintained, we know it will
        // only take from largest to smallest

        for (int i: sortedMap.keySet()){
            if(sortedMap.get(i) <= limit){
                limit = limit - sortedMap.get(i);
                map.remove(i);
            }
        }
        return map.size();
    }
}
