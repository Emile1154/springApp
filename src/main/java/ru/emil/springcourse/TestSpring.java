package ru.emil.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        MusicPlayer musicPlayer =  context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName() + "   " + musicPlayer.getValue());
        context.close();
    }
}
