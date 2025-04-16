import java.util.HashMap;
import java.util.HashSet;

public class FruitCount {
    public static void main(String[] args) {
        String[] fruits = {"яблоко", "банан", "яблоко", "апельсин", "банан", "виноград", "яблоко", "киви", "банан", "киви", "груша", "апельсин", "груша"};
        HashSet<String> uniqueFruits = new HashSet<>();
        for (String fruit : fruits) {
            uniqueFruits.add(fruit);
        }
        HashMap<String, Integer> fruitCount = new HashMap<>();
        for (String fruit : fruits) {
            fruitCount.put(fruit, fruitCount.getOrDefault(fruit, 0) + 1);
        }
        System.out.println("Уникальные фрукты: " + uniqueFruits);
        System.out.println("Частота фруктов:");
        for (String fruit : fruitCount.keySet()) {
            System.out.println(fruit + ": " + fruitCount.get(fruit));
        }
    }
}
