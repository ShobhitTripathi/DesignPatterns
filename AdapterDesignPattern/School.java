package AdapterDesignPattern;

/* Adapter Design pattern allows you to use the Class and their methods without even changing in their src code.
eg: Charger has adapters to convert from on charger to another.
In the given example, Pen property needs to be set. We have PilotPen implementation not the implementation for Pen.
So we adapt the PilotPen to Pen.
 */


public class School {

    public static void main(String[] args) {

        Pen p = new PenAdapter();
        AssignmentWork aw = new AssignmentWork();
        aw.setP(p);
        aw.writeAssignment("I love Design Patterns. This is Adapter Pattern.");
    }
}
