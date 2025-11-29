package com.delivery.delivery_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {

    @GetMapping("/info")
    public String info() {
        return """
                Delivery API
                Desenvolvido em Java %s
                """.formatted(System.getProperty("java.version"));
    }
}
