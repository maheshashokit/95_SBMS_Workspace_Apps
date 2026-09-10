package com.ashokit;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DateUtil {

    public DateUtil(){
        System.out.println("DateUtil Class Constructor......");
    }
}


