package FactoryPattern;

public class OperatingSystemFactory {

    public static OS getInstance(String str) {
        if (str.equals("Open"))
            return new Android();
        else if (str.equals("Closed"))
            return new IOS();
        else
            return new Windows();
    }
}
