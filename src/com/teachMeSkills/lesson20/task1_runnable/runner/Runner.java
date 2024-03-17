package com.teachMeSkills.lesson20.task1_runnable.runner;

import com.teachMeSkills.lesson20.task1_runnable.thread.Breakfast;
import com.teachMeSkills.lesson20.task1_runnable.thread.Coffee;
import com.teachMeSkills.lesson20.task1_runnable.thread.News;

public class Runner {
    public static void main(String[] args) {

        Breakfast breakfast = new Breakfast("eating breakfast");
        Coffee coffee = new Coffee("drinking coffee");
        News news = new News("reading news");

        breakfast.thread.setPriority(3);
        coffee.thread.setPriority(4);
        news.thread.setPriority(1);
        breakfast.thread.start();
        coffee.thread.start();
        news.thread.start();
    }
}