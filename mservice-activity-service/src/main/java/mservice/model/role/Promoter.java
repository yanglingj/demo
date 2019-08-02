package mservice.model.role;

import mservice.model.data.Activity;
import mservice.model.data.Log;
import mservice.struct.LogPO;
import org.springframework.stereotype.Component;

import javax.inject.Provider;

@Component
public class Promoter {
    private final Activity activity;
    private final Provider<Log> provider;

    public Promoter(Activity activity, Log log, Provider<Log> provider) {
        this.activity = activity;
        this.provider = provider;
    }

    public void promotionalActivity(int activityId, String userAccountId,String helpAccountId){
        LogPO logPO = new LogPO();
        logPO.setUserAccountId(userAccountId);
        logPO.setHelpAccountId(helpAccountId);
        logPO.setIsFinished((byte)0);
        logPO.setPicUrl("111");
        provider.get()
                .build(logPO)
                .createLog();
    }

}
