package com.fleet.poc.webclient.scheduler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SchedulerService
{
    @Scheduled(fixedDelayString = "5000")
    public void execute()
    {
        log.debug("sccheduled method executed in thread={}",Thread.currentThread());
    }
}
