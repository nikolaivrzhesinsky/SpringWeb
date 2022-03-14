package com.objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {

    private Music music1;
    private Music music2;

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    @Autowired
    public MusicPlayer(@Qualifier("classicMusic") Music music1,@Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic(MusicGenre genre){
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        if(genre==MusicGenre.CLASSIC){
            return music1.getSong().get(randomNumber);
        }
        else{
            return music2.getSong().get(randomNumber);
        }
    }

}
