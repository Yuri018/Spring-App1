package main.de.ait.music_player.controller;

import main.de.ait.music_player.service.Music;

public class MusicPlayer {
    private Music music;// DI - step 1
    private int volume;

    public MusicPlayer(Music music) { // DI step 2
        this.music = music;
    }

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void playMusic(){
        System.out.println("Playing" + music.getSong());
    }
}
