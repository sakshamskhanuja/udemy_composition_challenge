public class SmartKitchen {

    private Refrigerator iceBox;
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;

    public SmartKitchen() {
        iceBox = new Refrigerator();
        brewMaster = new CoffeeMaker();
        dishWasher = new DishWasher();
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishWasherFlag) {
        brewMaster.setHasWorkToDo(coffeeFlag);
        iceBox.setHasWorkToDo(fridgeFlag);
        dishWasher.setHasWorkToDo(dishWasherFlag);
    }

    public void addWater() {
        brewMaster.setHasWorkToDo(true);
    }

    public void pourMilk() {
        iceBox.setHasWorkToDo(true);
    }

    public void loadDishWasher() {
        dishWasher.setHasWorkToDo(true);
    }

    public void doKitchenWork() {
        // Ordering Food
        iceBox.orderFood();

        // Brewing Coffee
        brewMaster.brewCoffee();

        // Washing Dishes
        dishWasher.doDishes();
    }
}
