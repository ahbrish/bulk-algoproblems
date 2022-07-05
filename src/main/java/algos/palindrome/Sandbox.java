package algos.palindrome;

public class Sandbox {

    public static void main(String[] args) {
        String word = "racecar";

        Integer end = word.length()-1;

        for (int i = 0; i < word.length()/2; i++){
            Character currentLetter = word.charAt(i);
            Character endMatching = word.charAt(end);
            end = end - 1;
            if (currentLetter == endMatching){
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
    }
}
