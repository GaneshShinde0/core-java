import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
         boolean res = false;
    // Complete the function
    if(a.length() == b.length()){

        char[]  A = a.toLowerCase().toCharArray();
        char[]  B = b.toLowerCase().toCharArray();

        java.util.Arrays.sort(A);
        java.util.Arrays.sort(B);
        a = java.util.Arrays.toString(A);
        b= java.util.Arrays.toString(B);

        if( a.compareTo(b) == 0){
            res = true;
        }
    }
    return res;
}

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
