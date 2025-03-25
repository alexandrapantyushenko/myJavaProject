package lesson_7;

public class Lesson_7_Method8 {
    public static void multiplySmallerThanSix(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
    }
}

