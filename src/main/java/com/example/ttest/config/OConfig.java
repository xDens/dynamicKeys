package com.example.ttest.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.example.ttest.controller", "com.example.ttest.service"})
public class OConfig {
}
