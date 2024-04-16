import java.util.*;
class ValidParenthesis{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
            Deque<Character> stack = new ArrayDeque<Character>();
			String input=sc.next();
            //Complete the code
            char[] x = input.toCharArray();
            for (char c : x) {
                //System.out.printf("C: = %c, Peek = %c\n",c,stack.peek());
              if (!stack.isEmpty() && ((stack.peek() == '{' && c == '}')|| (stack.peek() == '(' && c == ')') || (stack.peek() == '[' && c == ']'))) {
                        stack.pop();
                        //System.out.println("POP");
                        
                    } else {
                        stack.push(c);
                        //System.out.println("PUSH");
                    }
                    

            }
            if(stack.isEmpty()){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
		}
	}
}

