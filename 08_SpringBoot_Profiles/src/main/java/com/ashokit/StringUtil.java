package com.ashokit;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("qa")
public class StringUtil {

    public StringUtil(){
        System.out.println("StringUtil Class Constructor......");
    }
}
