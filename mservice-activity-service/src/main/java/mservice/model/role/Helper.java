package mservice.model.role;

import mservice.model.data.Activity;
import mservice.model.data.Log;
import mservice.struct.LogPO;
import org.springframework.stereotype.Component;

import javax.inject.Provider;

@Component
public class Helper {
    private final Activity activity;
    private final Provider<Log> provider;

    public Helper(Activity activity, Provider<Log> provider) {
        this.activity = activity;
        this.provider = provider;
    }

    public void helpActivity(int activityId, String helpAccountId,String promotionAccountId){
        LogPO logPO = new LogPO();
        logPO.setUserAccountId(promotionAccountId);
        logPO.setHelpAccountId(helpAccountId);
        logPO.setIsFinished((byte)0);
        logPO.setPicUrl("111");
        provider.get()
                .build(logPO)
                .createLog();
    }
}
