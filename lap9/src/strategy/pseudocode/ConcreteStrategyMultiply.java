package strategy.pseudocode;

import strategy.pseudocode.Strategy;

public class ConcreteStrategyMultiply implements Strategy {
    @Override
    public double execute(double a, double b) {
        return a * b;
    }
}
