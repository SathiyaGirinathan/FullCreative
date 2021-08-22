package com.company;

public class Mp4PLayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
    System.out.println("Playing mp4 file. Name: "+fileName);
    }
}
