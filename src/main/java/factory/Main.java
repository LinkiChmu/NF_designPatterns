package factory;

public class Main {

    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.start(CoffeeType.AMERICANO);
        coffeeMachine.start(CoffeeType.ESPRESSO);
    }
}
