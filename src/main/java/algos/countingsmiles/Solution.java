package algos.countingsmiles;

public class Solution {
    public int countingSmiles (String faces){
        // return type int
        // count the number of smiley faces found in the String faces

        // declare String variables to store the smiles I am looking for
        String smileyFace1 = ":)";
        String smileyFace2 = "(:";

        // declare an int variable count to keep a count everytime a smileyFace is spotted
        int count  = 0;

        // using a for loop I want to iterate through the String faces
        for (int i = 0; i < faces.length()-1; i++){
            // declare a variable to store what a complete smileyFace is (example ":)")
            String fullSmileyFace = faces.substring(i,i+2);

            // compare the fullSmileyFace with the smileyFace 1 and 2 we are looking for, if match increase count
            if (fullSmileyFace.equals(smileyFace1) || fullSmileyFace.equals(smileyFace2)){
                count++;
            }
        }
        return count;
    }
}
