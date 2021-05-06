package pl.pjatk.lukcet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DataConfig {

    @Bean
    public POJO POJO() {
        return new POJO("hello from first bean man");
    }

    @Bean
    public List<String> defaultData() {
        return List.of("5", "4", "3", "2", "1");
    }

    @Bean
    public List<String> otherData() {
        return List.of("1", "2", "3", "4", "5");
    }


}
