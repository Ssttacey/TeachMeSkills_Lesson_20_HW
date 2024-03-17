package com.teachMeSkills.lesson20.task1_thread.thread;

public class Coffee extends Thread{

    private String threadName;

    public Coffee(String name) {
        System.out.println("Thread: Morning " + name);
        this.threadName = name;
    }

    @Override
    public void run() {
        drinkingCoffee();
    }

    private void drinkingCoffee() {
        System.out.println("Drinking coffee");
    }
}


