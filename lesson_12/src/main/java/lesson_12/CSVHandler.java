package lesson_12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CSVHandler {

    public static void save(AppData appData, String filePath) {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(filePath))) {

            writer.write(String.join(";", appData.getHeader()));
            writer.newLine();

            for (int[] row : appData.getData()) {
                String rowData = "";
                for (int value : row) {
                    rowData += value + ";";
                }
                writer.write(rowData.substring(0, rowData.length() - 1));
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static AppData load(String filePath) {
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(filePath))) {
            String line;
            String[] header = reader.readLine().split(";");
            StringBuilder dataBuilder = new StringBuilder();


            while ((line = reader.readLine()) != null) {
                dataBuilder.append(line).append("\n");
            }

            String[] rows = dataBuilder.toString().split("\n");
            int[][] data = new int[rows.length][header.length];

            for (int i = 0; i < rows.length; i++) {
                String[] rowValues = rows[i].split(";");
                for (int j = 0; j < rowValues.length; j++) {
                    data[i][j] = Integer.parseInt(rowValues[j]);
                }
            }

            return new AppData(header, data);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
