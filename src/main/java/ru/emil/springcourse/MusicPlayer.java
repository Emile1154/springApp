package ru.emil.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MusicPlayer {
    @Autowired
    private List<Music> musicList;

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.value}")
    private int value;

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

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}
