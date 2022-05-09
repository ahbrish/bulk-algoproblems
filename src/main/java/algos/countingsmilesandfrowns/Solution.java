package algos.countingsmilesandfrowns;

public class Solution {
    public double smileFrownRatio(String faces){
        // declare String variables to store the smiles and frowns I'm looking for.
        String smile1 = ":)";
        String smile2 = "(:";
        String frown1 = ":(";
        String frown2 = "):";

        // declare a double variable count for smiles spotted and frowns spotted
        double countSmiles = 0;
        double countFrowns = 0;

        // using a for loop iterate through the String faces
        for (int i = 0; i < faces.length()-1; i++){
            String fullFace = faces.substring(i, i + 2);

            if(fullFace.equals(smile1) || fullFace.equals(smile2)){
                countSmiles++;
            }
            if (fullFace.equals(frown1) || fullFace.equals(frown2)){
                countFrowns++;
            }
        }
        return countSmiles/countFrowns;
    }

}
