package vn.mystories.springcorecert.container_dependency_ioc.di;

import vn.mystories.springcorecert.container_dependency_ioc.di.sender.Email;
import vn.mystories.springcorecert.container_dependency_ioc.di.sender.Sms;

public class DiApplication {

    public static void main(String[] args){
        //TODO 2 Change class implementation here
        //Sms message = new Sms();
        Email message = new Email();

        NoticeService noticeService = new NoticeService(message);
        noticeService.pushNotification("You receive a new friend request.");
    }
}
