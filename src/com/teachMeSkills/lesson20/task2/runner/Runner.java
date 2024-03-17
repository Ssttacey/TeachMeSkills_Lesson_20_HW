package com.teachMeSkills.lesson20.task2.runner;

import com.teachMeSkills.lesson20.task2.fabric.CarsAdd;
import com.teachMeSkills.lesson20.task2.fabric.DriveAwayCar;
import com.teachMeSkills.lesson20.task2.service.Service;

public class Runner {
    public static void main(String[] args) {

        Service service = new Service();
        CarsAdd arrivedCar = new CarsAdd(service);
        DriveAwayCar finishedCar = new DriveAwayCar(service);

        Thread t1 = new Thread(arrivedCar);
        Thread t2 = new Thread(finishedCar);

        t1.start();
        t2.start();
    }
}
