package com.artPortfolio.artPortfolio.controllers;

import com.artPortfolio.artPortfolio.models.Avatar;
import com.artPortfolio.artPortfolio.repos.AvatarRepo;
import com.artPortfolio.artPortfolio.repos.UserRepo;
import com.artPortfolio.artPortfolio.models.Role;
import com.artPortfolio.artPortfolio.models.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collections;

@Controller
public class RegistrationController {

    @Autowired
    private UserRepo usersRepo;

    @Autowired
    private AvatarRepo avatarRepo;

    @GetMapping("/registration")
    public String showRegistration(){

        return "registration";
    }

    @PostMapping("/registration")
    public String addUser(Users user, ModelMap modelMap){

        System.out.println("Регистрация");

        user.setActive(true);
        user.setRoles(Collections.singleton(Role.USER));
        usersRepo.save(user);

        Avatar newAvatar = new Avatar(user);
        avatarRepo.save(newAvatar);

        return "login";
    }
}
