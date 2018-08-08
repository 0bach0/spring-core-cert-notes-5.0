package vn.mystories.springcorecert.container_dependency_ioc.di_spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import vn.mystories.springcorecert.container_dependency_ioc.di_spring.sender.Email;
import vn.mystories.springcorecert.container_dependency_ioc.di_spring.sender.Notification;
import vn.mystories.springcorecert.container_dependency_ioc.di_spring.sender.Sms;

@Configuration
public class ApplicationConfig {

    @Bean
    public Notification message(){
        //TODO 3 change class implementation here
        //return new Sms();
        return new Email();
    }
}
