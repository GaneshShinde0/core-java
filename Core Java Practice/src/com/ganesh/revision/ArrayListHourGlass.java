import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class ArrayListHourGlass {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        bufferedReader.close();
     // Function to calculate the sum of an hourglass
        
        // Initialize maximum sum to negative infinity
        int maxSum = Integer.MIN_VALUE;

        // Iterate over each possible hourglass and update maxSum if necessary
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int currentSum = hourglassSum(arr, i, j);
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        // Output the maximum sum
        System.out.println(maxSum);
    }
        
        
        public static int hourglassSum(List<List<Integer>> arr, int i, int j) {
            return (arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2) +
                    arr.get(i+1).get(j+1) +
                    arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2));
        }

}
