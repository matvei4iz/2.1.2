import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld fHWBean = applicationContext.getBean("helloWorld", HelloWorld.class);
        HelloWorld sHWBean = applicationContext.getBean("helloWorld", HelloWorld.class);
        Cat fCBean = applicationContext.getBean("cat", Cat.class);
        Cat sCBean = applicationContext.getBean("cat", Cat.class);

        System.out.println(fHWBean == sHWBean);
        System.out.println(fCBean == sCBean);

    }
}