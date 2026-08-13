package com.ashokit;

import com.ashokit.beans.User;
import com.ashokit.beans.Welcome;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.Date;

public class App 
{
    public static void main( String[] args )
    {
        //Activating the Spring Container which is implementation class for BeanFactory
        DefaultListableBeanFactory context = new DefaultListableBeanFactory();

        //Reading the configuration file
        XmlBeanDefinitionReader xdr = new XmlBeanDefinitionReader(context);
        xdr.loadBeanDefinitions("spring.xml");

        System.out.println("Spring Container Activated........");

        //Requesting spring bean by using id attribute value in configuration file
        //Welcome welcome = (Welcome)context.getBean("welcome");
        Welcome welcome = context.getBean(Welcome.class);
        welcome.display();

        System.out.println(" =====================================");

        //User user =(User)context.getBean("user");
        User user = context.getBean(User.class);
        user.displayUserInformation();

        System.out.println(" =====================================");

        Date currentDate = context.getBean(Date.class);
        System.out.println("currentDate = " + currentDate);

        System.out.println(" =====================================");
        DriverManagerDataSource dmd = context.getBean(org.springframework.jdbc.datasource.DriverManagerDataSource.class);
        System.out.println("dmd = " + dmd);

    }
}
