package com.ganesh.designpatterns.adapter;


public class PaymentApp{
    public int pay(int rupees){
        PaymentAdapter adapter = new PaymentAdapter();
        return adapter.pay(rupees);
    }

    public static void main(String[] args) {
        PaymentApp app = new PaymentApp();
        System.out.println(app.pay(1000)+"$");
    }
}

