package com.example.solid_example.ocp;

public class NonOCPNotifyManager {
    public void send(NonOCPSlackService service) {
        service.send("Hello, Slack!");
    }
    public void send(NonOCPDiscordService service) {
        service.send("Hello, Discord!");
    }
}
