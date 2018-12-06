/**
 * By Andrew Wilson.
 * code adapted from Oracle.
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeInfo {

  private StringBuilder name;
  private String code;
  private String deptId;
  private Pattern p = Pattern.compile("^[A-Z][a-z]{3}[0-9]{2}$");
  Scanner scanner = new Scanner(System.in);

  public EmployeeInfo() {
    setName();
    setDeptId();
  }

  public StringBuilder getName() {
    return name;
  }

  /**
   * getCode returns the department code.
   */
  public String getCode() {
    return code;
  }

  /**
   * setName calls the code to create the employee code.
   */
  public void setName() {
    String nameString = inputName();
    name = new StringBuilder(nameString);
    /**
     * call to create the employee code.
     */
    createEmployeeCode(name);
  }

  /**
   * Takes the employee name as input and returns the code as first initial + last name. or, if
   * there is no last name given they will be assigned guest.
   *
   * @param name - input of users name
   */
  public void createEmployeeCode(StringBuilder name) {
    //checkName(name);
    if (checkName(name)) { //valid and contains a space
      code = name.charAt(0) + name.substring(name.indexOf(" ") + 1);
    } else { //name did not contain a space, using guest
      code = "guest";
    }
  }

  private String inputName() {
    System.out.print("Please enter your first and last name: ");
    String nameString = scanner.nextLine();

    return nameString;
  }

  private boolean checkName(StringBuilder name) {
    if (name.indexOf(" ") != -1) {   // check for space
      return true;
    } else {
      return false;
    }
  }

  public String getDeptId() {
    return deptId;
  }

  /**
   * Makes sure the inputted ID is valid (has 4 letters starting with cap and followed by 2 digits).
   * if the ID is not valid then it is set to None01
   */
  public void setDeptId() {
    String temp;
    System.out.println("Enter your departmentID");
    temp = scanner.nextLine();
    if (validId(temp)) {
      this.deptId = temp;
    } else {
      this.deptId = "None01";
    }
  }

  private String getId() {
    if (validId(this.deptId)) {
      return deptId;
    } else {
      return "None01";
    }
  }

  private boolean validId(String id) {
    Matcher m = p.matcher(id);
    if (m.matches()) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * toString.
   *
   * @return - returns the employee code and the department ID
   */
  public String toString() {
    return "Employee Code: " + code
        + "\n Department Id: " + deptId;
  }

  /**
   * Takes in the Department ID and for security reverses it.
   *
   * @param id - Department ID
   * @return - returns the reversed ID
   */
  public String reverseString(String id) {
    String temp = "";
    for (int i = id.length(); i > 0; i--) {
      temp = temp + id.charAt(i - 1);
    }
    id = temp;
    return id;
  }

}