package org.example;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class Product {

  private Integer code;
  private String name;

  public Product() {
  }

  public Product(Integer code, String name) {
    this.code = code;
    this.name = name;
  }

  public Integer getCode() {
    return code;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Product [code=" + code + ", name=" + name + "]";
  }
}
