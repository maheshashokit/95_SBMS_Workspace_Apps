package com.ashokit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ashokit.beans.User;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        //Request Spring bean from container
        User user = context.getBean(User.class);
        System.out.println(user);

        System.out.println( "Hello World!" );
    }
}