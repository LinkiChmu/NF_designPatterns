package factory;

public class CoffeeFactory {

    public ICoffee getCoffee(CoffeeType coffeeType) {
        ICoffee iCoffee;
        switch (coffeeType) {
            case ESPRESSO:
                iCoffee = new Espresso();
                break;
            case AMERICANO:
                iCoffee = new Americano();
                break;
            default:
                throw new IllegalArgumentException("Неверный тип кофе");
        }
        return iCoffee;
    }
}
