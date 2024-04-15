package com.fleet.poc.webclient.scheduler;

import com.fleet.poc.webclient.configuration.AppProperties;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SchedulerService
{
    @Scheduled(fixedDelayString = "${scheduler.service.fixedDelayInMillis}")
    public void execute()
    {
        log.debug("sccheduled method executed in thread={}",Thread.currentThread());
    }
}
