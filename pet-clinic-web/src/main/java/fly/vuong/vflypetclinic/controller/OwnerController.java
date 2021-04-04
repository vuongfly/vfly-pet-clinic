package fly.vuong.vflypetclinic.controller;

import fly.vuong.vflypetclinic.service.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owner")
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"","/", "/index"})
    public String listOwner(Model model){

        model.addAttribute("owners", ownerService.findAll());

        return "owners/index";
    }

}
