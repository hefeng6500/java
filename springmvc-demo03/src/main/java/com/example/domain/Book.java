package com.example.domain;

public class Book {
  private String name;
  private double price;

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "Book{" +
            "name='" + name + '\'' +
            ", price=" + price +
            '}';
  }
}
