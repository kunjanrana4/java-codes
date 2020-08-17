import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


class Result {
    public static int roverMove(int matrixSize, List<String> cmds) {
        int i,j,k;
        k=0;
        int matrix[][] = new int[matrixSize][matrixSize];
        for(i = 0;i<matrixSize;i++){
            for(j=0;j<matrixSize;j++,k++){
                matrix[i][j] = k;
            }
        }

        i=0;
        j=0;
      for(k=0;k<cmds.size();k++){
          switch(cmds.get(k)){

              case "RIGHT" :    if(j+1<matrixSize)
                                    j=j+1;
                                break;
              case "LEFT" :     if(j-1>=0)
                                    j=j-1;
                                break;
              case "UP" :       if(i-1>=0)
                                    i=1-1;
                                break;
              case "DOWN" :     if(i+1<matrixSize)
                                    i=i+1;
                                break;
          }
      }
      return matrix[i][j];
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int matrixSize = Integer.parseInt(bufferedReader.readLine().trim());

        int cmdsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> cmds = new ArrayList<>();

        for (int i = 0; i < cmdsCount; i++) {
            String cmdsItem = bufferedReader.readLine();
            cmds.add(cmdsItem);
        }

        int result = Result.roverMove(matrixSize, cmds);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
