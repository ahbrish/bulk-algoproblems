package algos.codedIffforever;

import jdk.swing.interop.SwingInterOpUtils;

public class Solution {

    public static String codeDiffForever(int n){
        // return type String
        // declare and initialize an empty String variable called output
        // using for loop start at 1 and run the length of n, and increment by 1 each time
        // if (i % 15 == 0)/ ((i%3==0) && (i%5==0) print output += CodeDiffForever
        // elseif (i%3==0) print output += Code
        // elseif (i%5==0) print output += Diff
        // else return output += i
        // return output

        String output = "";

        for (int i = 1; i <= n; i++) {

            if ((i % 3 == 0) && (i % 5 == 0)){
                output += "CodeDiffForever" + "\n";
            }
            else if(i % 3 == 0) {
                output += "Code" + "\n";
            } else if (i % 5 == 0) {
                output += "Diff" + "\n";
            } else {
                output += i + "\n";
            }
        }
        System.out.println(output);
        return output;
    }}
