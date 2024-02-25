package com.ganesh.basic.advance.generics;

public class NormalVsGenericClass {
}

class RegularClass{
    private String field;
}

class GenericClass<T>{

    // T is the placeholder for Type Identifier.
    // ArrayList<String> listOfString;
    // ReferenceType<TypeParameter> variableName
    private T field;
}
