package pack1;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class PMResult {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) 
    {
    // Write your code here
        int posCount=0;
        int negCount=0;
        int zCount=0;
        int size=arr.size();
        for(int i=0;i<size;i++)
        {
            int num=arr.get(i);
            if(num<0) negCount++;
            else if(num>0) posCount++;
            else zCount++;
        }
        System.out.println((double)(posCount/size));
        System.out.println((double)(negCount/size));
        System.out.println((double)(zCount/size));
    }

}

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        PMResult.plusMinus(arr);

        bufferedReader.close();
    }
}
