package ch.ec.ConstantisFerienVermietung.Controller;

import ch.ec.ConstantisFerienVermietung.Model.HomeModel;
import ch.ec.ConstantisFerienVermietung.Model.UeberUnsModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UeberUnsController {


    @GetMapping("/ueberuns")
    public String FormStartseite(Model model){

        UeberUnsModel myModelUeberUns = new UeberUnsModel();

        model.addAttribute("ModelUeberUns ",myModelUeberUns);

        return "ueberuns";
    }


    @PostMapping("/ueberuns")
    public String Submit(@ModelAttribute UeberUnsModel ueberUnsModel){


        return "ueberuns";

    }
}
