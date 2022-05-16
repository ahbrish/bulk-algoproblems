package algos.codeprep03;

import java.util.List;

public class ToolList {
    /*
    Complete the 'toolchanger' function below.

    The function is expected to return an INTEGER.
    The function accepts following parameters:
        1. STRING_ARRAY tools
        2. INTEGER startIndex
        3. STRING target
     */

    public static int toolchanger(List<String> tools, int startIndex, String target){

        // declare a variable to hold targetToolLocation
        int targetToolLocation = tools.indexOf(target);

        int length = tools.size();
        // declare variables to hold going left and going right
        int goRight = Math.abs(startIndex - targetToolLocation);
        int goLeft = Math.abs(tools.size() - startIndex - targetToolLocation);

        return Math.min(goLeft,goRight);
    }
}
