package test.practice.entities;

import java.util.ArrayList;
import java.util.List;

public class Accounts {

  private String accountName;
  private String accountNumber;
  private String salesRep;
  private String shipToNameID;
  private String shippingAddress;
  private String shippingCity;
  private String shippingState;
  private String shippingZipCode;
  private String billingAddress;
  private String billingCity;
  private String billingState;
  private String billingZipCode;
  private String poNumber;

  private List<String> accountNameList = new ArrayList<>();
  private List<String> accountNumberList = new ArrayList<>();
  private List<String> salesRepList = new ArrayList<>();
  private List<String> shipToNameIDList = new ArrayList<>();
  private List<String> shippingAddressList = new ArrayList<>();
  private List<String> shippingCityList = new ArrayList<>();
  private List<String> shippingStateList = new ArrayList<>();
  private List<String> shippingZipCodeList = new ArrayList<>();
  private List<String> billingAddressList = new ArrayList<>();
  private List<String> billingCityList = new ArrayList<>();
  private List<String> billingStateList = new ArrayList<>();
  private List<String> billingZipCodeList = new ArrayList<>();
  private List<String> poNumberList = new ArrayList<>();

  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public String getShipToNameID() {
    return shipToNameID;
  }

  public void setShipToNameID(String shipToNameID) {
    this.shipToNameID = shipToNameID;
  }

  public String getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(String shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  public String getShippingCity() {
    return shippingCity;
  }

  public void setShippingCity(String shippingCity) {
    this.shippingCity = shippingCity;
  }

  public String getShippingState() {
    return shippingState;
  }

  public void setShippingState(String shippingState) {
    this.shippingState = shippingState;
  }

  public String getShippingZipCode() {
    return shippingZipCode;
  }

  public void setShippingZipCode(String shippingZipCode) {
    this.shippingZipCode = shippingZipCode;
  }

  public String getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(String billingAddress) {
    this.billingAddress = billingAddress;
  }

  public String getBillingCity() {
    return billingCity;
  }

  public void setBillingCity(String billingCity) {
    this.billingCity = billingCity;
  }

  public String getBillingState() {
    return billingState;
  }

  public void setBillingState(String billingState) {
    this.billingState = billingState;
  }

  public String getBillingZipCode() {
    return billingZipCode;
  }

  public void setBillingZipCode(String billingZipCode) {
    this.billingZipCode = billingZipCode;
  }

  public List<String> getAccountNameList() {
    return accountNameList;
  }

  public void setAccountNameList(String name) {
    this.accountNameList.add(name);
  }

  public List<String> getAccountNumberList() {
    return accountNumberList;
  }

  public void setAccountNumberList(String number) {
    this.accountNumberList.add(number);
  }

  public List<String> getShipToNameIDList() {
    return shipToNameIDList;
  }

  public void setShipToNameIDList(String shipToNameIDList) {
    this.shipToNameIDList.add(shipToNameIDList);
  }

  public List<String> getShippingAddressList() {
    return shippingAddressList;
  }

  public void setShippingAddressList(String shippingAddressList) {
    this.shippingAddressList.add(shippingAddressList);
  }

  public List<String> getShippingCityList() {
    return shippingCityList;
  }

  public void setShippingCityList(String shippingCityList) {
    this.shippingCityList.add(shippingCityList);
  }

  public List<String> getShippingStateList() {
    return shippingStateList;
  }

  public void setShippingStateList(String shippingStateList) {
    this.shippingStateList.add(shippingStateList);
  }

  public List<String> getShippingZipCodeList() {
    return shippingZipCodeList;
  }

  public void setShippingZipCodeList(String shippingZipCodeList) {
    this.shippingZipCodeList.add(shippingZipCodeList);
  }

  public List<String> getBillingAddressList() {
    return billingAddressList;
  }

  public void setBillingAddressList(String billingAddressList) {
    this.billingAddressList.add(billingAddressList);
  }

  public List<String> getBillingCityList() {
    return billingCityList;
  }

  public void setBillingCityList(String billingCityList) {
    this.billingCityList.add(billingCityList);
  }

  public List<String> getBillingStateList() {
    return billingStateList;
  }

  public void setBillingStateList(String billingStateList) {
    this.billingStateList.add(billingStateList);
  }

  public List<String> getBillingZipCodeList() {
    return billingZipCodeList;
  }

  public void setBillingZipCodeList(String billingZipCodeList) {
    this.billingZipCodeList.add(billingZipCodeList);
  }

  public String getPONumber() {
    return poNumber;
  }

  public void setPONumber(String pONumber) {
    poNumber = pONumber;
  }

  public String getSalesRepName() {
    return salesRep;
  }

  public void setSalesRepName(String salesRep) {
    this.salesRep = salesRep;
  }

  public List<String> getSalesRepNameList() {
    return salesRepList;
  }

  public void setSalesRepNameList(String salesRep) {
    this.salesRepList.add(salesRep);
  }

  public int getListSize() {
    return accountNameList.size();
  }

  public List<String> getPoNumberList() {
    return poNumberList;
  }

  public void setPoNumberList(String poNumber) {
    this.poNumberList.add(poNumber);
  }
}
