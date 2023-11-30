package strategy.pseudocode;

import strategy.pseudocode.Strategy;

public class ConcreteStrategyAdd implements Strategy {
    @Override
    public double execute(double a, double b) {
        return a + b;
    }
}
