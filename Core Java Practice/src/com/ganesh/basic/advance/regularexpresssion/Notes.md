# Ways to use Regular Expressions in Java

- There are classes with methods that take regular expression strings or patterns a parameters. A few of these are:
 - String, Scanner, Formatter, DataTimeFormatter, Duration.
- There are also special classes in the java.util.regex package, to help you implement your own functionality.

| Result   | Method Name                                   |
|----------|-----------------------------------------------|
| boolean  | matches(String regex)                         |
| String   | replaceAll(String regex, String replacement)  |
| String   | replaceFirst(String regex, String replacement |
| String[] | split(String regex)                           |
| String[] | split(String regex, int limit)                |

# Parts of a Regular Expression
- Literals: These have no additional meaning and are a one to one match. If you specify the literal "abc", the code will match on the first occurrence of "abc", in your string.
- Character Classes: Some of these are predefined, others you can define yourself. The period or dot is an example of a predefined character class.
 - `. [abc] [a-g] [A-Z] [0-9] [^abc] \d \s \s`
- Quantifiers: These metacharacters identify the number of occurrences of a character class or literal, required to make a match. Example *
 - `* + ?`
- Boundary matchers, or anchors: Specify the position in the text, Example at start or end of the string.
 - `^ $ \b` ^ matches to start of text; $ matches to end of text; \b matches to word.
 - "^." Matches first character in a string.
 - ".$" matches last character in a string.
 - "\\b" Matches first word in a string.
- Groups: Identify and allow for the capturing of subexpressions.
 - `()`

# Compile a Regex
- The string containing the expression is passed to the compile method, of a Pattern class which returns a Pattern instance.
- This string, the regular expression, is said to be compiled into a Pattern, by java's regular expression processor.

This compilation process consists of
- Checking the string for syntactical correctness.
- Building an internal representation, a decision tree made up of nodes, and boolean decision points, derived from the various parts of the regular expression.

boolean matched = Pattern.matches("[A-Z].*[.]", sentence);
Pattern pattern = Pattern.compile("[A-Z].*[.]");
var matcher = pattern.matcher(sentence);
boolean matched = matcher.matches(sentence);

# Matcher Class Advantages
- In addition to matching an entire input, Matcher offers two other operations for partial matching.
- These methods are lookingAt, and overloaded versions of the find method.
- Matcher supports capturing groups and access to the text within the group.
- Can be reused for multiple match operations on different String inputs, meaning the pattern doesn't have to be recompiled.

# Matcher Class Disadvantages
- An instance of a Matcher class has state, which changes as operations are performed on it.
- This means the Matcher class is not thread safe.
- It also means state may need to be reset, before new String is evaluated.
- matcher.lookingAt(): Attempts to match the input sequence, starting at the beginning of the region, against the pattern.
  Like the matches method, this method always starts at the beginning of the region; unlike that method, it does not require that the entire region be matched.
  If the match succeeds then more information can be obtained via the start, end, and group methods.

# Greedy and Reluctant Regular Expressions.
- .*? matches any number f characters, but stops at the earliest successful point, where the overall pattern is matched.
- The default type of regular expression is greedy.
- You can use the ? to be a quantifier modifier, making the regular expression reluctant.
- matcher.end() gives first end after pattern matches.

| Method          | Characteristics                                                                                                               |
|-----------------|-------------------------------------------------------------------------------------------------------------------------------|
| matches()       | Matches entire string. Reluctant expression may be greedy when used with this method.                                         |
| lookingAt()     | Matches starting at the first character of string . It doesn't have to match the entire string. Honors reluctant expressions. |
| find()          | Starts at the first character not previously matched. Requires reset if you want to start at beginning of string.             | 
| find(int start) | Executes a reset, and starts at index passed to the method.                                                                   |

# Grouping and Capturing
- Grouping is a way to identify targeted parts of the regular expression match, often because you want to do some additional processing on that sub expression. A group is enclosed in parentheses.
- A match to the group is said to be captured, meaning the text is stored for additional usage later.
- Capturing is a way to access the matched groups, called capturing groups, of regular expression match.
- You might already be familiar with back references in some regular expressions, which are numeric references to captured groups.

# Matcher and MatchResult
- The Matcher class implements MatchResult, which you can see has the end, group and start methods.
- This class is declared on Matcher as a static nested class.
- The actual class isn't really important, you should just know you can use the methods shown here, declared on MatchResult.




