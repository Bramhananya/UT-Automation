package test.practice.entities;

import java.util.ArrayList;
import java.util.List;

public class User {

  private String fullName;
  private String emailId;
  private String phoneNumber;
  private String attendTo;
  private String attendPhone;

  private List<String> fullNameList = new ArrayList<>();
  private List<String> emailIdList = new ArrayList<>();
  private List<String> phoneNumberList = new ArrayList<>();
  private List<String> attendToList = new ArrayList<>();

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String name) {
    this.fullName = name;
  }

  public String getEmailId() {
    return emailId;
  }

  public void setEmailId(String emailId) {
    this.emailId = emailId;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getAttendTo() {
    return attendTo;
  }

  public void setAttendTo(String attendTo) {
    this.attendTo = attendTo;
  }

  public String getAttendPhone() {
    return attendPhone;
  }

  public void setAttendPhone(String attendPhone) {
    this.attendPhone = attendPhone;
  }

  public List<String> getFullNameList() {
    return fullNameList;
  }

  public void setFullNameList(String fullName) {
    this.fullNameList.add(fullName);
  }

  public List<String> getEmailIdList() {
    return emailIdList;
  }

  public void setEmailIdList(String emailId) {
    this.emailIdList.add(emailId);
  }

  public List<String> getPhoneNumberList() {
    return phoneNumberList;
  }

  public void setPhoneNumberList(String phoneNumber) {
    this.phoneNumberList.add(phoneNumber);
  }

  public List<String> getAttendToList() {
    return attendToList;
  }

  public void setAttendToList(String attendTo) {
    this.attendToList.add(attendTo);
  }
}
