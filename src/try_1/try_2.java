package try_1;

import java.util.LinkedHashMap;
import java.util.Map;

public class try_2 {
    public static void main(String[] args) {
        Map<Produce, Integer> produce = new LinkedHashMap<>(5);
        Produce produce1 = new Produce(1, "fan");
        Produce produce2 = new Produce(1, "chair");
        Produce produce3 = new Produce(1, "table");
        produce.put(produce1, 1);
        produce.put(produce2, 2);
        produce.put(produce3, 3);
        System.out.println(produce);

        for (Produce p : produce.keySet()) {
            System.out.println(p);
        }

        for (Integer i : produce.values()) {
            System.out.println(i);
        }

        for (Map.Entry<Produce, Integer> entry : produce.entrySet()) {
            System.out.println(entry);
        }
    }

}
