package mservice.repository;

import mservice.struct.ActivityPO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class ActivityStore {
    private final Logger logger = LoggerFactory.getLogger(ActivityStore.class);
    private final ActivityRepository activityRepository;

    public ActivityStore(ActivityRepository activityRepository) {
        this.activityRepository = activityRepository;
    }

    public ActivityPO findActivity(int activityId) {
        return activityRepository.findById(activityId)
                .orElseThrow(() -> {
                    logger.error("no activity：{}", activityId);
                    return new RuntimeException("没有该活动");
                });
    }

    public void save(ActivityPO activityPO){
        activityRepository.save(activityPO);
    }
}
