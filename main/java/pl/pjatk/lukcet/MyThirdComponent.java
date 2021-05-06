package pl.pjatk.lukcet;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;


@Component
public class MyThirdComponent {
    public MyThirdComponent(ApplicationContext applicationContext) {
        System.out.println("Hello from MyThirdComponent");
        MyFirstComponent myFirstComponent = applicationContext.getBean("myFirstComponent", MyFirstComponent.class);
        MySecondComponent mySecondComponent = applicationContext.getBean("mySecondComponent", MySecondComponent.class);
        myFirstComponent.helloFromMethod();
        mySecondComponent.helloFromMethod();

        MyFourthComponent myFourthComponent = applicationContext.getBean("myFourthComponent", MyFourthComponent.class);
        System.out.println(myFourthComponent.getName());

        MyFourthComponent myFourthComponent2 = applicationContext.getBean("myFourthComponent2", MyFourthComponent.class);
        System.out.println(myFourthComponent2.getName());
    }
}

/* WERSJA SPRINGOWA bez application context
@Component
public class MyThirdComponent {
    public MyThirdComponent(MyFirstComponent myFirstComponent, MySecondComponent mySecondComponent, MyFourthComponent myFourthComponent) {
        System.out.println("Hello from MyThirdComponent");
        myFirstComponent.helloFromMethod();
        mySecondComponent.helloFromMethod();
        System.out.println(myFourthComponent.getName());
    }
}*/
