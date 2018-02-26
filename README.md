## Java 8 Language Features
- Functional Interfaces
- Method References
- Lambda Expressions
- Default Methods (Defender methods)

### Functional Interfaces

In Java 8 a functional interface is defined as an interface with exactly one abstract method. This even applies to interfaces that were created with previous versions of Java. Java 8 comes with several new functional interfaces in the package: java.util.function.
- Function<T,R> - takes an object of type T and returns R.
- Supplier<T>   - just returns an object of type T.
- Predicate<T>  - returns a boolean value based on input of type T.
- Consumer<T>   - performs an action with given object of type T.
- BiFunction    - like Function but with two parameters.
- BiConsumer    - like Consumer but with two parameters.
