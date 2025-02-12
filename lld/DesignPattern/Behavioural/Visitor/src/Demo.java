public class Demo {
    public static void main(String[] args) {
        System.out.println("--- Visitor Pattern --- ");
        SingleRoom singleRoom = new SingleRoom();
        DoubleRoom doubleRoom = new DoubleRoom();

        RoomVisitor pricingVisitorObj = new RoomPricingVisitor();
        RoomVisitor maintenanceVisitorObj = new RoomMaintenanceVisitor();

        singleRoom.accepts(pricingVisitorObj);
        doubleRoom.accepts(pricingVisitorObj);

        singleRoom.accepts(maintenanceVisitorObj);
        doubleRoom.accepts(maintenanceVisitorObj);
    }
}
