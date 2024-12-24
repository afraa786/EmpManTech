package demo.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MyController {

    @GetMapping("/RareBeauty")
    public String myMethod() {
        return "RareBeauty"; // Looks for resources/static/index.html
    }
}
