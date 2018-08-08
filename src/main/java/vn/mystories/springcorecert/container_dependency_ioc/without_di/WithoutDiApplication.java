package vn.mystories.springcorecert.container_dependency_ioc.without_di;

public class WithoutDiApplication {

    public static void main(String[] args){
        Notification notification = new Notification();
        notification.pushNotification("You receive a new friend request.");
    }
}
