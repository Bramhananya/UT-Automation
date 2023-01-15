package test.practice.base;

import test.practice.entities.Accounts;
import test.practice.entities.RandomValue;

public class BaseTest extends BrowserFactory {

  protected WrapperClass wrapperClass;
  protected Accounts accounts = new Accounts();
  protected RandomValue randomValue = new RandomValue();

  public BaseTest() {
    wrapperClass = new WrapperClass(driverManager);
    DriverManager.setWrapperClass(wrapperClass);
  }
}
