package org.eample.mvcTest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExceptionController {
    @RequestMapping("/exception")
    public String except(Model model) {
        int a = 10;
        int b = 0;
        int c = a / b;
        model.addAttribute("value", c);
        return "ok";
    }

    @ExceptionHandler(Exception.class)
    public String doExcept() {
        return "error";
    }
}
