package hello.controller;

import hello.model.User;
import hello.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @Autowired private UserRepository repository;

    @RequestMapping(value = "/index")
    public String index(){
        return "index.html";
    }

    @RequestMapping(value = "/add")
    public String add(){
        User n = new User();
        n.setName("sassucci");
        n.setEmail("tarrannoni@gmai..com");
        repository.save(n);
        return "added.html";
    }

    @RequestMapping(value = "/viewAll")
    public String viewall( Model model){
        Iterable<User> all = repository.findAll();
        User next = all.iterator().next();
        model.addAttribute("all", next.getEmail());
        return "viewAll.html";
    }

}
