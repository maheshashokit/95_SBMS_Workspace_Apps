package com.ashokit.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

//@Configuration Annotated Class -> spring.xml
@Configuration

//importing the beans configuration from several configuration classes
@Import(value={UserConfig.class,StudentConfig.class})

//importing the beans configuration from xml file to JavaBasedConfiguration class
@ImportResource(value="spring.xml")
public class AppConfig {
}
