
package com.orderguard.orderguard;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class OrderController {

  private final List<Order> orders = new ArrayList<>();

  public OrderController() {
    orders.add(new Order(1L, "Laptop", 55000.0));
    orders.add(new Order(2L, "Mouse", 900.0));
    orders.add(new Order(3L, "Keyboard", 2500.0));
  }

  @GetMapping("/orders")
  public List<Order> getOrders() {

    return orders;
  }



  @PostMapping("/orders")
  public Order createOrder(@RequestBody Order order) {
    orders.add(order);
    return order;
  }



}
