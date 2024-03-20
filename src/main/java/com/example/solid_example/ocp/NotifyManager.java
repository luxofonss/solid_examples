package com.example.solid_example.ocp;

public class NotifyManager {
    public void sendNotification(NotifyService notifyService) {
        notifyService.sendNotification();
    }
}
