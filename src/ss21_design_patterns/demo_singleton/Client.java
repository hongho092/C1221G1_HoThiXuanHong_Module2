package ss21_design_patterns.demo_singleton;

import java.util.LinkedHashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
//        Singleton singleton1 = Singleton.getInstance();
//        Singleton singleton2 = Singleton.getInstance();
//
//        System.out.println(singleton1.hashCode());
//        System.out.println(singleton2.hashCode());
//
//        Service.test();
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("nguyen a", 0);
        map.put("nguyen b", 0);
        map.put("nguyen c", 0);
//        map.put("nguyen c", 2);
        System.out.println(map);
        for (String s : map.keySet()) {
            if ("nguyen a".equals(s)) {
                int count = map.get(s);
                count ++;
                map.put(s, count);
            }
        }
        System.out.println(map);

    }
}
