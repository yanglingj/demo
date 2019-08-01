package mservice.service;

public interface CheckDataService {

    //活动校验
    public abstract CheckDataService activityCheck();

    //角色校验
    public abstract CheckDataService roleCheck();
}
