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

    // display list of users
    @GetMapping("/forside")
    public String viewHomePage(Model model) {
        return showUserList(1, model);
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

    @GetMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable(value = "id") long id) {

        try {
            this.userService.deleteUser(id);
        } catch (Exception e) {
            System.out.println("Error can't delete user " + e);
        }

        return "redirect:/forside";
    }

    @GetMapping("/userFormUpdate/{id}")
    public String userFormUpdate(@PathVariable(value = "id") long id, Model model) {

        try {
            CreateProfile user = userService.getUserById(id);

            model.addAttribute("user", user);
        } catch (Exception e) {
            System.out.println("Error can't update user profile " + e);
        }

        return "updateuser";
    }

    /*
     * @GetMapping("/sendMessage/{id}") public String
     * sendMessage(@PathVariable(value = "id") long id, Model model) {
     * 
     * try { CreateProfile user = userService.getUserById(id);
     * 
     * model.addAttribute("user", user); } catch (Exception e) {
     * System.out.println("Error can't send message to person " + e); }
     * 
     * return "updateuser"; }
     */

    @GetMapping("/forside/{forsideNo}")
    public String showUserList(@PathVariable(value = "forsideNo") int pageNo, Model model) {

        try {
            int pageSize = 10;

            Page<CreateProfile> page = userService.showUserList(pageNo, pageSize);
            ;
            List<CreateProfile> listUser = page.getContent();

            model.addAttribute("listUser", listUser);
        } catch (Exception e) {
            System.out.println("Error can't load up list " + e);
        }

        return "forside";
    }

}
