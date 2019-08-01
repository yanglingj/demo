package mservice.model.data;

import mservice.repository.ActivityRepository;
import mservice.struct.ActivityPO;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
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
}
