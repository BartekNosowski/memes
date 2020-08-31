package com.example.memy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller

public class HomeController {
    // ModelMap służy do przekazywania zmiennej do html
    @GetMapping("/")
    public String getHome(ModelMap map){
        map.put("gifs",Gif.GIFS);
        return "home";
    }
    /* PathVariable zamienia automatycznie ze ścieżki, która się zmienia na zmienną
       javovą o nazwie name
       /gif/mike
       String name = "mike";
     */
    // name - któe jest zmienny
    @GetMapping("/gif/{name}")
    public String getGif(@PathVariable String name, ModelMap map){

        map.put("gif",Gif.GIFS.stream().filter(g->g.getName().equals(name)).findFirst().get());
//        List<Gif> list = Gif.GIFS;
//        for (Gif gif : list){
//            if (gif.getName().equals(name))
//                map.put("gif",gif);
//            }

        return "gif-details";
    }



}
