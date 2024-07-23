package com.ganesh.revision;

import java.io.*;
import java.util.Stack;
import java.util.stream.IntStream;

class Result {

    public static String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            }
            if ((c == '}' || c == ']' || c == ')')) {
                if (stack.isEmpty()) {
                    return "NO";
                }
                if ((stack.peek() == '{' && c == '}') || (stack.peek() == '(' && c == ')') || (stack.peek() == '[' && c == ']')) {
                    stack.pop();
                } else {
                    return "NO";
                }
            }
        }
        return stack.isEmpty() ? "YES" : "NO";
    }
}

public class BracketBalancer {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(i -> {
            try {
                String s = bufferedReader.readLine();
                String result = Result.isBalanced(s);
                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}