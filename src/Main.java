public class Main {
    public static void main(String[] args) {
        // Initializing a SmartKitchen object.
        SmartKitchen smartKitchen = new SmartKitchen();

        // Set kitchen state.
        smartKitchen.setKitchenState(true, false, true);

        // Do kitchen work.
        smartKitchen.doKitchenWork();
    }
}