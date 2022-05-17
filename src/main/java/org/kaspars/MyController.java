package org.kaspars;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/")
public class MyController {

    @GetMapping("/test")
    public String test() {
        return "test";
    }

}
