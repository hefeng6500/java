package org.yang.pojo;

public class User {
  private int id;
  private String username;
  private String password;
  private String gender;
  private String addr;

  public int getId() {
    return id;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public String getGender() {
    return gender;
  }

  public String getAddr() {
    return addr;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public void setAddr(String addr) {
    this.addr = addr;
  }
}
