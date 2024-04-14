import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class Singleton{
    private static Singleton singleton  = null;
    public String str;
    
    private Singleton(){
        
    }
    public static Singleton getSingleInstance(){
        return (singleton!=null)? singleton: new Singleton();
    }

}
