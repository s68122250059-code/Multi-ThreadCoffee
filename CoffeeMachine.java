class CoffeeMachine {

    public synchronized void brew(String menu) {

        System.out.println(Thread.currentThread().getName() +
                " is brewing: " + menu);

        try {
            Thread.sleep((long)(Math.random() * 3000));
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() +
                " finished: " + menu);
    }
}