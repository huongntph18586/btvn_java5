package com.example.btvn;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestParam;

public class FirstController {
    @GetMapping("bai1")
    public String bai1(@RequestParam(name = "str1") String str1,
                       @RequestParam(name = "str2") String str2,
                       Model model)

    {
        String textLong = str1.length() > str2.length() ? str1 : str2;
        model.addAttribute( "textLong",textLong);
        return "bai1";
    }
    @GetMapping("bai2")
    public String bai2(@RequestParam(name = "str") String str,
                       Model model)
    {
        StringBuilder sbd = new StringBuilder(str);
        String newSbd = sbd.reverse().toString();
        model.addAttribute("text",newSbd);
        return "bai2";
    }

}


