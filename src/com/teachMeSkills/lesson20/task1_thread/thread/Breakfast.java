package com.teachMeSkills.lesson20.task1_thread.thread;

public class Breakfast extends Thread{


    private String threadName;

    public Breakfast(String name) {
        System.out.println("Thread: Morning " + name);
        this.threadName = name;
    }

    @Override
    public void run() {
        eatingBreakfast();
    }

    private void eatingBreakfast() {
        System.out.println("Eating breakfast");
    }
}