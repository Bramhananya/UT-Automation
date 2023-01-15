package test.practice.factory;

import java.util.HashMap;
import java.util.Map;
import test.practice.entities.Accounts;

public class AccountExcelDataFactory {

  private AccountExcelDataFactory() {
  }

  static Map<String, String> listOfAccounts;

  public static Accounts getAccountDetails(Map<String, String> map) {
    Accounts accounts = new Accounts();
    accounts.setAccountName(map.get("AccountName"));
    accounts.setAccountNumber(map.get("AccountNumber"));
    accounts.setBillingAddress(map.get("BillingAddress"));
    accounts.setBillingCity(map.get("BillingCity"));
    accounts.setBillingState(map.get("BillingState"));
    accounts.setBillingZipCode(map.get("BillingZipCode"));
    return accounts;
  }

  public static Accounts getAccountList(Map<String, Map<String, String>> map) {
    Accounts accounts = new Accounts();
    for (int i = 1; i <= map.size(); i++) {
      listOfAccounts = new HashMap<>();
      listOfAccounts = map.get(Integer.toString(i));
      accounts.setAccountNameList(listOfAccounts.get("AccountName"));
      accounts.setAccountNumberList(listOfAccounts.get("AccountNumber"));
      accounts.setBillingAddressList(listOfAccounts.get("BillingAddress"));
      accounts.setBillingCityList(listOfAccounts.get("BillingCity"));
      accounts.setBillingStateList(listOfAccounts.get("BillingState"));
      accounts.setBillingZipCodeList(listOfAccounts.get("BillingZipCode"));
    }
    return accounts;
  }
}
