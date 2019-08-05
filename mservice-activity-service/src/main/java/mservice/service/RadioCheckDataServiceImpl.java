package mservice.service;

import mservice.model.data.Activity;
import org.springframework.stereotype.Service;

@Service
public class RadioCheckDataServiceImpl implements CheckDataService{
    private final Activity activity;

    public RadioCheckDataServiceImpl(Activity activity) {
        this.activity = activity;
    }

    @Override
    public CheckDataService activityCheck(int activityId) {
        return this;
    }

    @Override
    public CheckDataService roleCheck(String accountId) {

        return this;
    }
}
