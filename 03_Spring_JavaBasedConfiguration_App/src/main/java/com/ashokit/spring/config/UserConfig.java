package com.ashokit.spring.config;

import com.ashokit.spring.beans.Address;
import com.ashokit.spring.beans.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    public User getUserBean(){
        User user = new User();
        user.setUsername("Mahesh");
        user.setPassword("Mahesh@123");
        user.setAddress(getAddressBean());
        return user;
    }

    @Bean
    public Address getAddressBean(){
        Address address = new Address();
        address.setDoorNo("1-2-3");
        address.setStreetName("XYZ");
        address.setCity("Hyderabad");
        return address;
    }
}
