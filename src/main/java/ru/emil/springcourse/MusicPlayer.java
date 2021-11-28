package ru.emil.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MusicPlayer {
    @Autowired
    private List<Music> musicList;

    public String playMusic(Type type){
        for(Music music : musicList){
            if(type == Type.ROCK & music instanceof RockMusic){
                return "Playing: " + music.getSong();
            }
            if(type == Type.CLASSICAL & music instanceof ClassicalMusic){
                return "Playing: " + music.getSong();
            }
            if(type == Type.RAP & music instanceof RapMusic){
                return "Playing: " + music.getSong();
            }
        }
        return "";
    }

    public List<Music> getMusicList() {
        return musicList;
    }
}
