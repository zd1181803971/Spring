import com.dzu.service.UserService;
import com.dzu.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //动态代理的是接口！！ 注意点
        UserService userService = context.getBean("userService", UserService.class);

        userService.add();
    }

    @org.junit.Test
    public void diyTest2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.delete();
    }

    @org.junit.Test
    public void diyTest3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.delete();
    }
}
