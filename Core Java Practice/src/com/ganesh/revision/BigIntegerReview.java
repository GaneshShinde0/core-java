import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BigIntegerReview {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n1 = sc.nextBigInteger();
        BigInteger n2 = sc.nextBigInteger();
        
        System.out.println((n1.add(n2))+"\n"+(n1.multiply(n2)));
    }
}
