package com.datingapp.datingapp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.datingapp.datingapp.Model.CreateProfile;
import com.datingapp.datingapp.Repositories.AccountRepositories;
import com.datingapp.datingapp.Services.UserService;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

import java.util.List;
import java.util.Map;

@Controller
public class MyController {
    AccountRepositories accounts = new AccountRepositories();

    private UserService userService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/all")
    public String allEmployees(Model model) {
        // Data fra databasen

        // List<CreateProfile> allAccounts = accounts.showAllAccounts();

        // Data til viewet
        // model.addAttribute("allAccounts", allAccounts);

        // accounts.saveUserToDatabase();

        // System.out.println(allAccounts);

        // returnerer viewet
        return "all-employees";
    }

    @GetMapping("/new")
    public String newProduct(Model model) {
        // Model attribut til at binde form data
        CreateProfile user = new CreateProfile();
        model.addAttribute("user", user);
        return "createuser";
    }

    @PostMapping("/saveUser")
    public String saveUser(@ModelAttribute("user") CreateProfile user) {
        // save employee to database
        userService.saveUser(user);
        return "redirect:/";
    }

    /*
     * @PostMapping(path = "new/account", consumes =
     * "application/x-www-form-urlencoded") public String submit(WebRequest wr,
     * CreateProfile request) {
     * 
     * CreateProfile profileToSave = new CreateProfile(wr.getParameter("user"),
     * wr.getParameter("firstname"), wr.getParameter("lastname"),
     * wr.getParameter("phone"), wr.getParameter("email"));
     * 
     * accounts.saveUserToDatabase(profileToSave);
     * 
     * System.out.println(profileToSave);
     * 
     * return "index"; }
     */

}
