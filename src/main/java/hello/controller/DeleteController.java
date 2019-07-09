package hello.controller;


import hello.repository.SiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DeleteController {

    @Autowired
    private SiteRepository repository;

    @RequestMapping(value="/destroy/all")
    public @ResponseBody String destroyAll(){
        repository.deleteAll();
        return "puff.. all destroied";
    }

    @RequestMapping(value="destroy/site")
    public @ResponseBody String destroy(@RequestParam Integer id){
        repository.deleteById(id);
        return "puff.. site with id:" + id +" destroied";
    }

}

