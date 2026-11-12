package com.springboot3essentialtraining.room_web_app.web.controller;

import com.springboot3essentialtraining.room_web_app.data.entity.StaffMember;
import com.springboot3essentialtraining.room_web_app.data.repository.StaffRepository;
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

    private final StaffRepository staffRepository;

    public StaffController(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    @GetMapping
    public String getStaffPage(Model model) {
        List<StaffMember> staffMembers = this.staffRepository.findAll();
        List<Staff> staff = new ArrayList<>(staffMembers.size());
        staffMembers.forEach(e -> staff.add(new Staff(e.getEmployeeId(), e.getFirstName(), e.getLastName(), e.getPosition().toString())));
        model.addAttribute("staff", staff);
        return "staff";
    }
}
