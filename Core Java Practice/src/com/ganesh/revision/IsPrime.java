import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class IsPrime {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        // BigInteger x = new BigInteger(n);
        // if(x.isProbablePrime((int)Integer.parseInt(n))){
        //     System.out.println("prime");
        // }else{
        //     System.out.println("not prime");
        // }   
        //isPrime(n);
        //isPrime1(n);
         BigInteger number = new BigInteger(n);
            if(number.isProbablePrime(1)){
                System.out.println("prime");
            }else{
                System.out.println("not prime");
            }       
        bufferedReader.close();
    }
    
    private static void isPrime(String n){
        int x = Integer.parseInt(n);
        if(x<=1){
            System.out.println("not prime");
            return;
        }
        int j = (int) Math.ceil(Math.sqrt(x));
        for (int i = 2; i < j; i++) {
            while(j%i==0){
                j=j/i;
            }
        }
        if(j==1){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }
    

private static void isPrime1(String n) {
    BigInteger x = new BigInteger(n);
    if (x.compareTo(BigInteger.ONE) <= 0) {
        System.out.println("not prime");
        return;
    }
    if (x.compareTo(BigInteger.valueOf(3)) <= 0) {
        System.out.println("prime");
        return;
    }
    if (!x.testBit(0) || !x.testBit(1) || !x.testBit(2)) {
        System.out.println("not prime");
        return;
    }
    if (x.isProbablePrime(10)) {
        System.out.println("prime");
    } else {
        System.out.println("not prime");
    }
}

}

