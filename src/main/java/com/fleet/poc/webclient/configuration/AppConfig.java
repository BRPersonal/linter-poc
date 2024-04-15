package com.fleet.poc.webclient.configuration;

import com.fleet.poc.webclient.executor.AsyncTaskExecutorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;



import org.springframework.web.reactive.function.client.WebClient;

@Slf4j
@RequiredArgsConstructor
@EnableScheduling
@EnableAsync
@Configuration
public class AppConfig implements ApplicationListener<ContextRefreshedEvent>
{
    private final AppProperties props;
    private final AsyncTaskExecutorService asyncService;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event)
    {
        asyncService.execute();
    }

    @Bean
    public WebClient webClient()
    {
        log.debug("external service url={}", props.getExternalServiceBaseUrl());
        return WebClient.builder().baseUrl(props.getExternalServiceBaseUrl()).build();
    }
}
