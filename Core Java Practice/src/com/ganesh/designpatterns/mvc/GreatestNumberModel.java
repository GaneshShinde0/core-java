package com.ganesh.designpatterns.mvc;

public class GreatestNumberModel {
    public int findGreater(int a, int b){
        if(a>b){
            return a;
        } else{
            return b;
        }
    }
}
