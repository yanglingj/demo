package mservice.model.role;

import mservice.model.data.Activity;
import mservice.model.data.Log;
import org.springframework.stereotype.Component;

@Component
public class Promoter {
    private final Activity activity;
    private final Log log;

    public Promoter(Activity activity, Log log) {
        this.activity = activity;
        this.log = log;
    }

    public void promotionalActivity(){

    }

}
