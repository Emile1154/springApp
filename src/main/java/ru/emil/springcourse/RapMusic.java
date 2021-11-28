package ru.emil.springcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RapMusic implements Music{
    private static List<String> musicList;
    @Override
    public String getSong() {
        return musicList.get( (int) (Math.random()*3));
    }

    public void musicInit() throws InterruptedException{
        musicList = new ArrayList<String>();
        musicList.add("first soundtrack any rap music");
        musicList.add("second soundtrack any rap music");
        musicList.add("third soundtrack any rap music");
        System.out.println("Initialization complete!");
    }
    @Bean(initMethod="musicInit")
    public static RapMusic getRapMusic(){
        return new RapMusic();
    }

}
