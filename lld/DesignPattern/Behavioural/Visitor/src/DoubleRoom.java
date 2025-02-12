public class DoubleRoom implements  RoomElement {
    private int price = 0;
    public void accepts(RoomVisitor roomVisitor) {
        roomVisitor.visit(this);
    }

    public int getRoomPrice() {
        return price;
    }

    public void setRoomPrice(int roomPrice) {
        this.price = roomPrice;
    }
}
