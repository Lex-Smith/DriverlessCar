public class Main {
    public static void main(String[] args) {
        GearBox gearBox = new GearBox();
        gearBox.shiftUp();
        System.out.println(gearBox.getCurrentGear());
        gearBox.shiftUp();
        System.out.println(gearBox.getCurrentGear());
        gearBox.switchNeutral();
        System.out.println(gearBox.getCurrentGear());

    }
}
