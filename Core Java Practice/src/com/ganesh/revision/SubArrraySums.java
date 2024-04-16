import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SubArrraySums {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i =0; i<n; i++){
            for(int j=i; j<n; j++){
                
                int sum = Arrays.stream(Arrays.copyOfRange(arr, i, j + 1)).sum(); 
                if(sum<0){
                    count++;
                }
              // sum += arr[j];
              //   if (sum < 0) {
              //       count++;
              //   }
            }
        }
        System.out.println(count);
        
    }
}
