package Utilities;

import java.io.IOException;
import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider(name = "LoginData")
    public String[][] getData() throws IOException {

        String path = ".\\testData\\Opencart_LoginData.xlsx";

        int totalrows = ExcelUtils.getRowCount(path, "Sheet1");
        int totalcols = ExcelUtils.getCellCount(path, "Sheet1", 1);

        String loginData[][] = new String[totalrows][totalcols];

        for (int i = 1; i <= totalrows; i++) {
            for (int j = 0; j < totalcols; j++) {
                loginData[i - 1][j] =
                        ExcelUtils.getCellData(path, "Sheet1", i, j);
            }
        }

        return loginData;
    }
}