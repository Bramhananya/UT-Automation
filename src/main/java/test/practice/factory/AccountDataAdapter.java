package test.practice.factory;

import test.practice.base.ConstantUtils;
import test.practice.entities.Accounts;
import test.practice.utils.ExcelReader;

public class AccountDataAdapter {

  ExcelReader excelReader = new ExcelReader(ConstantUtils.ACCOUNT_DATA_EXCEL_PATH);

  public Accounts getFbAccount() {
    return AccountExcelDataFactory
        .getAccountDetails(excelReader.getTestDataFromExcel(ConstantUtils.ACCOUNT_DATA_EXCEL_PATH));
  }

  public Accounts getTcdAccountList() {
    return AccountExcelDataFactory
        .getAccountList(excelReader.getTestDataFromExcel(ConstantUtils.ACCOUNT_DATA_EXCEL_PATH, 2));
  }
}
