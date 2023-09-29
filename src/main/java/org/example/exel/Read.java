package org.example.exel;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Read {
    private FileInputStream fileInputStream;
    private ArrayList<Object> exel = new ArrayList<>();

    public Read(String name) {
        try {
            this.fileInputStream = new FileInputStream(name);
            readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Object> getExel() {
        return exel;
    }


    public void readFile() {
        try {
            Workbook workbook = new XSSFWorkbook(fileInputStream);
            Sheet sheet = workbook.getSheetAt(0);
            for (Row row : sheet) {
                Cell nameCell = row.getCell(0);
                Cell qwant = row.getCell(1);
                if (nameCell != null && nameCell.getCellType() == CellType.STRING) {
                    String textValua = nameCell.getStringCellValue();
                    exel.add(textValua);
                    //System.out.println(textValua);
                }
                if (qwant != null && qwant.getCellType() == CellType.FORMULA) {

                    double qwt = qwant.getNumericCellValue();
                    exel.add(qwt);
                    //System.out.println(qwt);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printExel() {
        for (Object object : exel) {
            System.out.println(object);
        }
    }
}
