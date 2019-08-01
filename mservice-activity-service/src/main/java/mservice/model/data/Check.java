package mservice.model.data;

import mservice.common.ActivityTypeEnums;
import mservice.service.RadioCheckDataServiceImpl;
import org.springframework.stereotype.Component;

@Component
public class Check {
    private Activity activity;
    private Log log;

    public Check build(Activity activity, Log log) {
        this.activity = activity;
        this.log = log;
        return this;
    }

    public Check checkData() {
        //活动不同走不同的逻辑
        if (activity.getActivityType().equals(ActivityTypeEnums.RADIO)) {
            new RadioCheckDataServiceImpl()
                    .activityCheck()
                    .roleCheck();
        }
        return this;
    }


}
