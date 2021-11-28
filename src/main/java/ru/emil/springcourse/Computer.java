package ru.emil.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Computer {
    private MusicPlayer musicPlayer;
    private static int id = 0;

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
        id++;
    }

    @Override
    public String toString() {
        return "Computer: " + id + " " + getStringOfList();
    }

    private String getStringOfList(){
        String str = "";
        for(Music music : musicPlayer.getMusicList()){
            str += music.getSong() + ", ";
        }
        str = str.substring(0, str.length()-2);
        str += ".";
        return str;
    }
}
