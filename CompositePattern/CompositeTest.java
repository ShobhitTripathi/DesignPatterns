package CompositePattern;

public class CompositeTest {

    public static void main (String[] args) {
        Component hdd = new Leaf("HDD", 4000);
        Component mouse = new Leaf("mouse", 500);
        Component keyBoard = new Leaf("keyBoard", 700);
        Component cpu = new Leaf("CPU", 9000);
        Component ram = new Leaf("RAM", 3000);

        Composite ph = new Composite("Peripheral");
        Composite mb = new Composite("MotherBoard");
        Composite cabinet = new Composite("Cabinet");
        Composite computer = new Composite("Computer");

        ph.addComponents(mouse);
        ph.addComponents(keyBoard);

        mb.addComponents(ram);
        mb.addComponents(cpu);

        cabinet.addComponents(hdd);
        cabinet.addComponents(mb);

        computer.addComponents(ph);
        computer.addComponents(cabinet);

//        ram.showPrice();
//        mb.showPrice();
//        cabinet.showPrice();
//        ph.showPrice();
        computer.showPrice();


    }
}
