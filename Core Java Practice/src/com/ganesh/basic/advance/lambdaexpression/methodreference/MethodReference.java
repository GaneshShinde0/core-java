package com.ganesh.basic.advance.lambdaexpression.methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class MethodReference {

    public static void main(String[] args) {
        String[] names = {"Albert","Frodo","Lee","Nick","Lupin","Goemon","Genos","Goro"};
        List<String> list = Arrays.asList(names);
        list.forEach(System.out::println);
//        calculator((a,b)-> a+b, 10, 25);
        calculator(Integer::sum, 10, 25);
        calculator(Double::sum, 10.4, 25.2);

        Supplier<PlainOld> reference = () -> new PlainOld();
        Supplier<PlainOld> reference1 = PlainOld::new;

        PlainOld newPojo = reference1.get();

        System.out.println("Getting array");
        PlainOld[] pojo1 = seedArray(PlainOld::new, 10);

//        calculator((s1,s2)->s1.concat(s2),"Hello","World");
        calculator(String::concat,"Hello","World");

//        BinaryOperator<String> b1 = (s1,s2) -> s1.concat(s2);
        BinaryOperator<String> b1 = String::concat;
//        BiFunction<String,String,String> b2 = (s1,s2)->s1.concat(s2);
        BiFunction<String,String,String> b2 = String::concat;

//        UnaryOperator<String> u1 = (s1)->s1.toUpperCase();
        UnaryOperator<String> u1 = String::toUpperCase;
        System.out.println(b1.apply("hello","world"));
        System.out.println(b2.apply("hello","world"));
        System.out.println(u1.apply("hello"));

        String result = "hello".transform(u1);
        System.out.println("Result = "+result);

        result = result.transform(String::toLowerCase);
        System.out.println("Result = "+result);

        Function<String, Boolean> f0 = String::isEmpty;
        boolean resultBoolean = result.transform(f0);
        System.out.println("Result = "+resultBoolean);
    }

    private static<T> void calculator(BinaryOperator<T> function,T value1, T value2){
        T result = function.apply(value1, value2);
        System.out.println("Result of operation: "+ result);
    }

    private static PlainOld[] seedArray(Supplier<PlainOld> reference, int count){
        PlainOld[] array = new PlainOld[count];
        Arrays.setAll(array, i->reference.get());
        return array;
    }
}

class PlainOld {
    private static int last_id = 1;
    private int id;

    public PlainOld(){
        id = PlainOld.last_id++;
        System.out.println("Creating a POJO: id = "+id);

    }
}