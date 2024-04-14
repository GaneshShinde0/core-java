import java.util.Scanner;

public class TokenCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim(); // Read the input string
        scanner.close();

        // Split the string into tokens
        String[] tokens = s.split("[ !,?._'@]+");

        // Count the number of non-empty tokens
        int tokenCount = 0;
        for (String token : tokens) {
            if (!token.isEmpty()) {
                tokenCount++;
            }
        }

        // Print the number of tokens
        System.out.println(tokenCount);

        // Print each non-empty token on a new line
        for (String token : tokens) {
            if (!token.isEmpty()) {
                System.out.println(token);
            }
        }
    }
}
