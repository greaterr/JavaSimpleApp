package ru.aston.greaterr.springwebapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    private final TestBean testBean;

    public WebController() {
        this.testBean = new TestBean("Тимур");
    }

    @GetMapping("/name")
    public String showName(Model model) {
        model.addAttribute("name", testBean.getName());
        return "namePage";
    }
}
