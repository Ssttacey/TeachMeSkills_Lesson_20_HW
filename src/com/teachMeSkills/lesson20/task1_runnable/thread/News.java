package com.teachMeSkills.lesson20.task1_runnable.thread;

public class News implements Runnable {

    public Thread thread;

    public News(String activity) {
        System.out.println("Thread: Morning " + activity);
        thread = new Thread(this);
    }

    @Override
    public void run() {
        readingNews();
    }

    private void readingNews() {
        System.out.println("Reading news");
    }
}
