package vn.mystories.springcorecert.container_dependency_ioc.without_di;

import vn.mystories.springcorecert.container_dependency_ioc.without_di.sender.Email;
import vn.mystories.springcorecert.container_dependency_ioc.without_di.sender.Sms;

public class Notification {
    private Email email;
    //private Sms sms;

    public Notification(){
        //TODO 1 Change class here
        email = new Email();
        //sms = new Sms();
    }

    public void pushNotification(String noti){
        email.noticeUser(noti);
    }
}