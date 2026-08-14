package com.ashokit;


import com.ashokit.spring.beans.Student;
import com.ashokit.spring.beans.User;
import com.ashokit.spring.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;

public class App
{
    public static void main( String[] args )
    {
        //creating ApplicationContext container object
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        //Requesting Spring Bean
        User user = context.getBean(User.class);
        System.out.println(user);

        java.util.Date currentDate = context.getBean(Date.class);
        System.out.println(currentDate);

        Student student = context.getBean(Student.class);
        Student student1 = context.getBean(Student.class);
        Student student2 = context.getBean(Student.class);
        System.out.println(student);
        System.out.println(student.hashCode());
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());

    }
}
