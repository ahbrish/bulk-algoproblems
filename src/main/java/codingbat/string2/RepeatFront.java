package codingbat.string2;

public class RepeatFront {
    /*
    Given a string and an int n, return a string made of the first n characters of the string,
    followed by the first n-1 characters of the string,and so on.
    You may assume that n is between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).
     */
    public String repeatFront(String str, int n){
        // declare and initialize a variable to hold the result
        String result = "";

        // using a for loop iterate through str
        for(int i = 0; i < n; n--){
            String word = str.substring(0,n);
            result = result + word;
        }
        return result;
    }
}
