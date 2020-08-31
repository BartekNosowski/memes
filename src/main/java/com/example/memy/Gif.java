package com.example.memy;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Data
public class Gif {

    private String name;

    // android-explosion
    public String getFilePath(){
        return "/gifs/"+name+".gif";
    }
    // na tą chwilę lista jest symulacją bazy danych
    public static List<Gif> GIFS = new ArrayList<>();
    // STATIC służy do inicjalizacji zmiennych statycznych
    // wykonywany jest na samym poczatku uruchomienia pliku
    static {
        GIFS.add(new Gif("android-explosion"));
        GIFS.add(new Gif("ben-and-mike"));
        GIFS.add(new Gif("book-dominos"));
        GIFS.add(new Gif("compiler-bot"));
        GIFS.add(new Gif("cowboy-coder"));
        GIFS.add(new Gif("infinite-andrew"));
    }


}
