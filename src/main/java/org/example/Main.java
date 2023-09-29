package org.example;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("C:\\Users\\1\\IdeaProjects\\untitled\\Ostatok.xlsx")) {
            // Открываем файл Excel
            Workbook workbook = new XSSFWorkbook(fileInputStream);

            // Получаем первый лист (0-based индекс)
            Sheet sheet = workbook.getSheetAt(0);

            // Проходим по строкам и столбцам для чтения данных
            for (Row row : sheet) {
                for (Cell cell : row) {
                    // Проверяем, что ячейка содержит числовое значение или формулу
                    if (cell.getCellType() == CellType.NUMERIC || cell.getCellType() == CellType.FORMULA) {
                        double numericValue = cell.getNumericCellValue();
                        System.out.println("Числовое значение ячейки: " + numericValue);
                    } else if (cell.getCellType() == CellType.STRING) {
                        String cellValue = cell.getStringCellValue();
                        System.out.println("Значение ячейки: " + cellValue);
                    }
                    // Другие типы данных (даты и т. д.) могут обрабатываться аналогичным образом
                }
            }

            // Закрываем файл Excel
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
