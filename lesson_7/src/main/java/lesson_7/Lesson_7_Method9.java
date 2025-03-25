package lesson_7;

public class Lesson_7_Method9 {
    public static void fillDiagonalWithOnes(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
        }
    }
}

