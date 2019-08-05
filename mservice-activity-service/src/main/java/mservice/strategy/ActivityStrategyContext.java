package mservice.strategy;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.inject.Provider;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ActivityStrategyContext {
    private Provider<ActivityStrategy> activityStrategyProvider;
    private ActivityStrategy activityStrategy;

    public ActivityStrategyContext build(String activityId){
        activityStrategy =  activityStrategyProvider.get().build();
        return this;
    }

    public boolean check(){
        activityStrategy.check();
        return true;
    }
}
