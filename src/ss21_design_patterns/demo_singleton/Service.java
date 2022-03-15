package ss21_design_patterns.demo_singleton;

public class Service {
    public static void test() {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.hashCode());
    }
}
