package org.example;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

class Main2 {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("C:\\Users\\1\\IdeaProjects\\untitled\\Ostatok.xlsx")) {
            // Открываем файл Excel
            Workbook workbook = new XSSFWorkbook(fileInputStream);

            // Получаем первый лист (0-based индекс)
            Sheet sheet = workbook.getSheetAt(0);

            // Проходим по строкам (начиная с первой строки)
            for (Row row : sheet) {
                // Получаем первую ячейку (0-based индекс)
                Cell textCell = row.getCell(0);

                // Получаем вторую ячейку (1-based индекс)
                Cell formulaCell = row.getCell(1);

                // Проверяем, является ли первая ячейка текстовой
                if (textCell != null && textCell.getCellType() == CellType.STRING) {
                    String textValue = textCell.getStringCellValue();
                    System.out.println("Текст из первой ячейки: " + textValue);
                }

                // Проверяем, является ли вторая ячейка формулой
                if (formulaCell != null && formulaCell.getCellType() == CellType.FORMULA) {
                    // Получаем финальное числовое значение ячейки после вычисления формулы
                    double numericValue = formulaCell.getNumericCellValue();
                    System.out.println("Числовое значение второй ячейки: " + numericValue);
                }
            }

            // Закрываем файл Excel
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
