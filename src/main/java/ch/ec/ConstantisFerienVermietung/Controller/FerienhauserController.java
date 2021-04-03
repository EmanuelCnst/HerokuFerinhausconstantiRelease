package ch.ec.ConstantisFerienVermietung.Controller;

import ch.ec.ConstantisFerienVermietung.Model.FerienhauserModel;
import ch.ec.ConstantisFerienVermietung.Model.UeberUnsModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FerienhauserController {


    @GetMapping("/ferienhaueser")
    public String FormStartseite(Model model){

        FerienhauserModel myFerienhauserModel = new FerienhauserModel();

        model.addAttribute("ModelFerienhaus ",myFerienhauserModel);

        return "ferienhaueser";
    }


    @PostMapping("/ferienhaueser")
    public String Submit(@ModelAttribute FerienhauserModel ferienhauserModel){


        return "ferienhaueser";

    }
}
