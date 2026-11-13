package com.springboot3essentialtraining.room_web_app.web.controller;

import com.springboot3essentialtraining.room_web_app.data.entity.StaffMember;
import com.springboot3essentialtraining.room_web_app.data.repository.StaffRepository;
import com.springboot3essentialtraining.room_web_app.service.StaffService;
import com.springboot3essentialtraining.room_web_app.web.model.Staff;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/staff")
public class StaffController {

    private final StaffService staffService;

    public StaffController(StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping
    public String getStaffPage(Model model) {
        model.addAttribute("staff", this.staffService.getAllStaff());
        return "staff";
    }
}
