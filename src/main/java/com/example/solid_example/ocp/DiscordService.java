package com.example.solid_example.ocp;

public class DiscordService extends NotifyService {
    @Override
    public void sendNotification() {
        System.out.println("Discord notification sent");
    }
}
