package com.kpi.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ConfigController {

    @Value("${key: default key}")
    private String key;

    @GetMapping(value = "/key")
    public String getKey() {
        return key;
    }
}
