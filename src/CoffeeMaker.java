public class CoffeeMaker {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee() {
        // Checks if coffee maker is set to work.
        if (hasWorkToDo) {
            System.out.println("Brewing Coffee");

            // Work is done.
            hasWorkToDo = false;
        }
    }
}
