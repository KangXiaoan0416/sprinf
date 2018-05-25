package test.config;

import org.springframework.context.annotation.Bean;

public class SchedulerConfig {
    @Bean(name="scheduler")
    public SchedulerBo suchedulerBo(){

        return new SchedulerBo();

    }
}
