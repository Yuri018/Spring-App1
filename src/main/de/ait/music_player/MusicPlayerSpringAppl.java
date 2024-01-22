package main.de.ait.music_player;

import main.de.ait.music_player.controller.MusicPlayer;
import main.de.ait.music_player.service.Music;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MusicPlayerSpringAppl {

    public static void main(String[] args) {

        //надо связать бин с музыкой и бин плеер
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Music music = context.getBean("musicBean", Music.class);

        //поключаем плеер
        MusicPlayer player = new MusicPlayer(music);
        player.playMusic();

        MusicPlayer player2 = context.getBean("musicPlayer2", MusicPlayer.class);
        player2.playMusic();

        context.close();
    }


}
