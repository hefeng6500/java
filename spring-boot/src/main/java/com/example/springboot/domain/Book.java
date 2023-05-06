package com.example.springboot.domain;

public class Book {
  private Integer id;
  private String type;
  private String name;
  private double price;
  private String description;

  public Integer getId() {
    return id;
  }

  public String getType() {
    return type;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  public String getDescription() {
    return description;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    return "Book{" +
            "id=" + id +
            ", type='" + type + '\'' +
            ", name='" + name + '\'' +
            ", price=" + price +
            ", description='" + description + '\'' +
            '}';
  }
}
