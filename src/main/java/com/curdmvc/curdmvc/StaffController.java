package com.curdmvc.curdmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StaffController {

    @GetMapping("/")
    public String home() {
        return "staffnames";
    }

    @GetMapping("/staffnames")
    public String getStaffNames() {
        return "staffnames";
    }
}
