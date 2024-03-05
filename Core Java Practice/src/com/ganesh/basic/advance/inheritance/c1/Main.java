package com.ganesh.basic.advance.inheritance.c1;

public class Main {

    public static void main(String[] args) {
        Employee ganesh = new Employee("Ganesh", "11/11/1981","01/01/2010");
        System.out.println(ganesh);

        System.out.println("Age = "+ganesh.getAge());
        System.out.println("Pay = "+ganesh.collectPay());

        SalariedEmployee joe = new SalariedEmployee("Joe","12/29/1994","07/07/2017",100000);
        System.out.println(joe);

        System.out.println("Joe's Paycheck = $"+joe.collectPay());

        joe.retire();
        System.out.println("Joe's Pension Paycheck =$"+joe.collectPay());

        HourlyEmployee jane = new HourlyEmployee("Jane","05/05/1975","05/09/2019",15);
        System.out.println("Jane's Paycheck = $"+jane.collectPay());
        System.out.println("Jane's Holiday Paycheck = $"+jane.getDoublePay());
    }
}
