
package com.orderguard.orderguard;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class OrderController {

    @GetMapping("/orders")
    public Order getOrders() {
        return new Order(1L, "Laptop", 55000.0);
    }
}
