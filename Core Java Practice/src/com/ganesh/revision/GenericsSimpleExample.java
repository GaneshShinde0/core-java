import java.io.*;
import java.util.*;

public class GenericsSimpleExample {

    public static void main(String[] args) {
        Integer[] intArr = {1,2,3};
        String[] str = {"Hello","World"};
        printArray(intArr);
        printArray(str);    
    }
    public static <T> void printArray(T[] array){
        for (T element:array){
            System.out.println(element);
        }
    }
}
