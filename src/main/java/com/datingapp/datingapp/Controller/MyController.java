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

    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public String allEmployees(Model model) {

        return "all-employees";
    }

    @GetMapping("/")
    public String newUserForm(Model model) {
        // Model attribut til at binde form data
        CreateProfile user = new CreateProfile();
        model.addAttribute("user", user);
        return "index";
    }

    @GetMapping("/forside")
    public String showList(Model model) {

        // Page<CreateProfile> page = userService.findPaginated(pageNo, pageSize,
        // sortField, sortDir);
        // List<CreateProfile> listEmployees = page.getContent();

        return "forside";
    }

    @PostMapping("/saveUser")
    public String saveUser(@ModelAttribute("user") CreateProfile user) {

        try {
            userService.saveUser(user);
        } catch (Exception e) {
            System.out.println("Error can't save to database " + e);
        }

        return "redirect:/forside";
    }

}
