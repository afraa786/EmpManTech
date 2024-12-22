package demo.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

    @GetMapping("/RareBeauty")
    public String myMethod() {
        return "RareBeauty";
    }

    @PostMapping("/results")
    public String postData(
            @RequestParam String skinType,
            @RequestParam String foundationColor,
            @RequestParam String coverage,
            @RequestParam String finish,
            Model model) {
        model.addAttribute("skinType", skinType);
        model.addAttribute("foundationColor", foundationColor);
        model.addAttribute("coverage", coverage);
        model.addAttribute("finish", finish);

        return "results";
    }

    @GetMapping("/results")
    public String showResults() {
        return "results";
    }
}
