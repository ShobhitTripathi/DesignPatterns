package BuilderPattern;

public class Shop {

    public static void main(String[] args) {
        PhoneBuilder pb = new PhoneBuilder();
        pb.setBattery(3200);
        pb.setProcessor("MediaTek");

        Phone p = pb.getPhone();
        System.out.print(p.toString());
    }
}
