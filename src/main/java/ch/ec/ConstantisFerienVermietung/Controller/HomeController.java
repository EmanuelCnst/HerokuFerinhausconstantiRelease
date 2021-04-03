package ch.ec.ConstantisFerienVermietung.Controller;


import ch.ec.ConstantisFerienVermietung.Model.HomeModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String FormStartseite(Model model){

        HomeModel myModelHome = new HomeModel();

        model.addAttribute("ModelStartseite",myModelHome);

        return "home";
    }


    @PostMapping("/home")
    public String Submit(@ModelAttribute HomeModel homeModel){


        return "home";

    }
}
