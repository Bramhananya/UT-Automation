package test.practice.base;

import test.practice.utils.PropertyStorage;

public class ConstantUtils {

  private ConstantUtils() {
  }

  public static final String ECOLAB_CONNECT_TITLE = "Ecolab";
  private static final String EXCEL_FILE_DIR =
      System.getProperty("user.dir") + "\\recource-files\\excel\\";
  public static final String ENVI_FOLDER_LOCATION = PropertyStorage.getEnvironmentKey();

  // Excel Test Data file path
  public static final String PRODUCT_EXCEL_PATH =
      EXCEL_FILE_DIR + ENVI_FOLDER_LOCATION + "\\Product_Info.xlsx";
  public static final String ACCOUNT_DATA_EXCEL_PATH =
      EXCEL_FILE_DIR + ENVI_FOLDER_LOCATION + "\\Accounts_Info.xlsx";


  // Common Validation Messages
  public static final String YOUR_SHOPPING_CART_IS_EMPTY = "Your Shopping Cart is empty.";
  public static final String ORDER_INFORMATION_TEXT = "Order Information";
  public static final String ACCOUNTPAGE_ERROR_MESSAGE =
      "If any changes are needed on your Ecolab Account information, please contact Customer Support at866-851-8670";

}
