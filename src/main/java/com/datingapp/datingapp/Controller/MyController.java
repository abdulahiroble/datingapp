package com.datingapp.datingapp.Controller;

import org.springframework.stereotype.Controller;
import com.datingapp.datingapp.Model.CreateProfile;
import com.datingapp.datingapp.Repositories.AccountRepositories;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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

        // Data til viewet model.addAttribute("allAccounts", allAccounts);

        System.out.println(allAccounts);

        // returnerer viewet
        return "all-employees";
    }

    @GetMapping("/createuser")
    public String newProduct(Model model) {
        model.addAttribute("user", new CreateProfile(0, "hej", "med", "hej", "hej", 0));

        return "createuser";
    }

}
