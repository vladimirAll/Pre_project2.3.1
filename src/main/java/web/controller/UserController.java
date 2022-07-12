package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.service.UserService;


@Controller
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public String getUsers(Model model) {
        model.addAttribute("user", userService.getAllUsers());
        return "user";
    }

    @GetMapping("/new")
    public String newPlayer(Model model) {
       model.addAttribute("user", new User());
       return "new";
    }

    @PostMapping("/user")
    public String addPlayer(@ModelAttribute("user") User user) {
        userService.addUser(user);
        return "redirect:/user";
    }

    @GetMapping("delete/{id}")
    public String deletePlayer(@PathVariable("id") Long id) {
        userService.deleteUser(id);
        return "redirect:/user";
    }

    @GetMapping("update/{id}")
    public String updateUser(@PathVariable("id") Long id, Model model) {
        model.addAttribute("user", userService.findById(id));
        return "/update";
    }

    @PostMapping("update/{id}")
    public String addUpdateUser(User user) {
        userService.updateUser(user);
        return "redirect:/user";
    }
}
