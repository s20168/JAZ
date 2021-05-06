package pl.pjatk.lukcet;

import org.springframework.stereotype.Component;

@Component
public class MySecondComponent {

    public MySecondComponent() {
        System.out.println("Hello from MySecondComponent");
    }

    public void helloFromMethod() {
        System.out.println("Hello there");
    }


}

