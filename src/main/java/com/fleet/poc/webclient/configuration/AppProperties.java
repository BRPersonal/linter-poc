package com.fleet.poc.webclient.configuration;

import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Data
@Component
public class AppProperties
{
    @Value("${externalservice.base.url}")
    private String externalServiceBaseUrl;

    @Value("${scheduler.service.fixedDelayInMillis}")
    private long schedulerDelayInMillis;
}
