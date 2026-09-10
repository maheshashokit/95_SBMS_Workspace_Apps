package com.ashokit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import java.util.Arrays;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private Environment environment;

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		StringUtil bean = context.getBean(StringUtil.class);
		System.out.println(bean);
		DateUtil bean1 = context.getBean(DateUtil.class);
	}

	@Override
	public void run(String... args) throws Exception {

		String[] activeProfiles = environment.getActiveProfiles();
		System.out.println("Active Profiles:::" + Arrays.asList(activeProfiles));
		System.out.println("Database Username:::" + environment.getProperty("database.username"));
		System.out.println("Database Password:::" + environment.getProperty("database.password"));
		System.out.println("Application Email:::" + environment.getProperty("application.emails"));
	}
}
