package mservice.model.data;

import mservice.repository.LogRepository;
import mservice.struct.LogPO;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Log {
    private LogPO logPO;
    private final LogRepository logRepository;

    public Log(LogRepository logRepository) {
        this.logRepository = logRepository;
    }

    public Log build(LogPO logPO){
        this.logPO = logPO;
        return this;
    }

    public void createLog(){
        logRepository.save(logPO);
    }
}
