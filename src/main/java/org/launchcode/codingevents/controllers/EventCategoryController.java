package org.launchcode.codingevents.controllers;

import org.launchcode.codingevents.data.EventCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("eventCategories")
public class EventCategoryController {

    @Autowired
    private  EventCategoryController eventCategoryController;

//    We will be creating 3 handlers in our controller:
//
//    displayAllEvents
//    renderCreateEventCategoryForm
//    processCreateEventCategoryForm

    @GetMapping
    public String displayAllEvents (Model model) {
        model.addAttribute("title", "All Categories");
        model.addAttribute("categories", EventCategoryRepository.findAll());
        return "eventCategories/index";
    }

}
