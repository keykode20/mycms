package hello.controller;


import hello.model.Site;
import hello.repository.SiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class StagingSiteController {

    @Autowired private SiteRepository repository;

    @RequestMapping(value="/staging")
    public String staging(@RequestParam Integer id, Model model){
        Optional<Site> content = repository.findById(id);
        model.addAttribute("siteName",content.get().getName());
        model.addAttribute("content",content.get().getPage());
        return "staging_site.html";
    }

}
