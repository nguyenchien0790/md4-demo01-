package chien.nguyen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController
{
    @GetMapping("/home")
    public String nguyenchien(Model model){
        String myname = "nguyenchien123";
        model.addAttribute("namei", myname);
        return "hello";
    }
}
