package algos.codeprep03;

import java.util.*;

public class PickingTickets {
     /*
    Complete the 'maxTicket' function below.

    The function is expected to return an INTEGER.
    The function accepts INTEGER_ARRAY ticket as parameter.
     */

    public static int maxTickets(List<Integer> tickets){
        // return type int
        // determine the maximum length of a subsequence chosen from the tickets array

        // tickets = [8,5,4,8,4]

//        Collections.sort(tickets);
//
//
//        HashMap<Integer, ArrayList<Integer>> sequencesMap = new HashMap<>();
//
//        ArrayList<Integer> subArray = new ArrayList<>();
//        sequencesMap.put(tickets.get(0), subArray);
//        subArray.add(tickets.get(0));
//
//        for (int i = 1; i < tickets.size()-2; i++){
//            for (int j = i+1; j < tickets.size(); j++) {
//                int currentNum = tickets.get(j-1);
//                int nextNum = tickets.get(j);
//
//                if (nextNum - currentNum <= 1){
//                    subArray.add(currentNum);
//                    subArray.add(nextNum);
//                } else {
//                    subArray = new ArrayList<>();
//                    sequencesMap.put(currentNum, subArray);
//                }
//            }
//        }
//
//        System.out.println(subArray);
//        System.out.println(sequencesMap);
//
//        Map.Entry<Integer, ArrayList<Integer>> maxEntry = null;
//
//        for (Map.Entry<Integer, ArrayList<Integer>> entry : sequencesMap.entrySet()){
//            Integer entryValue = entry.getValue().size();
//            String f = "";
//
//        }
        int frequency[] = new int[101];
        int result = Integer.MIN_VALUE;

        for (int i = 0; i < tickets.size(); i++) {
            int index=tickets.get(i);
            frequency[index]++; //frequency[index]=frequency[index]+1
        }

        for (int i = 1; i <= 100; i++) {
            result = Math.max(result, frequency[i] + frequency[i - 1]);
        }
        return result;

    }
}
