import java.io.*;
import java.util.*;

public class BitSetExamples {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt(); // Size of BitSets
        int m = scanner.nextInt(); // Number of operations
        
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
        
        for (int i = 0; i < m; i++) {
            String operation = scanner.next();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            
            switch(operation) {
                case "AND":
                    if (x == 1)
                        b1.and(b2);
                    else
                        b2.and(b1);
                    break;
                case "OR":
                    if (x == 1)
                        b1.or(b2);
                    else
                        b2.or(b1);
                    break;
                case "XOR":
                    if (x == 1)
                        b1.xor(b2);
                    else
                        b2.xor(b1);
                    break;
                case "FLIP":
                    if (x == 1)
                        b1.flip(y);
                    else
                        b2.flip(y);
                    break;
                case "SET":
                    if (x == 1)
                        b1.set(y);
                    else
                        b2.set(y);
                    break;
            }
            
            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }
        
        scanner.close();
    }
}
