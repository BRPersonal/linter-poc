package com.fleet.poc.webclient.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@RequiredArgsConstructor
@RestController
public class DemoController
{
    private final WebClient client;

    @GetMapping("/coffee/{type}")
    public ResponseEntity<String> getResponse(@PathVariable("type") String type)
    {
        String response = client.get().uri("/" + type).retrieve().bodyToMono(String.class).block();
        log.debug("input={}, response.length={} in thread={}", type,response.length(), Thread.currentThread());
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}
