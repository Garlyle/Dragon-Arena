package com.garlyle.controller;

import com.garlyle.model.Skill;
import com.garlyle.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MainController {
    @Autowired
    SkillRepository skillRepository;

    @RequestMapping("/")
    public String index(Model model) {
        Iterable<Skill> skills = skillRepository.findAll();
        for (Skill s : skills) {
            System.out.println(s.getName());
        }
        System.out.println("That's all");

        return "redirect:/index.html";
    }
}
