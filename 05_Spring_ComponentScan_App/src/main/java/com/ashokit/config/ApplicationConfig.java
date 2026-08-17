package com.ashokit.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//Activating the componentscan feature in spring so that sterotype annonated class will recognize as spring beans
@ComponentScan(basePackages = "com.ashokit")
public class ApplicationConfig {
}
