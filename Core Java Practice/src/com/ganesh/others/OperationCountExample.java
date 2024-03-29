package com.ganesh.others;

public class OperationCountExample {
    public static void main(String[] args) {
        String word = "programming";
        int input1 = 3;
        int input2 = 4;

        int count = operationCount(word, input1, input2);

        System.out.println("Number of operations: " + count);
    }

    private static int operationCount(String word, int input1, int input2) {
        String s1 = word;
        int i = 0;
        int len = word.length();
        do {
            StringBuilder str = new StringBuilder();
            if (i % 2 == 0) {
                str.append(s1.substring(len - input1));
                str.append(s1.substring(0, len - input1));
            } else {
                str.append(s1.substring(len - input2));
                str.append(s1.substring(0, len - input2));
            }
            i += 1;
            s1 = str.toString();
        } while (!word.equals(s1));
        return i;
    }
}
