package mservice.model.data;

import mservice.common.ActivityTypeEnums;
import mservice.repository.ActivityRepository;
import mservice.struct.ActivityPO;
import org.springframework.stereotype.Component;

@Component
public class Activity {
    private ActivityPO activityPO;
    private final ActivityRepository activityRepository;

    public Activity(ActivityRepository activityRepository) {
        this.activityRepository = activityRepository;
    }

    public Activity build(ActivityPO activityPO){
        this.activityPO = activityPO;
        return this;
    }

    public ActivityTypeEnums getActivityType(){
        return ActivityTypeEnums.getByType(this.activityPO.getType());
    }
}
