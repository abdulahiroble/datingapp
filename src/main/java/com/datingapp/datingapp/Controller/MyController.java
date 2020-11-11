package com.datingapp.datingapp.Controller;

import org.springframework.stereotype.Controller;
import com.datingapp.datingapp.Model.CreateProfile;
import com.datingapp.datingapp.Services.UserService;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class MyController {
    // AccountRepositories accounts = new AccountRepositories();

    @Autowired
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
    public String newUserForm(Model model) {
        // Model attribut til at binde form data
        CreateProfile user = new CreateProfile();
        model.addAttribute("user", user);
        return "newuserform";
    }

    @PostMapping("/saveUser")
    public String saveUser(@ModelAttribute("user") CreateProfile user) {

        try {
            userService.saveUser(user);
        } catch (Exception e) {
            System.out.println("Error can't save to database " + e);
        }
        // save employee to database

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
