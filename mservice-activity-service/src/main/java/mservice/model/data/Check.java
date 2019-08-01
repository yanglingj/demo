package mservice.model.data;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Check {
    private Activity activity;
    private Log log;

    public Check build(Activity activity, Log log) {
        this.activity = activity;
        this.log = log;
        return this;
    }
}
