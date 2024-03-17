package com.teachMeSkills.lesson20.task1_runnable.thread;

import static java.lang.Thread.sleep;

public class Breakfast implements Runnable {
    public Thread thread;

    public Breakfast(String activity) {
        System.out.println("Thread: Morning " + activity);
        thread = new Thread(this);

    }

    @Override
    public void run() {
        eatingBreakfast();
    }

    private void eatingBreakfast() {
        System.out.println("Eating breakfast");
    }
}

