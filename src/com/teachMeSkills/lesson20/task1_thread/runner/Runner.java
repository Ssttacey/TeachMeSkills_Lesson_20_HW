package com.teachMeSkills.lesson20.task1_thread.runner;

import com.teachMeSkills.lesson20.task1_thread.thread.Breakfast;
import com.teachMeSkills.lesson20.task1_thread.thread.Coffee;
import com.teachMeSkills.lesson20.task1_thread.thread.News;

public class Runner {
    public static void main(String[] args) {
        Breakfast breakfast = new Breakfast("eating breakfast");
        Coffee coffee = new Coffee("drinking coffee");
        News news = new News("reding news");

        breakfast.setPriority(1);
        coffee.setPriority(4);
        news.setPriority(3);
        breakfast.start();
        coffee.start();
        news.start();
    }
}
