package ru.emil.springcourse;

import org.springframework.context.annotation.*;
import java.util.Arrays;

@Configuration
@PropertySource(value="classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean(initMethod="musicInit")
    @Scope("prototype")
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }

    @Bean(initMethod="musicInit")
    @Scope("prototype")
    public RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean(initMethod="musicInit")
    @Scope("prototype")
    public RapMusic rapMusic(){
        return new RapMusic();
    }

    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(Arrays.asList(classicalMusic(),rockMusic(),rapMusic()));
    }

}
