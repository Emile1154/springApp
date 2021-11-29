package ru.emil.springcourse;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;

public class MusicPlayer {
    private List<Music> musicList;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.value}")
    private int value;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String playMusic(){
        return musicList.get((int) (Math.random()*3)).getSong();
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}
