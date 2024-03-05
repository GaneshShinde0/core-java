package com.ganesh.basic.advance.utilities;

import java.util.Random;

public class UtilMath {

    public static void main(String[] args) {
        int maxMinusFive= Integer.MAX_VALUE-5;
        for(int j=0, id = maxMinusFive;j<10;id++,j++){
            System.out.printf("Assigning id %,d%n",id);
        }

        System.out.println(Math.abs(-50));
        System.out.println(Math.abs(Integer.MIN_VALUE));
        //System.out.println(Math.absExact(Integer.MIN_VALUE));

        System.out.println(Math.abs((long) Integer.MIN_VALUE));

        System.out.println("Max = "+Math.max(10,-10));
        System.out.println("Max = "+Math.max(10.0000001,10.0000002));
        System.out.println("Max = "+Math.max(10.0000001f,10.0000002f));
        System.out.println("Max = "+Math.max(10.0000001d,10.0000002f));
        System.out.println("Max = "+Math.max(10.0000001,10.0000002f));

        System.out.println("Round Down = "+Math.round(10.2));
        System.out.println("Round Up = "+Math.round(10.8));

        System.out.println("Round ? = "+Math.round(10.5));
        System.out.println("Floor = "+Math.floor(10.8)+ ", Ceil = "+Math.ceil(10.2));
        
        System.out.println("Square Root = "+ Math.sqrt(100));
        System.out.println("Power =" + Math.pow(2,8));

        for(int i=0; i<10;i++){
            System.out.println((int) Math.random()*10+1);
        }

        for(int i=0; i<10;i++){
            System.out.printf("%1$d = %1$c%n", (int) (Math.random()*26)+65);
        }
        System.out.println("---------------------------");
        Random r = new Random();
        for(int i=0; i<10;i++){
            System.out.printf("%1$d = %1$c%n", (int) (r.nextInt(65,91))+65);
        }
        System.out.println("---------------------------");
        r = new Random();
        for(int i=0; i<10;i++){
            System.out.printf("%1$d = %1$c%n", (int) (r.nextInt((int) 'A',(int) 'Z')));
        }

        System.out.println("---------------------------");
        for(int i=0; i<10;i++){
            System.out.printf("%1$d ", (int) (r.nextInt()));
        }

        System.out.println("-----------------------------------");
        for(int i=0; i<10;i++){
            System.out.printf("%1$d%n ", (int) (r.nextInt(-10,11)));
        }

        System.out.println("-----------------------------------");
        r.ints(0,10).limit(5).forEach(System.out::println);

        System.out.println("-----------------------------------");
        r.ints(5,0,10).forEach(System.out::println);

        System.out.println("-----------------------------------");
        r.ints(10).forEach(System.out::println);

        long nanoTime = System.nanoTime();
        Random pseudoRandom = new Random(nanoTime);
        System.out.println("-----------------------------------");
        pseudoRandom.ints(10,0,10).forEach(i->System.out.print(i+ " "));
        Random notReallyRandom = new Random(nanoTime);
        System.out.println("\n-----------------------------------");
        notReallyRandom.ints(10,0,10).forEach(i->System.out.print(i+ " "));

    }
}
