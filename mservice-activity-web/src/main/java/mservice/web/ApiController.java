package mservice.web;

import mservice.common.model.vo.RestApiResultVO;
import mservice.repository.ActivityRepository;
import mservice.service.ActivityService;
import mservice.struct.ActivityPO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    private final ActivityRepository activityRepository;
    private final ActivityService activityService;

    public ApiController(ActivityRepository activityRepository, ActivityService activityService) {
        this.activityRepository = activityRepository;
        this.activityService = activityService;
    }

    @PostMapping("find-info")
    private RestApiResultVO<ActivityPO> findInfo() {
        return new RestApiResultVO<>(activityRepository.findById(1).orElse(null));
    }

//    @PostMapping("promotional_activity")
//    private RestApiResultVO<ActivityPO> promotionalActivity(@RequestBody ){
//        return new RestApiResultVO<>(activityService.promotionalActivity();)
//    }
}
