package com.artPortfolio.artPortfolio.controllers;

import com.artPortfolio.artPortfolio.models.Avatar;
import com.artPortfolio.artPortfolio.models.PersonalData;
import com.artPortfolio.artPortfolio.models.Users;
import com.artPortfolio.artPortfolio.repos.AvatarRepo;
import com.artPortfolio.artPortfolio.repos.PersonalDataRepo;
import com.artPortfolio.artPortfolio.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;

@Controller
public class indexController {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private AvatarRepo avatarRepo;

    @Autowired
    private PersonalDataRepo personalDataRepo;

    @GetMapping("/")
    public String index(@AuthenticationPrincipal Users user, ModelMap modelMap){

        PersonalData personalData = user.findPersonalData(personalDataRepo.findAll());
        Avatar avatar = user.findAvatar(avatarRepo.findAll());

        modelMap.put("personalData", personalData);
        modelMap.put("avatar", avatar);

        return "userProfile";
    }
}
