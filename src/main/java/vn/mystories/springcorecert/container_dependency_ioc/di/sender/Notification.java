package vn.mystories.springcorecert.container_dependency_ioc.di.sender;

public interface Notification {
    public void noticeUser();

    public void noticeUser(String msg);
}
