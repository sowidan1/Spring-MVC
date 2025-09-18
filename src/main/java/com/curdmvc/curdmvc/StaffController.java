package com.curdmvc.curdmvc;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StaffController {

    // @GetMapping("/")
    // public String home() {
    //     return "staffdetails";
    // }

    // List<Staff> staffList = Arrays.asList(
    //     new Staff("John Doe", "Manager", 50000),
    //     new Staff("Jane Smith", "Developer", 7000),
    //     new Staff("Alice Johnson", "Designer", 6000),
    //     new Staff("Bob Brown", "Intern", 3000)
    // );

    Staff staff1 = new Staff("John Doe", "Manager", 50000);

    @GetMapping("/staff-details")
    public String getStaffDetails(Model model) {

        // Staff myStaff = new Staff("John Doe", "Manager", 50000);

        // model.addAttribute("staff", myStaff);

        model.addAttribute("staff", staff1);

        return "staffdetails";
    }
}
