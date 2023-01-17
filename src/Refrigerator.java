public class Refrigerator {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood() {
        // Checks if refrigerator is set to work.
        if (hasWorkToDo) {
            System.out.println("Ordering Food");

            // Work is done.
            hasWorkToDo = false;
        }
    }
}
