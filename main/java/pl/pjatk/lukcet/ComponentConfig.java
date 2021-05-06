package pl.pjatk.lukcet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ComponentConfig {

    @Bean
    public MyFourthComponent myFourthComponent() {
        return new MyFourthComponent("hello from first bean");
    }

    @Bean
    public MyFourthComponent myFourthComponent2() {
        return new MyFourthComponent("hello from second bean");
    }
}
