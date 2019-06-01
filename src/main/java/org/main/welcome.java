package org.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class welcome{    
    @RequestMapping("/welcome")
    public String loginMessage(){
        return "welcome";
    }
}