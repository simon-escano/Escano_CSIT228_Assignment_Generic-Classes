import Arithmetic.Arithmetic;
import Map.MyMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Testing MyMap:");
        MyMap<String, Integer> myMap = new MyMap<>();
        myMap.put("key1", 1);
        myMap.put("key2", 2);

        System.out.println("Value for key 'key1': " + myMap.get("key1"));
        System.out.println("Value for key 'key2': " + myMap.get("key2"));

        myMap.put("key1", 100);
        System.out.println("Updated value for key 'key1': " + myMap.get("key1"));

        System.out.println("Removing 'key2': " + myMap.remove("key2"));
        System.out.println("Value for key 'key2' after removal: " + myMap.get("key2"));

        System.out.println("----------------------------------------");

        System.out.println("Testing Arithmetic:");
        Arithmetic<Integer, Double> arithmetic = new Arithmetic<>(5, 2.5);
        System.out.println("Addition result: " + arithmetic.add());
        System.out.println("Subtraction result: " + arithmetic.subtract());
        System.out.println("Multiplication result: " + arithmetic.multiply());
        System.out.println("Division result: " + arithmetic.divide());
        System.out.println("Minimum: " + arithmetic.getMin());
        System.out.println("Maximum: " + arithmetic.getMax());
    }
}
