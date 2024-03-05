| Method Overloading                                                       | Method Overriding                                                                |
|--------------------------------------------------------------------------|----------------------------------------------------------------------------------|
| Provides functionality to reuse a method name with different parameters. | used to override a behavior which the class has inherited from the parent class. |
| Usually in a single class but may also be used in a child class.         | Always in two classes that have a child-parent or IS-A relationship.             |
| Must have different parameters.                                          | Must have the same parameters and same name.                                     |
| May have different return types.                                         | Must have same return type or covariant return type (child class).               |
| May have different access modifiers(Private, protected, public).         | Must not have a lower modifier but may have a higher modifier.                   |
| May throw different exceptions.                                          | Must not throw a new or broader checked exception.                               |

## Covariant Return Type
- The return type of overridden method can be the same type as the parent method's declaration.
- But it can also be a subclass.
- The term, covariant return type, is more appropriate.

# String Methods Overview

In the previous video, we looked at two of String's methods for formatting. We've also briefly looked at a few more obvious String methods in some of the sample code we've shown to date. The String class has over 60 methods available. We won't cover them all here, but we'll cover the ones you'll probably use the most.

## String Basics

- The String is a sequence of characters, meaning its characters are ordered and indexed.
- The index starts at 0, and not 1.
- This is important to know if you're going to operate on Strings successfully.

## String Indices for "Hello World"

| H | e | l | l | o |   | W | o | r | l | d |
|---|---|---|---|---|---|---|---|---|---|---|
| 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |10 |

- The length of this String is 11, but its last index is 10.

## Categories of String Methods

1. **String Inspection Methods**
    - Provide information about the string, with methods like `length()`, `isEmpty()`, and `isBlank()`.

2. **Methods for Comparing String Values**
    - Usually return a boolean value (String values are equal or not).

3. **String Manipulation Methods**
    - Transform one String value into another.

## String Inspection Methods

### Examples:

```java
public static void printInformation(String string) {
    int length = string.length();
    System.out.printf("Length = %d %n", length);
    System.out.printf("First char = %c %n", string.charAt(0));
    // Add code to print last character
}
```

- Method `length()` returns the number of characters in a sequence.
- Method `charAt()` returns a character at a specified index position.
- Methods `indexOf()` and `lastIndexOf()` tell if the String value contains a specified character or substring.
- Methods `isEmpty()` and `isBlank()` tell whether the sequence is empty or contains just white space characters.

### Handling Empty Strings

```java
if (string.isEmpty()) {
    System.out.println("String is Empty");
    return;
}
```

### Difference between `isEmpty()` and `isBlank()`

- `isEmpty()` checks if the string is empty (length = 0).
- `isBlank()` checks if the string contains only white space characters.

## String Comparison Methods

- Check for equality of String values (`equals()`, `equalsIgnoreCase()`, `contentEquals()`).
- Test whether a substring is part of a String value (`contains()`, `endsWith()`, `startsWith()`).
- `contentEquals()` can be used to compare a `StringBuilder`'s value.

### Example:

```java
    
    String helloWorldLower = helloWorld.toLowerCase();
    if (helloWorld.equals(helloWorldLower)) {
        System.out.println("Values match exactly");
    }
```

### Notes:

- `equals()` compares exact String values.
- `equalsIgnoreCase()` ignores case in comparison.
- `contentEquals()` can compare with `StringBuilder`.

## Conclusion

We've covered String comparison and String inspection methods. In the next video, we'll cover our final category of methods, which I'm calling the String manipulation methods.
