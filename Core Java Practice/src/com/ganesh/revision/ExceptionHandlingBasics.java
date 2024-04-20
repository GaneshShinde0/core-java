import java.io.*;
import java.util.*;

public class ExceptionHandlingBasics {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        try{
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a/b);
        } catch (InputMismatchException e) {
            System.out.println(e.getClass().getName());
        }catch(Exception e){
            System.out.println(e.toString());
        }finally{
            sc.close();
        }
    }
}
