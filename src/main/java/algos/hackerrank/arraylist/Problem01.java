package algos.hackerrank.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        Integer n = s.nextInt();
        s.nextLine();
        ArrayList<ArrayList<Integer>> x = new ArrayList<>(n);
        for (int i = 0; i < n; i++){
            String[] sInputs = s.nextLine().split("");
            int[] inputs = Arrays.stream(sInputs).mapToInt(Integer::parseInt).toArray();
            ArrayList<Integer> y = new ArrayList<>( inputs[0]+1);
            for (int j = 1; j <= inputs[0]; j++){
                y.add(inputs[j]);
            }
            x.add(i,y);
        }
        Integer q = s.nextInt();
        s.nextLine();
        for (int t = 0; t < q; t++){
            try {
                String[] inputs = s.nextLine().split("");
                int xQ = Integer.parseInt(inputs[0]);
                int yQ = Integer.parseInt(inputs[1]);
                ArrayList<Integer> innerList = x.get(xQ-1);
                System.out.println(innerList.get(yQ-1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}