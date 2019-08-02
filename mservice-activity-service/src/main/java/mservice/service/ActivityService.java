package mservice.service;

import mservice.model.data.Activity;
import mservice.model.data.Check;
import mservice.model.data.Log;
import mservice.model.role.Promoter;
import org.springframework.stereotype.Service;

import javax.inject.Provider;


@Service
public class ActivityService {
    private final Check check;
    private final Provider<Activity> provider;
    private final Promoter promoter;
    private final Log log;

    public ActivityService(Check check, Provider<Activity> provider, Promoter promoter, Log log) {
        this.check = check;
        this.provider = provider;
        this.promoter = promoter;
        this.log = log;
    }

    public void promotionalActivity(int activityId, String accountId,String helpAccountId) {
        check.checkData(activityId,accountId);
        promoter.promotionalActivity(activityId,accountId,helpAccountId);
    }
}
