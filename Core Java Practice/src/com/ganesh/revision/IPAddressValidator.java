import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class IPAddressValidator{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

//Write your code here
class MyRegex{
    public String pattern="^((25[0-5]|2[0-4]\\d|[01]?\\d{1,2})\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d{1,2})$";
    
    // Basic IPv4 Address Validation
    public static final String BASIC_VALIDATION_REGEX = "^(\\d{1,3}\\.){3}\\d{1,3}$";

    // Strict IPv4 Address Validation (0-255 for each octet)
    public static final String STRICT_VALIDATION_REGEX = "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

    // IPv4 Address Validation with Leading Zeros Allowed
    public static final String LEADING_ZEROS_ALLOWED_REGEX = "^((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)$";

    // IPv4 Address Validation without Leading Zeros
    public static final String NO_LEADING_ZEROS_REGEX = "^((25[0-5]|2[0-4]\\d|[1-9]\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[1-9]\\d?)$";

    // IPv4 Address Validation with Optional Leading Zeroes
    public static final String OPTIONAL_LEADING_ZEROS_REGEX = "^((25[0-5]|2[0-4]\\d|1?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|1?\\d\\d?)$";

    // IPv4 Address Validation with Dot Separators Escaped
    public static final String ESCAPED_DOT_REGEX = "^(\\d{1,3}\\.){3}\\d{1,3}$";

    // IPv4 Address Validation with Leading Zeros Ignored
    public static final String LEADING_ZEROS_IGNORED_REGEX = "^((25[0-5]|2[0-4][0-9]|[1]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[1]?[0-9][0-9]?)$";

    // IPv4 Address Validation with Single Digit Octets Allowed
    public static final String SINGLE_DIGIT_OCTETS_REGEX = "^(\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\.(\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\.(\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\.(\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])$";

    // IPv4 Address Validation with Optional Trailing Period
    public static final String OPTIONAL_TRAILING_PERIOD_REGEX = "^(\\d{1,3}\\.){3}\\d{1,3}\\.?$";

    // IPv4 Address Validation without Trailing Period
    
    }
