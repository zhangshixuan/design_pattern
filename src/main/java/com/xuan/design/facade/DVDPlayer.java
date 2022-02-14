package com.xuan.design.facade;

public class DVDPlayer {

    private DVDPlayer(){

    }


    //饿汉式
//    private final static DVDPlayer instance = new DVDPlayer();
//
//    public static DVDPlayer getInstance(){
//        return instance;
//    }


    //懒汉式
    private static volatile DVDPlayer instance;

    public static DVDPlayer getInstance(){
        if (instance == null) {
            synchronized (DVDPlayer.class) {
                if (instance == null) {
                    instance = new DVDPlayer();
                }
            }
        }
        return instance;
    }

    public void on(){
        System.out.println("dvd on");
    }

    public void off(){
        System.out.println("dvd off");
    }

    public void play(){
        System.out.println("dvd is playing");
    }

    public void pause(){
        System.out.println("dvd is paused");
    }
}
