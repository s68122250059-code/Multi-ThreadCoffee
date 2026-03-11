public class CoffeeShop {

    public static void main(String[] args) {

        CoffeeMachine machine = new CoffeeMachine();

        new Thread(new CoffeeMaker("Espresso", machine)).start();
        new Thread(new CoffeeMaker("Latte", machine)).start();
        new Thread(new CoffeeMaker("Mocha", machine)).start();
        new Thread(new CoffeeMaker("Americano", machine)).start();
        new Thread(new CoffeeMaker("Cappuccino", machine)).start();
        new Thread(new CoffeeMaker("Flat White", machine)).start();
        new Thread(new CoffeeMaker("Macchiato", machine)).start();
        new Thread(new CoffeeMaker("Cold Brew", machine)).start();
        new Thread(new CoffeeMaker("Matcha", machine)).start();
        new Thread(new CoffeeMaker("Chocolate", machine)).start();

        System.out.println("End main");
    }
}