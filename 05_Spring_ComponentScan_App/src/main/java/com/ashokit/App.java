package com.ashokit;

import com.ashokit.config.ApplicationConfig;

import com.ashokit.controller.UserController;
import com.ashokit.services.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {

        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        UserController userController = context.getBean(UserController.class);
        System.out.println("userController = " + userController);
        UserService userService = context.getBean(UserService.class);
        System.out.println("userService = " + userService);
    }
}
