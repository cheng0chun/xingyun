package com.yuzhou.xingyun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author chengchun
 * @date 2020/2/17 - 15:06
 */
@Controller
public class HelloController {
    @GetMapping("/hello")
    public  String  hello(@RequestParam(name = "name") String name, Model model){
        model.addAttribute("name",name);
        return   "hello";
    }

}
