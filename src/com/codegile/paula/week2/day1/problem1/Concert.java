package com.codegile.paula.week2.day1.problem1;

public class Concert implements Song {

    public Concert() {

    }

    @Override
    public void howManyMinutes() {
        System.out.print(Song.minutes);
    }

    @Override
    public void whiIsPlaying() {
        for (int i = 0; i < Song.artists.size(); i++) {
            System.out.print(Song.artists.get(i));
        }
    }
}
