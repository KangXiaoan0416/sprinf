package test.config;

import org.springframework.context.annotation.Bean;

public class CustomerConfig {
    @Bean(name="customer")
    public CustomerBo customerBo(){

        return new CustomerBo();

    }
}
