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
