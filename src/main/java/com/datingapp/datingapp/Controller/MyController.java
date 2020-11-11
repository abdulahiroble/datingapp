package com.datingapp.datingapp.Controller;

import org.springframework.stereotype.Controller;
import com.datingapp.datingapp.Model.CreateProfile;
import com.datingapp.datingapp.Services.UserService;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class MyController {

    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public String allEmployees(Model model) {

        return "all-employees";
    }

    // display list of employees
    @GetMapping("/forside")
    public String viewHomePage(Model model) {
        return findPaginated(1, "firstName", "asc", model);
    }

    @GetMapping("/")
    public String newUserForm(Model model) {
        // Model attribut til at binde form data
        CreateProfile user = new CreateProfile();
        model.addAttribute("user", user);
        return "index";
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

    @GetMapping("/forside/{forsideNo}")
    public String findPaginated(@PathVariable(value = "forsideNo") int pageNo,
            @RequestParam("sortField") String sortField, @RequestParam("sortDir") String sortDir, Model model) {

        try {

            int pageSize = 10;

            Page<CreateProfile> page = userService.findPaginated(pageNo, pageSize, sortField, sortDir);
            ;
            List<CreateProfile> listUser = page.getContent();

            /*
             * model.addAttribute("currentPage", pageNo); model.addAttribute("totalPages",
             * page.getTotalPages()); model.addAttribute("totalItems",
             * page.getTotalElements());
             * 
             * model.addAttribute("sortField", sortField); model.addAttribute("sortDir",
             * sortDir); model.addAttribute("reverseSortDir", sortDir.equals("asc") ? "desc"
             * : "asc");
             */

            model.addAttribute("listUser", listUser);
        } catch (Exception e) {
            System.out.println("Error can't load up list " + e);
        }

        return "forside";
    }

}
