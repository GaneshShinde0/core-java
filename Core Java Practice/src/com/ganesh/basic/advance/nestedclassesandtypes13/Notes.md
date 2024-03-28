#### Four Types of Nested Classes

1. **Static Nested Class**:
    - Declared with the `static` modifier within the class body.
    - Accessed using the class name, not requiring an instance variable.

2. **Inner Class**:
    - Non-static nested class declared within the class body.
    - Accessed through an instance of the outer class.

3. **Local Class**:
    - An inner class defined within a method block, rather than at the class level.

4. **Anonymous Class**:
    - Similar to an inner class, but declared and instantiated simultaneously without a name.

#### Additional Nested Types

In addition to nested classes, other nested types include:
- **Enum & Record**: Essentially classes at their core.
- **Interface**: Can also be defined within a class.

#### JDK16 Update

Before JDK16, only static nested classes were permitted to have static methods. With JDK16, all four types of nested classes can now have static members of any type, including static methods.

## Local Classes
- Inner classes, but declared directly in a code block, usually a method body.
- Because of that, they don't have access modifiers, and are only accessible to that method body while it's executing.
- Like inner class, they have access to all fields and methods on the enclosing class.
- They can also access local variables and method arguments, that are final or effectively final.

## Local Class's 'Captured Variables'
- When you create an instance of a local class, referenced variables used in the class, from the enclosing code, are 'captured'.
- This means a copy is made of them and the copy is stored with the instance.
- This is done because the instance is stored in a different memory area, than the local variables in the method.
- For this reason, if a local class uses local variables, or method arguments, from the enclosing code, these must be final or effectively final.

## Final Variables and Effectively Final
The code sample on this slide shows:
- A method parameter, called methodArgument in the doThis method, declared as final.
- And a local variable, in the method block, Field30, also declared with the key word final.
- In both these cases, this means you can't assign a different value, once these are initialized.


   class ShowFinal{
      private void doThis(final int methodArgument){
         final int Field30 =30;
      }
   }
- These are explicitly final, and any of these could be used in a local class because of this.

## Effectively Final
- In addition to explicitly final variables, you can also use effectively final variables in your local class.
- A local variable or a method argument are effectively final if a value is assigned to them and never changed after that.
- Effectively final variables can be used in a local class.

## Additional Local Types
- As of JDK 16, you can also create a local record, interface and enum type, in your method block.
- These are all implicitly static type, and therefore aren't inner classes, or types, but static nested types.
- The record was introduced in JDK 16.
- Prior to that release, there was no support for a local interface or enum in a method block either.

## Anonymous Classes.
- Local class that doesn't have a name.
- All the nested classes we've looked at so far have been created with a class declaration.
- The anonymous class is never created with a class declaration, but it's always instantiated as part of an expression.
- Anonymous classes are used a lot less, since the introduction of Lambda Expression in JDK 8.
- But there are still some use cases where an anonymous class might be a good solution.

## Anonymous class creation.
- An anonymous class is instantiated and assigned in a single statement.
- The new keyword is used followed by any type.
- This is nto the type of the class that can be instantiated.
- It's the super class of the anonymous class, or its the interface this anonymous class will implement as follows.


    var c4 = new Comparator<StoreEmployee>(){}
Here anonymous unnamed class will implement the Comparator Interface.


    var e1 = new Employee{};
In both cases, it's important to remember the semi-colon after the closing bracket, because this is an expression, not a declaration.



