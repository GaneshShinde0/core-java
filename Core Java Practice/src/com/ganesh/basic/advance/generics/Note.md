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