package com.haa.ha;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HaController {

    @RequestMapping("/hello")
    String home() {
        return "Fxck World!";
    }
    @RequestMapping("/what")
    String what() {
        return "Fxck u";
    }

}
