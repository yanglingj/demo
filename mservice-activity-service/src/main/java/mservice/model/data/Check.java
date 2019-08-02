package mservice.model.data;

import mservice.common.ActivityTypeEnums;
import mservice.service.RadioCheckDataServiceImpl;
import org.springframework.stereotype.Component;

@Component
public class Check {
    private Activity activity;
    private Log log;
    private final RadioCheckDataServiceImpl radioCheckDataService;

    public Check(RadioCheckDataServiceImpl radioCheckDataService) {
        this.radioCheckDataService = radioCheckDataService;
    }

    public Check build(Activity activity, Log log) {
        this.activity = activity;
        this.log = log;
        return this;
    }

    public Check checkData(int activityId, String accountId) {
        //活动不同走不同的逻辑
        if (activity.getActivityType().equals(ActivityTypeEnums.RADIO)) {
            radioCheckDataService
                    .activityCheck(activityId)
                    .roleCheck(accountId);
        }
        return this;
    }


}
