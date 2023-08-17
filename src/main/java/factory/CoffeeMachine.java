package factory;

public class CoffeeMachine {

    public void start(CoffeeType coffeeType) {
        CoffeeFactory factory = new CoffeeFactory();
        ICoffee iCoffee = factory.getCoffee(coffeeType);

        pourWater(iCoffee.getWaterVolume());
        takeOn();
        System.out.println(iCoffee.getClass().getSimpleName() + " готовится");
    }

    private void pourWater(int waterVolume) {
        System.out.println("Забор воды: " + waterVolume + "мл");
    }

    private void takeOn() {
        System.out.println("Включаю кофемашину");
    }
}
