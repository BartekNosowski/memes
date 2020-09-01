package com.example.memy;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Data
public class Gif {

    private String name;
    private boolean favorite;
    private Category category;

    // android-explosion
    public String getFilePath(){
        return "/gifs/"+name+".gif";
    }
    // na tą chwilę lista jest symulacją bazy danych
    public static List<Gif> GIFS = new ArrayList<>();
    // STATIC służy do inicjalizacji zmiennych statycznych
    // wykonywany jest na samym poczatku uruchomienia pliku
    static {
        GIFS.add(new Gif("android-explosion",false,Category.categoryList.get(0)));
        GIFS.add(new Gif("ben-and-mike",true,Category.categoryList.get(1)));
        GIFS.add(new Gif("book-dominos",true,Category.categoryList.get(1)));
        GIFS.add(new Gif("compiler-bot",false,Category.categoryList.get(0)));
        GIFS.add(new Gif("cowboy-coder",false,Category.categoryList.get(2)));
        GIFS.add(new Gif("infinite-andrew",true,Category.categoryList.get(2)));
    }


}
