package com.example.memy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class HomeController {
    // ModelMap służy do przekazywania zmiennej do html
    @GetMapping("/")
    public String getHome(ModelMap map){
        map.put("gifs",Gif.GIFS);
        return "home";
    }



}
