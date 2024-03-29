package com.ganesh.basic.advance.lambdaexpression.predicate_consumer;

@FunctionalInterface
public interface Operation<T> {

    T operate(T value1, T value2); // Take two types and returns same type

}
