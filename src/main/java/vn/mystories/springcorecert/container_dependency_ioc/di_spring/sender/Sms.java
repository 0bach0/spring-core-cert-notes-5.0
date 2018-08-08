package vn.mystories.springcorecert.container_dependency_ioc.di_spring.sender;

public class Sms implements Notification {
    // Setting information for sms server
    private String number = "0912129121";
    private String ip = "127.0.0.1";

    public void noticeUser(){
        System.out.println("New message. Please check your new notification!");
    }

    public void noticeUser(String msg){
        System.out.println("New message. You received a notification with content: " + msg);
    }
}
