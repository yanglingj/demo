package mservice.model.data;

import mservice.common.ActivityTypeEnums;
import mservice.repository.ActivityStore;
import mservice.struct.ActivityPO;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Activity {
    private ActivityPO activityPO;
    private final ActivityStore activityStore;

    public Activity(ActivityStore activityStore) {
        this.activityStore = activityStore;
    }


    public Activity build(ActivityPO activityPO) {
        this.activityPO = activityPO;
        return this;
    }

    ActivityTypeEnums getActivityType() {
        return ActivityTypeEnums.getByType(this.activityPO.getType());
    }

    public void createActivity() {
        activityStore.save(activityPO);
    }

    public ActivityPO findActivity(int activityId) {
        return activityStore.findActivity(activityId);
    }
}
