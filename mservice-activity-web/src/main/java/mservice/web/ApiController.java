package mservice.web;

import mservice.common.model.vo.RestApiResultVO;
import mservice.repository.ActivityRepository;
import mservice.struct.ActivityPO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    private final ActivityRepository activityRepository;

    public ApiController(ActivityRepository activityRepository) {
        this.activityRepository = activityRepository;
    }

    @PostMapping("find-info")
    private RestApiResultVO<ActivityPO> findInfo() {
        return new RestApiResultVO<>(activityRepository.findById(1).orElse(null));
    }
}
