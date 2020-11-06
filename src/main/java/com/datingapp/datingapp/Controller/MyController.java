package com.datingapp.datingapp.Controller;

import org.springframework.stereotype.Controller;
import com.datingapp.datingapp.Model.CreateProfile;
import com.datingapp.datingapp.Repositories.AccountRepositories;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class MyController {
    AccountRepositories accounts = new AccountRepositories();

    @GetMapping("/")
    public String index(Model model) {

        // Data fra databasen
        List<CreateProfile> allAccounts = accounts.showAllAccounts();

        // Data til viewet
        model.addAttribute("allAccounts", allAccounts);

        System.out.println(allAccounts);

        return "index";

    }

    @GetMapping("/kontakt")
    public String kontakt() {

        return "kontakt";
    }

    @GetMapping("/admin")
    public String admin() {

        return "admin";
    }
}