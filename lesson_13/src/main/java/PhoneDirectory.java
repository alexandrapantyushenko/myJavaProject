import java.util.ArrayList;
import java.util.HashMap;

public class PhoneDirectory {

    private HashMap<String, ArrayList<String>> directory;

    public PhoneDirectory() {
        directory = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        directory.putIfAbsent(lastName, new ArrayList<>());
        directory.get(lastName).add(phoneNumber);
    }

    public ArrayList<String> get(String lastName) {
        return directory.getOrDefault(lastName, null);
    }

    public static void main(String[] args) {
        PhoneDirectory directory = new PhoneDirectory();
        directory.add("Иванов", "123-456-7890");
        directory.add("Петров", "987-654-3210");
        directory.add("Иванов", "111-222-3333");
        directory.add("Сидоров", "555-666-7777");
        System.out.println("Номера телефонов для Иванов: " + directory.get("Иванов"));
        System.out.println("Номера телефонов для Петров: " + directory.get("Петров"));
        System.out.println("Номера телефонов для Сидоров: " + directory.get("Сидоров"));
    }
}
