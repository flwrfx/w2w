package flfx.w2w.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {


    @RequestMapping("")
    public String index(Model model) {
        //model.addAttribute("canvasses", canvasRepository.findAll());
        return "index";
    }

}//public class
