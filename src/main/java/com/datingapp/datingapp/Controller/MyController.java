package com.datingapp.datingapp.Controller;

import org.springframework.stereotype.Controller;
import com.datingapp.datingapp.Model.CreateProfile;
import com.datingapp.datingapp.Repositories.AccountRepositories;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

import java.util.List;

@Controller
public class MyController {
    AccountRepositories accounts = new AccountRepositories();

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/all")
    public String allEmployees(Model model) {
        // Data fra databasen

        List<CreateProfile> allAccounts = accounts.showAllAccounts();

        // Data til viewet
        model.addAttribute("allAccounts", allAccounts);

        System.out.println(allAccounts);

        // returnerer viewet
        return "all-employees";
    }

    @RequestMapping("new/user")
    public String newProduct(Model model) {
        model.addAttribute("user", new CreateProfile(2, null, null, null, null, 0));

        return "createuser";
    }

    /* @PostMapping("new/account")
    public String submit(@RequestBody String request) {
        System.out.println(request);

        return "index";
    } */


     @PostMapping("new/account")
     public String submit(WebRequest wr) {

         System.out.println(wr.getParameter("fname"));

         CreateProfile profileToSave = new CreateProfile(wr.getParameter(""));

        accounts.saveUserToDatabase(profileToSave);


    //CreateProfile saveUser = accounts.saveUserToDatabase(request);

    //System.out.println(request);

     //System.out.println(saveUser);

    return "index"; }


}
