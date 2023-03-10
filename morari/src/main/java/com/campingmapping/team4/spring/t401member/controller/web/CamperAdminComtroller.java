package com.campingmapping.team4.spring.t401member.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
*
* This is the controller for opening web pages of admin functions in Camper web application.
*
* 這是用於打開Camper後台網頁的控制器。
*/
@Controller
@RequestMapping("/admin/camper")
public class CamperAdminComtroller {

    @GetMapping("/alluser")
    public String camperIndex() {
        return "camper/admin/alluser";
    }
    @GetMapping("/guestedit")
    public String guestEdit() {
        return "camper/admin/guestedit";
    }

}
