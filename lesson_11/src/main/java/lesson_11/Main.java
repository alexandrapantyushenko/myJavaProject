package lesson_11;

public class Main {
    public static void main(String[] args) {
        String[][] array = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int result = ArrayProcessor.sumArray(array);
            System.out.println("Sum of array elements: " + result);
        } catch (MyArraySizeException e) {
            System.out.println("Array size exception: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Data exception: " + e.getMessage());
        }
    }
}

