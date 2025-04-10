package lesson_12;

public class Main {
    public static void main(String[] args) {
        String[] header = {"Value 1", "Value 2", "Value 3"};
        int[][] data = {
                {100, 200, 123},
                {300, 400, 500}
        };

        AppData appData = new AppData(header, data);

        CSVHandler.save(appData, "data.csv");

        AppData loadedData = CSVHandler.load("data.csv");

        if (loadedData != null) {
            System.out.println("Header: ");
            for (String col : loadedData.getHeader()) {
                System.out.print(col + " ");
            }
            System.out.println("\nData: ");
            for (int[] row : loadedData.getData()) {
                for (int val : row) {
                    System.out.print(val + " ");
                }
                System.out.println();
            }
        }
    }
}
