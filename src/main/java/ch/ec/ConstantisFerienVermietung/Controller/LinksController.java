package ch.ec.ConstantisFerienVermietung.Controller;


import ch.ec.ConstantisFerienVermietung.Model.FerienhauserModel;
import ch.ec.ConstantisFerienVermietung.Model.LinksModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LinksController {

    @GetMapping("/links")
    public String FormLinks(Model model){

        LinksModel myLinksModel = new LinksModel();

        model.addAttribute("modelLinks",myLinksModel);

        return "links";
    }


    @PostMapping("/links")
    public String Submit(@ModelAttribute LinksModel linksModel){


        return "links";

    }



}
