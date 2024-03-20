package com.example.solid_example.ocp;

public class SlackService extends NotifyService{
    @Override
    public void sendNotification() {
        System.out.println("Slack notification sent");
    }
}
