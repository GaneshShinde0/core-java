package com.ganesh.basic.advance.lambdaexpression.challenge;

import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {

        Supplier<String> stringSupplier = ()-> "I Love Java";

        String iLoveJava = stringSupplier.get();

        System.out.println(iLoveJava);
    }
}
