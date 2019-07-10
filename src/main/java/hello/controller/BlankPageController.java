package hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BlankPageController {

    @RequestMapping(value = "blank_container")
    public String blank(){
        return "blank_container.html";
    }
}
