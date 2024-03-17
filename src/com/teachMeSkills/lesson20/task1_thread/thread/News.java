package com.teachMeSkills.lesson20.task1_thread.thread;

public class News extends Thread {
    Thread thread;

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

