package ru.emil.springcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private static List<String> musicList;
    @Override
    public String getSong() {
        return musicList.get((int) (Math.random()*3));
    }

    @Bean(initMethod="musicInit")
    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    public void musicInit() throws InterruptedException{
        musicList = new ArrayList<String>();
        musicList.add("first soundtrack any classical music");
        musicList.add("second soundtrack any classical music");
        musicList.add("third soundtrack any classical music");
        System.out.println("Initialization complete!");
    }

    public void musicDestroy() throws InterruptedException{
        System.out.println("Destroying done!");
    }
    private ClassicalMusic() {}
}
