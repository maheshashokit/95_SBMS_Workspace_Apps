package com.ashokit;

import com.ashokit.controller.CustomerController;
import com.ashokit.dao.BankDao;
import com.ashokit.dao.BikeDao;
import com.ashokit.entity.Bank;
import com.ashokit.entity.Bike;
import com.ashokit.entity.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		//Customer customer = new Customer(123,"Hyderabad","Mahesh","mahesh.ashokit@gmail.com");
		//Preparing customer information
		//Customer customer1= new Customer(123456,"Hyderabad1","Suresh","suresh@gmail.com");
		//Customer customer2 = new Customer(23445,"Hyderabad1","Rajesh","rajesh@gmail.com");
		//Customer customer3 = new Customer(55666,"Hyderabad1","Ramesh","ramesh@gmail.com");
		//Customer customer4 = new Customer(77888,"Hyderabad1","MaheshKumar","maheshkumar@gmail.com");
		//Customer customer5 = new Customer(99876,"Hyderabad1","Umesh","umesh@gmail.com");

		Customer customer  = new Customer("Mahesh","Chennai","mahesh@gmail.com");

		CustomerController controller = context.getBean(CustomerController.class);
		BikeDao bikeDao = context.getBean(BikeDao.class);
		BankDao bankDao = context.getBean(BankDao.class);

		controller.createNewCustomer(customer);

		Bike b1 = new Bike();
		b1.setBikeName("Access");
		b1.setCost(100000);
		Bike b2 = new Bike();
		b2.setBikeName("Activa");
		b2.setCost(200000);
		Iterable<Bike> savedBikes = bikeDao.saveAll(Arrays.asList(b1,b2));
		savedBikes.forEach(System.out::println);

		Bank bank1 = new Bank();
		bank1.setBankName("HDFC");
		bank1.setLocation("Hyderabad");
		Bank bank2 = new Bank();
		bank2.setBankName("ICICI");
		bank2.setLocation("Hyderabad");
		Bank bank3 = new Bank();
		bank3.setBankName("SBI");
		bank3.setLocation("Hyderabad");
		Iterable<Bank> savedBanks = bankDao.saveAll(Arrays.asList(bank1,bank2,bank3));
		savedBanks.forEach(System.out::println);

	}

}
