package hello.controller;


import hello.model.Site;
import hello.repository.SiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CreateSiteController {

    @Autowired private SiteRepository repository;

    @RequestMapping(value="create/site")
    public @ResponseBody String create(){
        System.out.println("asd");

        Site site = new Site();
        site.setPage("<html><body></body></html>");
        repository.save(site);
        return "prova";
    }


}
