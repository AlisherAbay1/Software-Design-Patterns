# Assignment #1 — Builder Pattern

A Builder pattern example in Java: a pizza order builder. `PizzaDirector` defines recipes (Pepperoni, Hawaiian, Margherita) through a common `PizzaBuilder` interface, while concrete builders return different representations of the result:

- `PizzaObjectBuilder` to a `Pizza` object
- `PizzaReceiptBuilder` to a text receipt (`String`)

## Build and run

```bash
javac -d out $(find src -name "*.java")
java -cp out src.Main
```

## How to build each representation

```java
PizzaDirector director = new PizzaDirector();

PizzaObjectBuilder pizzaObject = new PizzaObjectBuilder();
director.makeHawaiian(pizzaObject, Size.SMALL);
Pizza pizza = pizzaObject.build();

PizzaReceiptBuilder receipt = new PizzaReceiptBuilder();
director.makePepperoni(receipt, Size.LARGE);
String receipt = receipt.build();
```
