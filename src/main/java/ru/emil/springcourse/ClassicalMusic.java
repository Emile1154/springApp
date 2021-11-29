package ru.emil.springcourse;

import java.util.ArrayList;
import java.util.List;

public class ClassicalMusic implements Music {
    private List<String> musicList;
    @Override
    public String getSong() {
        return musicList.get((int) (Math.random()*3));
    }

    public void musicInit(){
        musicList = new ArrayList<String>();
        musicList.add("first soundtrack any classical music");
        musicList.add("second soundtrack any classical music");
        musicList.add("third soundtrack any classical music");
        //System.out.println("Initialization complete!");
    }
}
