package ru.emil.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MusicPlayer {
    @Autowired
    private List<Music> musicList;

    public String playMusic(){
        for(Music music : musicList){
           return "Playing: " + music.getSong();
        }
        return "";
    }

    public List<Music> getMusicList() {
        return musicList;
    }
}
