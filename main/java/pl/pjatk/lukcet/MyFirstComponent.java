package pl.pjatk.lukcet;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyFirstComponent {

    public MyFirstComponent(MySecondComponent MySecondComponent,
                            POJO POJO,
                            List<String> defaultData,
                            List<String> otherData, @Value("${my.custom.property}") String valueFromProperties,
                            @Value("${my.custom.random:value}") String valueFromProperties1)
    //cw trzecie po dwukropku @Value("${my.custom.random:some default value}"
    {
        System.out.println("Hello from MyFirstComponent");
        // MySecondComponent.helloFromMethod();
        POJO.soutString();
        System.out.println(defaultData);
        System.out.println(otherData);
        System.out.println(valueFromProperties);
        System.out.println(valueFromProperties1);
    }

    public void helloFromMethod() {
        System.out.println("Hello there");
    }

}
