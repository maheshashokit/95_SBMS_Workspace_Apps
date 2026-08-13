package com.ashokit;

import com.ashokit.beans.Student;
import com.ashokit.beans.User;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class App 
{
    public static void main( String[] args )
    {
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();

        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
        xmlBeanDefinitionReader.loadBeanDefinitions("spring.xml");

        User user = defaultListableBeanFactory.getBean(User.class);
        System.out.println(user);

        Student student=defaultListableBeanFactory.getBean(Student.class);
        System.out.println(student);
    }
}
