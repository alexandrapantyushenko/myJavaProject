package lesson_7;

public class Lesson7Main {
    public static void main(String[] args) {
        System.out.println(Lesson_7_Method1.isSumBetween10and20(5, 6));
        Lesson_7_Method2.printPositiveOrNegative(-5);
        System.out.println(Lesson_7_Method3.isNegative(-3));
        Lesson_7_Method4.printStringMultipleTimes("Hello", 3);
        System.out.println(Lesson_7_Method5.isLeapYear(2024));

        int[] arr6 = {1, 0, 1, 0, 0};
        Lesson_7_Method6.swapZerosAndOnes(arr6);
        System.out.println(java.util.Arrays.toString(arr6));

        Lesson_7_Method7.fillArrayWithNumbers();

        int[] arr8 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        Lesson_7_Method8.multiplySmallerThanSix(arr8);
        System.out.println(java.util.Arrays.toString(arr8));

        int[][] arr9 = new int[5][5];
        Lesson_7_Method9.fillDiagonalWithOnes(arr9);
        System.out.println(java.util.Arrays.deepToString(arr9));

        int[] arr10 = Lesson_7_Method10.createArray(5, 7);
        System.out.println(java.util.Arrays.toString(arr10));

        int[] arr11 = {1, 2, 3, 4, 5};
        Lesson_7_Method11.shiftArray(arr11, 2);
        System.out.println(java.util.Arrays.toString(arr11));
    }
}

