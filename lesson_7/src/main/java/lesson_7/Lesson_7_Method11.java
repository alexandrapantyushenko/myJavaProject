package lesson_7;

public class Lesson_7_Method11 {
    public static void shiftArray(int[] arr, int n) {
        int len = arr.length;
        n = n % len;

        if (n < 0) {
            n += len;
        }

        for (int i = 0; i < len; i++) {
            int newPosition = (i + n) % len;
            int temp = arr[i];
            arr[i] = arr[newPosition];
            arr[newPosition] = temp;
        }
    }
}

