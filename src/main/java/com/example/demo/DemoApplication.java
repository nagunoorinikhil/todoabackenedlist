package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class,args);
		
	}

}
//
//@SpringBootApplication
//public class DemoApplication extends SpringBootServletInitializer {
//
//    public static void main(String[] args) {
//
//        SpringApplication.run(SpringBootWebApplication.class, args);
//    }
//
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(SpringBootWebApplication.class);
//    }
//
//
//}
