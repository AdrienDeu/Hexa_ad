package org.formation.coffee.domain.exception;

public class CoffeeNotFoundException {
    private final CoffeeId coffeeId;

    public CoffeeNotFoundException(CoffeeId coffeeId) {
        super("Coffee " + coffeeId.value() + " not found")
        this.coffeeId = coffeeId;
    }

    public CoffeeId getCoffeeId() {
        return coffeeId;
    }
}
