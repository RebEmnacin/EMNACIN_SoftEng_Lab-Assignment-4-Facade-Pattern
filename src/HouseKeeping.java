public class HouseKeeping implements HotelService {
    @Override
    public String getServiceName() {
        return "HouseKeeping";
    }

    public void cleanRoom(int roomNumber) {
        System.out.println("[HouseKeeping] Cleaning room number: " + roomNumber);
    }
}
