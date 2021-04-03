package ch.ec.ConstantisFerienVermietung.Controller;


import ch.ec.ConstantisFerienVermietung.Model.FerienhauserModel;
import ch.ec.ConstantisFerienVermietung.Model.KontaktModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class KontaktController {


    @GetMapping("/kontakt")
    public String FormKontakt(Model model){

        KontaktModel myKontaktModel = new KontaktModel();

        model.addAttribute("kontaktModel",myKontaktModel);

        return "kontakt";
    }


    @PostMapping("/kontakt")
    public String Submit(@ModelAttribute KontaktModel kontaktModel){


        return "kontakt";

    }
}
