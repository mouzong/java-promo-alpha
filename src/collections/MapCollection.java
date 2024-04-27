package collections;

import java.util.HashMap;
import java.util.Map;

public class MapCollection {
    public static void main(String[] args) {
        Map<String,Integer> map1 = new HashMap<>();
        Map<String, Object> map2 = new HashMap<>();

        map1.put("Ali",8500000);
        map1.put("Alex",8500000);
        map1.put("Eric",85000000);

        System.out.println("\n\t Salire de Mr Alex = "+ map1.get("Alex"));
    }
}
