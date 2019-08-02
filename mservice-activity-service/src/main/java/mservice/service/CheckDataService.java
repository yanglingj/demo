package mservice.service;

public interface CheckDataService {

    //活动校验
    CheckDataService activityCheck(int activityId);

    //角色校验
    CheckDataService roleCheck(String accountId);
}
