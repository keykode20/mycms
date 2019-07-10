package hello.controller;


import hello.model.Site;
import hello.repository.SiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CreateSiteController {

    @Autowired private SiteRepository repository;

    @RequestMapping(value="create/site")
    public @ResponseBody String create(@RequestParam String siteName,@RequestParam String description){
        System.out.println(siteName);

        Site site = new Site();
        site.setName(siteName);
        site.setDescription(description);
        site.setPage("<h1>hello dude!</h1>");
        repository.save(site);
        return "prova";
    }


}
