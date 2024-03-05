package com.ganesh.basic.advance.utilities;

import java.math.BigDecimal;
import java.util.Arrays;

public class BigDecimalExamples {

    public static void main(String[] args) {
        double policyAmount = 100_000_000;
        int beneficiaries = 3;
        float percentageFloat = 1.0f/beneficiaries;
        double percentage = 1.0/beneficiaries;

        System.out.printf("Payout = %,.2f%n", policyAmount*percentageFloat);
        System.out.printf("Payout = %,.2f%n", policyAmount*percentage);

        double totalUsingFloat = policyAmount - ((policyAmount*percentage)*beneficiaries);
        System.out.printf("totalusingFloat: %,.2f%n",totalUsingFloat);

        // Fractional numbers may not be able to be accurately represented by floating point numbers.

        String[] tests = {"15.234","9","10000.0001",".123"};
        BigDecimal[] bds = new BigDecimal[tests.length];
        Arrays.setAll(bds,i->new BigDecimal(tests[i]));

        System.out.printf("%-14s %-15s %-8s %s%n", "Value", "Unscaled Value", "Scale", "Precision");
        for (var bd:bds){
            System.out.printf("%-14s %-15s %-8s %s%n", bd, bd.unscaledValue(),bd.scale(), bd.precision());

        }
    }
}
