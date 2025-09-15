package com.curdmvc.curdmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StaffController {

    @GetMapping("/")
    public String home() {
        return "staffdetails";
    }

    @GetMapping("/staff-details")
    public String getStaffDetails(Model model) {

        Staff myStaff = new Staff("John Doe", "Manager", 50000);

        model.addAttribute("staff", myStaff);
        return "staffdetails";
    }
}
