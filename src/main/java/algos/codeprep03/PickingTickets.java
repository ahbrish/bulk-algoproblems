package algos.codeprep03;

import java.util.*;

public class PickingTickets {
     /*
    Complete the 'maxTicket' function below.

    The function is expected to return an INTEGER.
    The function accepts INTEGER_ARRAY ticket as parameter.
     */
    public int map(){
        maxTickets();
        return 0;
    }

    public static int maxTickets(List<Integer> tickets){
        // return type int
        // determine the maximum length of a subsequence chosen from the tickets array

        // tickets = [8,5,4,8,4]
        Collections.sort(tickets);
        // tickets = [4,4,5,8,8]

        // at minimum subsequence will be 1 because there will be a starting number to compare other numbers with
        int subsequence = 1;
        // this wil keep count of the largest unbroken range of integers
        int maxSequence = 0;

        // iterate through the tickets list
        for (int i = 0; i < tickets.size()-1; i++){
            Integer currentNum = tickets.get(i);
            Integer nextNum = tickets.get(i+1);
            Integer nextValue = tickets.get(i)+1;

            if (currentNum.equals(nextNum) || nextValue.equals(nextNum) ){
                subsequence++;
            } else {
                maxSequence = Math.max(maxSequence, subsequence);
                subsequence = 1;
            }
        }

        return maxSequence;
    }
}
