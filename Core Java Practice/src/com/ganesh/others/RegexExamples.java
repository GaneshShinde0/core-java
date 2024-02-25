package com.ganesh.others;


import java.util.ArrayList;

public class RegexExamples {
    public static boolean isVisa(final String s) {
      //(^4[0-9]{15})|(^4[0-9]{12})
        return s.matches("^4[0-9]{15}|^4[0-9]{12}");
    }
    public static boolean isAmericanExpress(final String s) {
        return s.matches("^3(4|7)[0-9]{13}");
    }
    public static boolean isDiscover(final String s) {
      return s.matches("^6011[0-9]{12}|^65[0-9]{14}");
    }
    public static boolean isJCB(final String s) {
        return s.matches("(^2131[0-9]{11})|(^1800[0-9]{11})|(^35[0-9]{14})");

    }
    public String findCardTypeNumbers(String conversation, final String cardType)
    {
        String[] arr;
        conversation=conversation.replace(","," ");
        conversation=conversation.replace("."," ");
        arr =conversation.split(" ");
        ArrayList<String> s=new ArrayList<String>();
        int j=0;
        if (cardType.equals("American Express")){
          for (int i = 0; i < arr.length; i++) {
            if(isAmericanExpress(arr[i])){
              s.add(arr[i]);
              j+=1;
            }            
        }
        }
        else if (cardType.equals("Visa")){
          for (int i = 0; i < arr.length; i++) {
            if (isVisa(arr[i])){
              s.add(arr[i]);
              j+=1;            
            }            
        }
        }
        else if (cardType.equals("Discover")){
          for (int i = 0; i < arr.length; i++) {
            if (isDiscover(arr[i])){
              s.add(arr[i]);
              j+=1;  
            }            
        }
        }
        else if (cardType.equals("JCB")){
          for (int i = 0; i < arr.length; i++) {
            if (isJCB(arr[i])){
              s.add(arr[i]);
              j+=1;  
            }
        }
        }
        else {
              return "Not a valid card type";
        }
        //System.out.println(s.toString());
      return String.join(" ", s);
    }
}
/*
package com.fresco;

import java.util.ArrayList;

public class RegEx {
    public static boolean isVisa(final String s) {
        return s.matches("^4[0-9]{15}|^4[0-9]{12}");
    }
    public static boolean isAmericanExpress(final String s) {
        return s.matches("^3(4|7)[0-9]{13}");
    }
    public static boolean isDiscover(final String s) {
      return s.matches("^6011[0-9]{12}|^65[0-9]{14}");
    }
    public static boolean isJCB(final String s) {
        return s.matches("^2131[0-9]{11}|^1800[0-9]{11}|^35[0-9]{14}");

    }
    public String findCardTypeNumbers(String conversation, final String cardType)
    {
        String[] arr;
        conversation=conversation.replace(","," ");
        arr =conversation.split(" ");
        ArrayList<String> s=new ArrayList<String>();
        int j;
        if (cardType.equals("Visa")){
        j=0;
          for (int i = 0; i < arr.length; i++) {
            if (isVisa(arr[i])){
              s.add(arr[i]);
              j+=1;            
            }            
        }
        }
        else if (cardType.equals("American Express")){
        for (int i = 0; i < arr.length; i++) {
        j=0;
            if(isAmericanExpress(arr[i])){
              s.add(arr[i]);
              j+=1;
            }        
        }
        }
        else if (cardType.equals("Discover")){
        j=0;
          for (int i = 0; i < arr.length; i++) {
            if (isDiscover(arr[i])){
              s.add(arr[i]);
              j+=1;  
            }            
        }
        }
        else if (cardType.equals("JCB")){
          int j=0;
          for (int i = 0; i < arr.length; i++) {
            if (isJCB(arr[i])){
              s.add(arr[i]);
              j+=1;  
            }
        }
        }
        else {
              return "Not a valid card type";
        }
        System.out.println(s.toString());
      return s.toString();
    }
}
*/