package com.example.solid_example;

import com.example.solid_example.liskov.*;
import com.example.solid_example.ocp.NotifyManager;
import com.example.solid_example.ocp.SlackService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SolidExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SolidExampleApplication.class, args);

//        2. Open-closed principle
//        NotifyManager notifyManager = new NotifyManager();
//        SlackService slackService = new SlackService();
//
//        notifyManager.sendNotification(slackService);

//        3. Liskov substitution principle

        NonLiskovRectangle nonLiskovRectangle = RectangleFactory.generate();
        nonLiskovRectangle.setHeight(10);
        nonLiskovRectangle.setWidth(5);
        System.out.println("Area 1: " + nonLiskovRectangle.getArea());

        Shape s = ShapeFactory.generate();
        s.setWidth(4);
        s.setHeight(12);
        System.out.println("Area 2: " + s.getArea());

    }
}
