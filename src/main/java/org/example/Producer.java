package org.example;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.reactive.messaging.Outgoing;

@ApplicationScoped
public class Producer {

  @Outgoing("producer-out")
  public Product produce() {
    return new Product(111, "Product A");
  }
}
