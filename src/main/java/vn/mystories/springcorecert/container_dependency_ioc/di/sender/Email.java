package vn.mystories.springcorecert.container_dependency_ioc.di.sender;

public class Email implements Notification {

    // Setting information for email server
    private String domain = "mystories.main.java.vn";
    private String sender = "bach";

    public void noticeUser(){
        System.out.println("New email. Please check your new notification!");
    }

    public void noticeUser(String msg){
        System.out.println("New email. You received a notification with content: " + msg);
    }
}
