package mservice.service;

import mservice.model.data.Activity;
import mservice.model.data.Log;
import mservice.repository.ActivityStore;
import mservice.struct.ActivityPO;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@ActiveProfiles(value = "dev")
public class ActivityServiceTest {
    @Autowired
    private Log log;
    @Autowired
    private Activity activity;
    @Autowired
    private ActivityService activityService;
    @Autowired
    private ActivityStore activityStore;
    private final int activityId = 1;
    private final String userAccountId = "111";
    private final String helpAccountId = "222";

    @Before
    public void init(){
    }

    @Test
    public void promotionalActivity() {
        activityService.promotionalActivity(activityId,userAccountId);
    }

    @Test
    public void helpActivity() {
        activityService.helpActivity(activityId,helpAccountId,userAccountId);
    }
}