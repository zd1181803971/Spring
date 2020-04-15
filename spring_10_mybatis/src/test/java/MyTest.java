import com.dzu.mapper.UserMapper;
import com.dzu.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


public class MyTest {

    @Test
    public void test()  {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserMapper userMapper = context.getBean("userMapperImpl2", UserMapper.class);

        List<User> users = userMapper.selectUser();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
