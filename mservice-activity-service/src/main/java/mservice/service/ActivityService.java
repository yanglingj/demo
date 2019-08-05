package mservice.service;

import mservice.model.data.Activity;
import mservice.model.data.Check;
import mservice.model.data.Log;
import mservice.model.role.Helper;
import mservice.model.role.Promoter;
import org.springframework.stereotype.Service;

import javax.inject.Provider;


@Service
public class ActivityService {
    private final Check check;
    private final Provider<Activity> provider;
    private final Promoter promoter;
    private final Log log;
    private final Helper helper;

    public ActivityService(Check check, Provider<Activity> provider, Promoter promoter, Log log, Helper helper) {
        this.check = check;
        this.provider = provider;
        this.promoter = promoter;
        this.log = log;
        this.helper = helper;
    }

    /**
     * 发起助力
     *
     * @param activityId 活动id
     * @param accountId  发起者id
     */
    public void promotionalActivity(int activityId, String accountId) {
        check.checkData(activityId, accountId);
        promoter.promotionalActivity(activityId, accountId);
    }

    /**
     * 用户进行助力
     * @param activityId  活动id
     * @param helpAccountId  助力者id
     * @param accountId   发起者id
     */
    public void helpActivity(int activityId, String helpAccountId, String accountId) {
        check.checkData(activityId, accountId);
        helper.helpActivity(activityId, helpAccountId, accountId);
    }

}
