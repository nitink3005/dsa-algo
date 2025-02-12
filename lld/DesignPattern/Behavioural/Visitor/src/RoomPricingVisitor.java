public class RoomPricingVisitor implements  RoomVisitor {
    @Override
    public void visit(SingleRoom singleRoom) {
        singleRoom.setRoomPrice(200);
        System.out.println("Price of Single Room is Rs. "+ singleRoom.getRoomPrice());
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
        doubleRoom.setRoomPrice(500);;
        System.out.println("Price of Double Room is Rs. "+ doubleRoom.getRoomPrice());
    }
}
