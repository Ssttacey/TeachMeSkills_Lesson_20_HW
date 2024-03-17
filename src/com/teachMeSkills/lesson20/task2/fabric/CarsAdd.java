package com.teachMeSkills.lesson20.task2.fabric;

import com.teachMeSkills.lesson20.task2.constant.Quantity;
import com.teachMeSkills.lesson20.task2.service.Service;

public class CarsAdd implements Runnable {

    private Service service;

    public CarsAdd(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        brokenCar();
    }

    private void brokenCar() {
        for (int i = 0; i < Quantity.carsQuantity; i++) {
            service.addCar();
        }
    }
}
