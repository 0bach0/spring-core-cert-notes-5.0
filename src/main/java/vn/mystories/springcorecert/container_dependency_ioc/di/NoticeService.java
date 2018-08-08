package vn.mystories.springcorecert.container_dependency_ioc.di;

import vn.mystories.springcorecert.container_dependency_ioc.di.sender.Notification;

public class NoticeService {
    private Notification notification;

    public NoticeService(Notification notification){
        this.notification = notification;
    }

    public void pushNotification(String noti){
        notification.noticeUser(noti);
    }
}