//
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.lang.reflect.Method;
//import java.util.ArrayList;
//import java.util.LinkedHashMap;
//import java.util.LinkedList;
//import java.util.List;
//
//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.w3c.dom.Document;
//import org.w3c.dom.Element;
//
//public class ExcelManager {
//
//    public static int GetNumberOfRows(String fileLocation, String sheetName) throws Throwable {
//        XSSFWorkbook sourceBook = new XSSFWorkbook(fileLocation);
//        try {
//            XSSFSheet sourceSheet = sourceBook.getSheet(sheetName);
//            return sourceSheet.getLastRowNum();
//        } catch (Throwable t) {
//            return -1;
//        } finally {
//            sourceBook.close();
//        }
//    }
//
//    public static void ReadTestScript(String fileLocation, String sheetName) throws Throwable {
//
//        XSSFWorkbook sourceBook = new XSSFWorkbook(fileLocation);
//        Document xmlDocument = XmlHandler.createXMLDocument();
//        Element testStepElement =  xmlDocument.createElement("TestSteps");
//        try {
//            XSSFSheet sourceSheet = sourceBook.getSheet(sheetName);
//            XSSFRow sourceRow = sourceSheet.getRow(0);
//            int noOfRows = sourceSheet.getLastRowNum();
//            int numberOfColumns = sourceRow.getLastCellNum();
//            for(int row = 0 ; row < noOfRows ; row++){
//
//                for(int col = 0; col < numberOfColumns; col++){
//                    switch (sourceRow.getCell(col).toString()) {
//                        case "StepName":
//                            testStepElement.
//                            break;
//                        case "Execute":
//                            ts.setTestReportExecutionInformation(sourceSheet.getRow(row+1).getCell(col).toString());
//                            break;
//                        case "Arguments":
//                            if(sourceSheet.getRow(row+1).getCell(col) == null){
//                                ts.setArguments("");
//                            }else{
//                                ts.setArguments(sourceSheet.getRow(row+1).getCell(col).toString());
//                            }
//                            break;
//                        case "Package":
//                            ts.setPackage(sourceSheet.getRow(row+1).getCell(col).toString());
//                            break;
//                    }
//                }
//                testScripts.add(ts);
//            }
//        } catch (Throwable t) {
//            System.out.println(t.toString());
//
//        } finally {
//            sourceBook.close();
//        }
//
//    }
//
//    public static LinkedHashMap<String, String> ReadTestData(String fileLocation, String sheetName, int iterationNumber) throws Throwable {
////        SessionVariables.testScriptUnderExecution = sheetName;
////        SessionVariables.testScriptIteration = iterationNumber;
//        LinkedHashMap<String, String> testData = new LinkedHashMap<String, String>();
//        XSSFWorkbook sourceBook = new XSSFWorkbook(fileLocation);
//        boolean sourceBookClosed = false;
//        try {
//            XSSFSheet sourceSheet = sourceBook.getSheet(sheetName);
//            XSSFRow headerRow = sourceSheet.getRow(0);
//            XSSFRow dataRow = sourceSheet.getRow(iterationNumber);
//            int numberOfColumns = headerRow.getLastCellNum();
//            for (int colNum = 0; colNum < numberOfColumns; colNum++) {
//                if (dataRow.getCell(colNum) == null) {
//                    testData.put(headerRow.getCell(colNum).toString(), "");
//                    continue;
//                }
//                testData.put(headerRow.getCell(colNum).toString(), dataRow.getCell(colNum).toString());
//            }
////            if (testData.get("Automatic Test Data").equals(CONSTANTS.YES)) {
////                sourceBook.close();
////                sourceBookClosed = true;
////                Object applicationClass = Class.forName(CONSTANTS.AUTOMATIC_TEST_DATA).newInstance();
////                Method stepName = applicationClass.getClass().getMethod(sheetName, testData.getClass());
////                stepName.invoke(applicationClass, testData);
////            }
//        } catch (Throwable t) {
//            return testData;
//        } finally {
//            if (!sourceBookClosed) {
//                sourceBook.close();
//            }
//        }
//        return testData;
//    }
//
//    public static String[] ReadExcelColumn(String fileLocation, String sheetName, String columnName) throws Throwable {
//        String[] excelData = null;
//        XSSFWorkbook sourceBook = new XSSFWorkbook(fileLocation);
//        try {
//            int noOfRowsCount = 0;
//            XSSFSheet sourceSheet = sourceBook.getSheet(sheetName);
//            XSSFRow sourceRow = sourceSheet.getRow(0);
//            int noOfRows = sourceSheet.getLastRowNum();
//            String[] tempexcelData = new String[noOfRows];
//            int numberOfColumns = sourceRow.getLastCellNum();
//            for (int col = 0; col < numberOfColumns; col++) {
//                if (sourceRow.getCell(col) != null && sourceRow.getCell(col).toString().equals(columnName)) {
//                    for (int row = 0; row < noOfRows; row++) {
//                        if (sourceSheet.getRow(row + 1).getCell(col) == null) {
//                            tempexcelData[row] = "";
//                            continue;
//                        }
//                        noOfRowsCount++;
//                        tempexcelData[row] = sourceSheet.getRow(row + 1).getCell(col).toString();
//                    }
//                    break;
//                }
//            }
//            excelData = new String[noOfRowsCount];
//            for (int row = 0; row < noOfRowsCount; row++) {
//                int oopsCount = -1;
//                for (int dataCount = 0; dataCount < noOfRows; dataCount++) {
//                    if (!tempexcelData[dataCount].equals("")) {
//                        oopsCount++;
//                    }
//                    if (oopsCount == row) {
//                        excelData[row] = tempexcelData[dataCount];
//                        break;
//                    }
//                }
//            }
//        } catch (Throwable t) {
//            System.out.println(t.toString());
//            return null;
//        } finally {
//            sourceBook.close();
//        }
//        return excelData;
//    }
//
//    public static String[] ReadExcelColumnWithNullValues(String fileLocation, String sheetName, String columnName) throws Throwable {
//        String[] excelData = null;
//        XSSFWorkbook sourceBook = new XSSFWorkbook(fileLocation);
//        try {
//            XSSFSheet sourceSheet = sourceBook.getSheet(sheetName);
//            XSSFRow sourceRow = sourceSheet.getRow(0);
//            int noOfRows = sourceSheet.getLastRowNum();
//            excelData = new String[noOfRows];
//            int numberOfColumns = sourceRow.getLastCellNum();
//            for (int col = 0; col < numberOfColumns; col++) {
//                if (sourceRow.getCell(col) != null && sourceRow.getCell(col).toString().equals(columnName)) {
//                    for (int row = 0; row < noOfRows; row++) {
//                        if (sourceSheet.getRow(row + 1).getCell(col) == null) {
//                            excelData[row] = "";
//                            continue;
//                        }
//                        excelData[row] = sourceSheet.getRow(row + 1).getCell(col).toString();
//                    }
//                    break;
//                }
//            }
//
//        } catch (Throwable t) {
//            System.out.println(t.toString());
//            return null;
//        } finally {
//            sourceBook.close();
//        }
//        return excelData;
//    }
//
//    public static void UpdateTestDataColumn(String dataKey, String[] dataValue) throws IOException {
//        XSSFWorkbook sourceBook = null;
//        FileOutputStream fileOut = null;
//        try {
//            sourceBook = new XSSFWorkbook(new FileInputStream("CONSTANTS.TEST_DATA_LOCATION"));
//            XSSFSheet sourceSheet = sourceBook.getSheet("SessionVariables.testScriptUnderExecution");
//            XSSFRow sourceRow = sourceSheet.getRow(0);
//            int numberOfColumns = sourceRow.getLastCellNum();
//            for (int colNum = 0; colNum < numberOfColumns; colNum++) {
//                if (sourceRow.getCell(colNum) != null && sourceRow.getCell(colNum).toString().equals(dataKey)) {
//                    XSSFCell modifyCell = null;
//                    for (int dataVal = 0; dataVal < dataValue.length; dataVal++) {
//                        sourceRow = sourceSheet.getRow(dataVal + 1);
//                        if (sourceRow == null) {
//                            sourceRow = sourceSheet.createRow(dataVal + 1);
//                        }
//                        modifyCell = sourceRow.createCell(colNum);
//                        modifyCell.setCellValue(dataValue[dataVal]);
//                    }
//                    for (int dataVal = dataValue.length; dataVal < 50; dataVal++) {
//                        sourceRow = sourceSheet.getRow(dataVal + 1);
//                        if (sourceRow == null) {
//                            sourceRow = sourceSheet.createRow(dataVal + 1);
//                        }
//                        modifyCell = sourceRow.createCell(colNum);
//                        sourceRow.removeCell(modifyCell);
//                    }
//                    break;
//                }
//            }
//            fileOut = new FileOutputStream("CONSTANTS.TEST_DATA_LOCATION");
//            sourceBook.write(fileOut);
//        } catch (Throwable t) {
//            System.out.println(t.toString());
//        } finally {
//            fileOut.flush();
//            fileOut.close();
//            sourceBook.close();
//        }
//    }
//
//    public static boolean UpdateTestDataSheet(String dataKey, String dataValue, boolean replaceNewValue) throws Throwable {
//        XSSFWorkbook sourceBook = null;
//        FileOutputStream fileOut = null;
//        try {
//            sourceBook = new XSSFWorkbook(new FileInputStream("CONSTANTS.TEST_DATA_LOCATION"));
//            XSSFSheet sourceSheet = sourceBook.getSheet("SessionVariables.testScriptUnderExecution");
//            XSSFRow sourceRow = sourceSheet.getRow(0);
//            int numberOfColumns = sourceRow.getLastCellNum();
//            for (int colNum = 0; colNum < numberOfColumns; colNum++) {
//                if (sourceRow.getCell(colNum) != null && sourceRow.getCell(colNum).toString().equals(dataKey)) {
//                    XSSFRow modifyRow = sourceSheet.getRow(1);
//                    String rowValue = "";
//                    if (modifyRow.getCell(colNum) == null) {
//                        XSSFCell dataValueCell = modifyRow.createCell(colNum);
//                        dataValueCell.setCellValue(dataValue);
//                    } else {
//                        rowValue = modifyRow.getCell(colNum).toString();
//                        if (replaceNewValue) {
//                            modifyRow.getCell(colNum).setCellValue(dataValue);
//                        } else {
//                            modifyRow.getCell(colNum).setCellValue(rowValue + ";" + dataValue);
//                        }
//                    }
//                    break;
//                }
//            }
//            fileOut = new FileOutputStream("CONSTANTS.TEST_DATA_LOCATION");
//            sourceBook.write(fileOut);
//        } catch (Throwable t) {
//            System.out.println(t.toString());
//            return false;
//        } finally {
//            fileOut.flush();
//            fileOut.close();
//            sourceBook.close();
//        }
//        return true;
//    }
//}
