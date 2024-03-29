# Lambda Expression
- A lambda expression can be thought of as implicit code for anonymous class, using a special kind of interface, as the mechanics to do this.
- The method reference goes even further, and is a short-cut for the lambda expression syntax.
- Following is the syntax of the lambda expression

| The generated Lambda Expression                 | Comparator's Abstract Method|
|-------------------------------------------------|-----------------------------|
|(o1,o2)->o1.firstName().compareTo(o2.firstName())| int compare(T o1, T o2)     |

- This was passed directly as a method argument, for a parameter type that was a Comparator.
- The Lambda expression parameters are determined by the associated interface's method, the functional method.
- In the case of a Comparator, and it's compare method, there are two arguments.
- This is why we get o1, o2 in parentheses, in the generated lambda expression.
- These arguments can be used in the expression, which is on the right of the arrow token.

## Syntax of a Lambda Expression
A lambda expression consists of a formal parameter list, usually but not always declared in parentheses; the arrow token; and either an expression or code block after the arrow token

    (parameter, parameter2, ...) -> expression;
The expression should return a value, if the associated interface's method returns a value.

    e.g. (o1,o2)->o1.firstName().compareTo(o2.firstName())

## Anonymous class and lambda expression
    
    new Comparator<Person>(){
        @Override
        public int compare(Person o1, Person o2) {
            return o1.lastName().compareTo(o2.lastName());
        }
    };

    people.sort((o1,o2)->o1.firstName().compareTo(o2.firstName()));

## Where's the method in the lambda expression?
- For lambda expression, the method is inferred by java!
- Java takes its clue from the reference type, in the context of the lambda expression usage.
- A simplified view, of the sort method on List.

    void sort(Comparator c)
- from people.sort() Java can infer that this lambda expression, resolves to a Comparator type, because of the method declaration.
- This means the lambda expression passed, should represent code for a specific method on the Comparator interface.

## How can Java Infer the method? (But which method?)
- Well, there's only one the lambda expression cares about, and that's the abstract method on Comparator.
- Java requires types which support lambda expressions, to be something called a functional interface.

## Functional Interface
- Functional interface is an interface that has one, and only one abstract method.
- This is how java can infer the method, to derive the parameters and return type, for the lambda expression.
- You may also see this referred to as SAM, which is short for Single Abstract method, also called as functional method.
- A functional interface is the target type for a lambda expression.
- Functional interface is a framework that lets a lambda expression be used.
- Many of Java's classes, use functional interfaces in their method signatures, which allows us to pass lambas as argument to them.

## Consumer Interface
- java.util.function
- has one abstract method, that takes a single argument, and doesn't return anything.
- void accept(T t)

## Functional Programming
- Lambdas are Java's first step into functional programming.
- This is a programming paradigm that focuses on computing and returning results.

# Streams
- Streams create a pipeline of work that can be formed into a chain.
- Many of the stream operations take functional interfaces as parameters, meaning we can code them with lambda expressions.

## Lambda Expression with multiple parameters

- (a,b) -> a+b; //Parentheses are always required. Explicit types are not
- (a,b) -> a+b; // Explicit type/var should be used by all parameters and not single
- return is mandatory when you use curly braces.

## java.util.function
- Java provides a library of functional interfaces in java.util.function package.
- Java's libraries uses this interfaces extensively.
- Consumer, BinaryOperator,.. There are over 40 interfaces in this package
- These all interfaces are categorized into following types.


| Interface Category | Basic Method Signature | Purpose                                      |
|--------------------|------------------------|----------------------------------------------|
| Consumer           | void accept(T t)       | Execute code without returning data          |
| Function           | R apply(T t)           | return a result of an operation or function. |
| Predicate          | boolean test(T t)      | test if a condition is true or false         |
| Supplier           | T get()                | return an instance of something              |

## The Consumer Interface
- Consumer   : void accept(T t)
  - s-> System.out.println(s) // No result returned
- BiConsumer : void accept(T t, U u)
  - (lat,lng)-> System.out.printf("[lat:%.3f lon:%.3f]%n", lat, lng))

## Predicate Interface
- Predicate : boolean test(T t)
  - s->s.equalsIgnoreCase("Hello")
- BiPredicate : boolean test(T t, U u)
  - (a, b) -> (a + b) > 10

# The Function Interface
- Each has a return type, shown as T or R. In addition to Function and BiFunction, there is also UnaryOperator and BinaryOperator
- You can think of the UnaryOperator as a Function Interface, but where the argument type is the same as the result type.

| Interface Name    | Method Signature  | Interface Name    | Method Signature    |
|-------------------|-------------------|-------------------|---------------------|
| Function<T,R>     | R apply(T t)      | UnaryOperator<T>  | T apply(T t)        |
| BiFunction<T,U,R> | R apply(T t, U u) | BinaryOperator<T> | T apply(T t1, T t2) |

- Function
  - s->s.split(",");
  - R apply(T t)
  - Function<String, String[]> f1;

## Supplier Interface
- The supplier interface takes no arguments but returns an instance of some type T.
- Method Signature : T get()
- It is like a factory method code.
- It will produce an instance of some object.
- However, this doesn't have to be a new or distinct result returned.
- In the example I'm showing you on this slide, I'm using the Random class to generate a random Integer.
- This method takes no argument, but lambda expressions can use final or effectively final variables in their expressions.
- E.G. ()->random.nextInt(1,100)

## Lambda Expressions, What you need to understand
1. Declare Lambda variables, or pass lambdas directly to methods that are targets.
   - Local Variable Declaration: Function<String, String> myFunction = s-> s.concat(" "+suffix); 
   - Method Argument: list.forEach(s-> System.out.println(s));
2. Create methods that can be target for lambda expressions.

## Method Reference
- Named Methods are called method reference. They provide compact, easy to read lambda expressions.

## Deferred Method Invocation
- When you create variables that are lambda expressions or method references, it's important to remember that the code isn't invoked at that point.
- The statement or code block gets invoked at the point in the code that the targeted functional method is called.

## Type Reference (Integer::Sum)(Type::function)
- Refers to class, interface, enum, record name
- Static methods are usually called using Type References, but can also be called by instances in our code.
- This is not true for method references.
- Static methods, in method references and lambda expressions, must be invoked using a reference type only.
- There are two ways to call an instance method.
- The first is when you refer to the method with an instance derived from the enclosing code.
- This instance is declared outside the method reference.
- E.g. System.out::println
- Bounded Receiver is an instance derived from the enclosing code, used in the lambda expression, on which the method will be invoked.
- 

