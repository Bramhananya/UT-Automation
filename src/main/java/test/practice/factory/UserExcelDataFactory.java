package test.practice.factory;

import java.util.HashMap;
import java.util.Map;
import test.practice.entities.User;

public class UserExcelDataFactory {

  private UserExcelDataFactory() {

  }

  static Map<String, String> listOfUsers;

  public static User getUserDetails(Map<String, String> map) {
    User user = new User();
    user.setFullName(map.get("CustomerName"));
    user.setPhoneNumber(map.get("CustomerPhoneNumber"));
    return user;
  }


  public static User getUserList(Map<String, Map<String, String>> map) {
    User users = new User();
    for (int i = 1; i <= map.size(); i++) {
      listOfUsers = new HashMap<>();
      listOfUsers = map.get(Integer.toString(i));
      users.setFullNameList(listOfUsers.get("CustomerName"));
      users.setPhoneNumberList(listOfUsers.get("CustomerPhoneNumber"));
    }
    return users;
  }
}
