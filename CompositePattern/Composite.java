package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{
    String name;
    List<Component> componentList = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    public void addComponents(Component comp) {
        componentList.add(comp);
    }

    @Override
    public void showPrice() {
        System.out.println(name);
        for (Component c : componentList) {
            c.showPrice();
        }
    }
}
