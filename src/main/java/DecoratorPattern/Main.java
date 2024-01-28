package DecoratorPattern;

import DecoratorPattern.decorator.CheeseToppping;
import DecoratorPattern.decorator.JalepinoTopping;

public class Main {
    public static void main(String[] args) {
        BasePizza basePizza = new JalepinoTopping(new CheeseToppping(new PeppyPaneer()));
        System.out.println(basePizza.cost());
    }
}
