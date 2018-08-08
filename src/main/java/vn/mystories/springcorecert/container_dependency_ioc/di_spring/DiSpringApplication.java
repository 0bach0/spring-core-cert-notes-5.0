package vn.mystories.springcorecert.container_dependency_ioc.di_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import vn.mystories.springcorecert.container_dependency_ioc.di_spring.sender.Notification;

public class DiSpringApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ApplicationConfig.class);
        Notification notification = context.getBean(Notification.class);
        notification.noticeUser("this is message");
    }
}
