public class DishWasher {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes() {
        // Checks if dish washer is set to work
        if (hasWorkToDo) {
            System.out.println("Washing Dishes");

            // Work is done.
            hasWorkToDo = false;
        }
    }
}
