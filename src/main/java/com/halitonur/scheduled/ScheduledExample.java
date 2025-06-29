package com.halitonur.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledExample {

    @Scheduled(cron = "0 45 14 * * *")
    public void write1to10() {
        for(int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }
}
