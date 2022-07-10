package algos.hackathon;

public class DnaStrand {

    public static String dnaComplement(String s) {

        // declare a result variable
        String reversed = "";

        for (int i = s.length()-1; i >= 0; i--){

            // declare a variable to hold the current letter
            Character currentLetter = s.charAt(i);

            switch (currentLetter){
                case 'A':
                    currentLetter = 'T';
                    break;
                case 'C':
                    currentLetter = 'G';
                    break;
                case 'G':
                    currentLetter = 'C';
                    break;
                case 'T':
                    currentLetter = 'A';
                    break;
            }
            reversed = reversed + currentLetter;
        }


        return reversed;
    }

}
