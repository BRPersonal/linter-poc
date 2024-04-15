package com.fleet.poc.webclient.executor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class AsyncTaskExecutorService
{
    @Async
    public void execute()
    {
        log.info("Async task method has been executed in thread={}", Thread.currentThread());
    }
}
