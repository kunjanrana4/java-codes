import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


class Result {

    public static int maxTrailing(List<Integer> levels) {
        int i,diff, result = -1,size = levels.size();
        int max = levels.get(size-1);
        for(i=size-2;i>=0;i--){
            if(levels.get(i)>max){
                max=levels.get(i);
            }
            else{
                diff = max - levels.get(i);
                if(result<diff)
                    result = diff;
            }
        }
        if(result==0)
            return -1;
        return result;
    }

}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int levelsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> levels = new ArrayList<>();

        for (int i = 0; i < levelsCount; i++) {
            int levelsItem = Integer.parseInt(bufferedReader.readLine().trim());
            levels.add(levelsItem);
        }

        int result = Result.maxTrailing(levels);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
