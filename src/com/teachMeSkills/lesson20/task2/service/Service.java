package com.teachMeSkills.lesson20.task2.service;

import com.teachMeSkills.lesson20.task2.constant.Quantity;

public class Service {
    int car = 0;

    public synchronized void addCar() {
        while (car >= Quantity.carsQuantity) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        car++;
        System.out.println("another car arrived. Cars in service: " + car);
        notify();
    }

    public synchronized void returnCar() {
        while (car < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        car--;
        System.out.println("The car is ready, everything is fixed. can be picked up. Cars in service: " + car);
        notify();
    }
}
