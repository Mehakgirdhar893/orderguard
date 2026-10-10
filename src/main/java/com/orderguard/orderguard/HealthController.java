
package com.orderguard.orderguard;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/health")
    public String checkHealth() {
        return "OrderGuard backend is running!";
    }
    @GetMapping("/me")
    public String me(){
        return "yo yo honey singh!";
    }
}
