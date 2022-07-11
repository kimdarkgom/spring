package com.haa.ha;

import dto.TbMenu;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping("/insert")
    public String insert(){
        return "insert";
    }
    @PostMapping("/insert_proc")
    @ResponseBody
    public String insert_proc(@ModelAttribute TbMenu tbmenu){
        System.out.println(tbmenu.getMenu());
        System.out.println(tbmenu.getPrice());
        System.out.println(tbmenu.getImg());
        return "insert";
    }
}