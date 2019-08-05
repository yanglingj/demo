package mservice.model.data;

import mservice.common.ActivityTypeEnums;
import mservice.service.RadioCheckDataServiceImpl;
import org.springframework.stereotype.Component;

import javax.inject.Provider;

@Component
public class Check {
    private final Provider<Activity> providerActivity;
    private Log log;
    private final RadioCheckDataServiceImpl radioCheckDataService;

    public Check(Provider<Activity> providerActivity, RadioCheckDataServiceImpl radioCheckDataService) {
        this.providerActivity = providerActivity;
        this.radioCheckDataService = radioCheckDataService;
    }


    //助力是否完成也在这个逻辑里判断
    //校验失败直接跑出异常
    public Check checkData(int activityId, String accountId) {
        //活动不同走不同的逻辑
        if (providerActivity.get().findActivity(activityId).equals(ActivityTypeEnums.RADIO)) {
            radioCheckDataService
                    .activityCheck(activityId)
                    .roleCheck(accountId);
        }

        return this;


    }


}
