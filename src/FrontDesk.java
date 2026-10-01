public class FrontDesk {
    private final Valet valet;
    private final HouseKeeping houseKeeping;
    private final Cart cart;

    public FrontDesk() {
        this.valet = new Valet();
        this.houseKeeping = new HouseKeeping();
        this.cart = new Cart();
    }

    // Simplified operation 1: guest arrives
    public void checkIn(String plateNumber, int numberOfCarts) {
        System.out.println("--- Check-in started ---");
        valet.parkVehicle(plateNumber);
        cart.requestCart(numberOfCarts);
        System.out.println("--- Check-in complete ---\n");
    }

    // Simplified operation 2: guest leaves
    public void checkOut(String plateNumber, int roomNumber) {
        System.out.println("--- Check-out started ---");
        houseKeeping.cleanRoom(roomNumber);
        valet.pickUpVehicle(plateNumber);
        System.out.println("--- Check-out complete ---\n");
    }

    // Individual delegated requests
    public void requestVehiclePickUp(String plateNumber) {
        valet.pickUpVehicle(plateNumber);
    }

    public void requestRoomCleaning(int roomNumber) {
        houseKeeping.cleanRoom(roomNumber);
    }

    public void requestLuggageCarts(int numberOfCarts) {
        cart.requestCart(numberOfCarts);
    }
}
