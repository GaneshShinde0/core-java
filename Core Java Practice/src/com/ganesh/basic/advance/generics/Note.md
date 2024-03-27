- Generic classes can be bounded, limiting the types that can use it.
- This extends keyword does not have the same meaning as extends when it's used in a class declaration.
- THis isn't saying our type T extends Player, although it could.
- This is saying the Parameterized type T, has to be a player or subtype of the player.
- This declaration establishes what is called an upper bound, on the types that are allowed to be used with this class.

    public class Team<T extends Player>{

## Why Specify an upper bound?
- An upper bound permits access to the bounded type's functionality.
- An upper bound limits the kind of type parameters you can use when using generic class. The type used must be equal to or subtype of bounded type.

# Interfaces used for sorting
## Comparable.
- For an array, we can simply call Arrays.sort(), and pass it an array, but elements in the array, need to implement Comparable.
- Types like String, or primitive wrapper classes like Integer or Character are sortable, and this is because they do implement this interface.

## Comparable Interface 

The Interface Declaration in Java.

  public interface comparable<T>{
    int compareTo(T o);
  }
  
It's a generic type, meaning it's parameterized.
- Any class that implements this interface, needs to implement the compareTo method.
- This method takes one object as an argument, shown on slide as letter o, and compares it to the current instance, shown as this.
- Results of compareTo method should mean, when implemented.
- 
| Resulting Value | Meaning |
|-----------------|---------|
| Zero            | O==this |
| Negative value  | this<o  |
| Positive value  | this>o  |

# Comparator Interface
- Comparator is similar to Comparable interface, and the two can often be confused with each other.
- Its declaration and primary abstract methods are as follows.


    public interface Comparator<T>{
        int compare(T o1, T o2);
    }
    public interface Comparable<T>{
        int compareTo(T o);
    }

- The compare method takes two arguments, compareTo takes one; It will compare two arguments with one another instead of one object to instance itself.
- We'll review Comparator in code, but in a slightly manufactured way.
- It's common practice to include a Comparator as a nested class.


- Comparable: 
  - Best practice is to have this.compareTo(o)==0 result in this.equals(o) being true.
  - Arrays.sort(T[] elements) requires T to implement Comparable.
- Comparator
  - Does not require the class itself to implement Comparator, though you could also implement it this way.
  - Array.sort(T[] element, Comparator<T>) does not require T to implement Comparable.

# Generics
- Using Generics that use type arguments, declared in method parameters and local variables.
- Creating generic methods, apart from generic classes.
- Using wildcards in the type argument.
- Understanding static methods with generic types.
- Using multiple upper bounds.

# Limitation of a reference of generic class with a list argument
- When we declare a variable or method parameter with:
  - List<Student>
- Only List subtypes with Student elements can be assigned to this variable or method argument.
- We can't assign a list of student subtypes to this!

# The Generic Method
- A Generic method can be used for static methods on a generic class, because static methods can't use class type parameters.
- A generic method can be used on a non-generic class, to enforce type rules on a specific method.
- The generic method type parameter is separate from a generic class type parameter.
- In fact if you've used T for both, the T declared on method means a different type, than the T for the class.
  

    public <T> String myMethod(T input){
      return input.toString();
    }
# Type parameters, Type Arguments and using a wildcard.
- A type parameter is a generic class, or generic method's declaration of the type.

| Generic class          | Generic Method                    |
|------------------------|-----------------------------------|
| public class Team<T>{} | public<T> void doSomething(T t){} |
- In both of these examples, T is said to be the type parameter.
- You can bind a type parameter with the use of the extends keyword, to specify an upper bound.

- A wildcard can only be used in a type argument, not in the type parameter declaration.
- A wildcard is represented with the ? character.
- A wildcard means the type is unknown.
- For this reason, a wildcard limits what you can do, when you specify a type this way.

| List Declaration Using A Wildcard |
|-----------------------------------|
| List<?> unknownList;              |

- Wild card can't be used in an instantiation of a generic class.
- (Invalid!!!) var myList = new ArrayList<?>(); (Invalid!!!)
- A wildcard can be unbounded, or alternatively specify either an upper bound or lower bound.
- You can't specify both an upper bound and lower bound in same declaration.
- unbounded - List<?>
- upper bound - List<? extends Student>
- lower bound - List<? super Student> (Here Student and Object).

# Type Erasure
- Generics exist to enforce tighter type checks, at compile time.
- The compiler transforms a generic class into a typed class, meaning the byte code, or class file, contains no type parameters.
- Everywhere a type parameter is used in a class, it gets replaced with either the type Object, if no upper bound was specified, or the upper bound type itself.
- This transformation process is called type erasure, because the T parameter (or S, U, V) is erased, or replaced with a true type.
- Understanding how type erasure works for overloaded methods, may be important.

## Using multiple types to declare an upper bound
- You can use multiple types to set a more restrictive upper bound, with the use of an ampersand between types.
  
  
    public class GenericClass<T extends AbstractClassA & interfaceA & interfaceB>{}
- Extends for class & Interface.
- & means any type must be subtype of all.
- Class must be listed first.
- Interface's follow class.