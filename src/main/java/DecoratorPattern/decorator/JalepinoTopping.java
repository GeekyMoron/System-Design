package DecoratorPattern.decorator;

import DecoratorPattern.BasePizza;

public class JalepinoTopping extends ToppingDecorator{
    BasePizza basePizza;

    public JalepinoTopping(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost() + 50;
    }
}
