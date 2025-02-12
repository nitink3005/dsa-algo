public class RoomMaintenanceVisitor implements RoomVisitor {
    @Override
    public void visit(SingleRoom singleRoom) {
        System.out.println("Single Room maintenance done");
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
        System.out.println("Double Room maintenance done");
    }
}
