package ru.emil.springcourse;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music{
    private List<String> musicList;

    @Override
    public String getSong() {
        return musicList.get( (int) (Math.random()*3));
    }

    @PostConstruct
    public void musicInit() throws InterruptedException{
        musicList = new ArrayList<String>();
        musicList.add("first soundtrack any rock music");
        musicList.add("second soundtrack any rock music");
        musicList.add("third soundtrack any rock music");
        System.out.println("Initialization complete!");
    }
}
