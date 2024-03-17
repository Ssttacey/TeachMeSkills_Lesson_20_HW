package com.teachMeSkills.lesson20.task2.fabric;

import com.teachMeSkills.lesson20.task2.constant.Quantity;
import com.teachMeSkills.lesson20.task2.service.Service;

public class DriveAwayCar implements Runnable{
    private Service service;

    public DriveAwayCar(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        finishedСar();
    }

    private void finishedСar() {
        for(int i = 0; i < Quantity.carsQuantity; i++){
            service.returnCar();
        }
    }
}
