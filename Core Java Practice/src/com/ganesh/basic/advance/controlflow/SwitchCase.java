package com.ganesh.basic.advance.controlflow;

public class SwitchCase {

    public static void main(String[] args) {
        int switchValue = 4;
        //Following is normal switch
        switch (switchValue) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Value is 3 or or 4 or 5");
                System.out.println("Actually it was " + switchValue);
                break;
            default:
                System.out.println("Something else");
                break;
        }

        // Following is enhanced switch: from jdk9
        switch (switchValue) {
            case 1 -> System.out.println("Value is 1");
            case 2 -> System.out.println("Value is 2");
            case 3, 4, 5 -> {
                System.out.println("Value is 3 or or 4 or 5");
                System.out.println("Actually it was " + switchValue);
            }
            default -> System.out.println("Something else");
        }
    }

    public String getQuarter(String month) {
        switch (month) {
            case "JANUARY":
            case "FEBRUARY":
            case "MARCH":
                return "1st";
            case "APRIL":
            case "MAY":
            case "JUNE":
                return "2nd";
            case "JULY":
            case "AUGUST":
            case "SEPTEMBER":
                return "3rd";
            case "OCTOBER":
            case "NOVEMBER":
            case "DECEMBER":
                return "4th";
            default:
                return "correct input";
        }
    }

    public String getQuarterUsingYield(String month) {
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st"; //{yield "1st";} also works
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };
    }
}
