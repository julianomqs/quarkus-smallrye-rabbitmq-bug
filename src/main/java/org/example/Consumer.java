package org.example;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.reactive.messaging.Incoming;

@ApplicationScoped
public class Consumer {

  @Incoming("consume-in")
  public void consume(Product product) {
    System.out.println(product);
  }
}
