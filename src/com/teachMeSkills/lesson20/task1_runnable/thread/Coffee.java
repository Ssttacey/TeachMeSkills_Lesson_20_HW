package com.teachMeSkills.lesson20.task1_runnable.thread;

public class Coffee implements Runnable {

    public Thread thread;

    public Coffee(String activity) {
        System.out.println("Thread: Morning " + activity);
        thread = new Thread(this);
    }

    @Override
    public void run() {
        drinkCoffee();
    }

    private void drinkCoffee() {
        System.out.println("Drinking coffee");
    }
}

