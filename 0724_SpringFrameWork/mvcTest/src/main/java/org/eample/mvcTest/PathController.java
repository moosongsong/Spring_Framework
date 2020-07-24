package org.eample.mvcTest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PathController {
    @RequestMapping(value = "/member/{id}/{number}")  //http://localhost:8080/member/find/moosong
    public String path(@PathVariable("id")String id,
                       @PathVariable("number") int number,
                       Model model){
        model.addAttribute("id", id);
        model.addAttribute("number", number);

        return "pathVariable";
    }
}
