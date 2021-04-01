package fly.vuong.vflypetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owner")
@Controller
public class OwnerController {

    @RequestMapping({"","/", "/index"})
    public String listOwner(){
        return "owners/index";
    }

}
