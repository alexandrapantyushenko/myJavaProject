package lesson_7;

public class Lesson_7_Method6 {
    public static void swapZerosAndOnes(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 0) ? 1 : 0;
        }
    }
}

