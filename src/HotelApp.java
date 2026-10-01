public class HotelApp {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();

        frontDesk.checkIn("ABC-1234", 2);
        frontDesk.requestRoomCleaning(305);
        frontDesk.checkOut("ABC-1234", 305);
    }
}
