package homework;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Homework16 {
    public static void main(String[] args) {

        System.out.println("-------------Task 1-----------");
        System.out.println(parseData("{104}LA{101}Paris{102}Berlin{103}Chicago{100}London"));

        System.out.println("\n-----------Task 2-----------");
        LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
        map2.put("Apple", 2);
        map2.put("Pineapple", 1);
        map2.put("Orange", 3);
        System.out.println(calculateTotalPrice1(map2));

        System.out.println("\n-----------Task 3-----------");
        LinkedHashMap<String, Integer> map3 = new LinkedHashMap<>();
        map3.put("Apple", 4);
        map3.put("Mango", 8);
        map3.put("Orange", 3);
        System.out.println(calculateTotalPrice2(map3));
    }

    //Task 1
    public static TreeMap<Integer, String> parseData(String str) {
        TreeMap<Integer, String> map = new TreeMap<>();
        String[] arr = str.substring(1).split("[{]");
        String[][] newArr = new String[arr.length][2];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i].split("}");
        }
        for (String[] strings : newArr) {
            map.put(Integer.parseInt(strings[0]), strings[1]);
        }
        return map;
    }

    //Task 2
    public static double calculateTotalPrice1(LinkedHashMap<String, Integer> map) {
        double sum = 0;

        LinkedHashMap<String, Double> mapPrice = new LinkedHashMap<>();
        mapPrice.put("Apple", 2.00);
        mapPrice.put("Orange", 3.29);
        mapPrice.put("Mango", 4.99);
        mapPrice.put("Pineapple", 5.25);

        for (Map.Entry<String, Integer> s : map.entrySet()) {
            for (Map.Entry<String, Double> p : mapPrice.entrySet()) {
                if (s.getKey().equals(p.getKey())) sum += s.getValue() * p.getValue();
            }
        }
        return sum;
    }

    //Task 3
    public static double calculateTotalPrice2(LinkedHashMap<String, Integer> map) {
        double sum = 0;
        LinkedHashMap<String, Double> priceMaps = new LinkedHashMap<>();
        priceMaps.put("Apple", 2.00);
        priceMaps.put("Orange", 3.29);
        priceMaps.put("Mango", 4.99);

        for (Map.Entry<String, Integer> s : map.entrySet()) {
            for (Map.Entry<String, Double> p : priceMaps.entrySet()) {
                if (s.getKey().equals(p.getKey())) {
                    if (s.getKey().equals("Mango")) {
                        int freeMango = s.getValue() / 3;
                        sum += s.getValue() * p.getValue() - freeMango * p.getValue();
                    } else if (s.getKey().equals("Apple")) {
                        int discountApple = s.getValue() / 2;
                        sum += s.getValue() * p.getValue() - discountApple * (0.5 * p.getValue());
                    } else
                        sum += s.getValue() * p.getValue();
                }
            }
        }
        return sum;
    }
}
