package DecoratorPattern.decorator;

import DecoratorPattern.BasePizza;

public class CheeseToppping extends ToppingDecorator{
    BasePizza basePizza;

    public CheeseToppping(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 20;
    }
}
