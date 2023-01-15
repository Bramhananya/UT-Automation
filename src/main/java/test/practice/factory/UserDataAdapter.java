package test.practice.factory;

import test.practice.base.ConstantUtils;
import test.practice.entities.User;
import test.practice.utils.ExcelReader;

public class UserDataAdapter {

  static ExcelReader excelReader = new ExcelReader(ConstantUtils.ACCOUNT_DATA_EXCEL_PATH);

  public User getFbUser() {
    return UserExcelDataFactory
        .getUserDetails(excelReader.getTestDataFromExcel(ConstantUtils.ACCOUNT_DATA_EXCEL_PATH));
  }

  public User getNalcoUser() {
    return UserExcelDataFactory
        .getUserDetails(excelReader.getTestDataFromExcel(ConstantUtils.ACCOUNT_DATA_EXCEL_PATH));
  }

}
