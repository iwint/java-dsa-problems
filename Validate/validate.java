package Validate;

class userDetails {
  String user_name = "Iwin";
  String password = "241323";

  public boolean validateUser(String userName, String Password) {

    boolean isExist = false;
    if (this.user_name.equals(userName) && this.password.equals(Password)) {
      isExist = true;
    }
    return isExist;
  }

}

public class validate {

  public static void main(String a[]) {
    String userName = "Iwin";
    String Password = "241323";

    userDetails checkuser = new userDetails();
    boolean result = checkuser.validateUser(userName, Password);
    if (result == true) {
      System.out.println("USER EXIST");
    } else {
      System.out.println("USER NOT EXIST");
    }
  }

}
