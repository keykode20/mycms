package hello.controller;


import hello.model.Site;
import hello.repository.SiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TableController {

    @Autowired private SiteRepository repository;

    @RequestMapping(value="/table")
    public String table(Model model){
        List<Site> sites = repository.findAll();
        System.out.println("size: "+sites.size());
        sites.forEach(System.out::println);
        model.addAttribute("sites",sites);
        return "tables.html";
    }

}
