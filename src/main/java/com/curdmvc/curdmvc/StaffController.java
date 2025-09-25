package com.curdmvc.curdmvc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


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



    @GetMapping("/")
    public String addNewStaff(Model model, @RequestParam(required = false) String id) {

        Staff myStaff = new Staff();

        int index = getStaffIndex(id);

        model.addAttribute("addNewStaff", index == -1 ? myStaff : allStaff.get(index));

        return "addNewStaff";
    }

    public int getStaffIndex(String id) {
        for (int i = 0; i < allStaff.size(); i++) {
            if (allStaff.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    List<Staff> allStaff = new ArrayList<>();

    @PostMapping("dataSubmitForm")
    public String dataSubmitForm(Staff staff) {

        int index = getStaffIndex(staff.getId());
        if (index == -1) {
            allStaff.add(staff);
        } else {
            allStaff.set(index, staff);
        }

        return "redirect:/getAllStaff";
    }

    @GetMapping("/getAllStaff")
    public String getAllStaff(Model model) {
        
        model.addAttribute("staffList", allStaff);
        return "getAllStaff";
    }
    

    // Staff staff1 = new Staff("John Doe", "Manager", 50000);

    // @GetMapping("/staff-details")
    // public String getStaffDetails(Model model) {

        // Staff myStaff = new Staff("John Doe", "Manager", 50000);

        // model.addAttribute("staff", myStaff);

        // model.addAttribute("staff", staff1);

        // return "staffdetails";
    // }
}
