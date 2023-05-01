package com.example.domain;

public class User {
  private Integer id;
  private String name;
  private Integer age;
  private Address address;

  public void setId(Integer id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public Integer getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Integer getAge() {
    return age;
  }

  public Address getAddress() {
    return address;
  }

  @Override
  public String toString() {
    return "User{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", age=" + age +
            ", address=" + address +
            '}';
  }
}
