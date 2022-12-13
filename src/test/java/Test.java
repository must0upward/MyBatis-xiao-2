import com.xpj.mapper.userMapper;
import com.xpj.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {

    @org.junit.Test
    public void  test1(){
        ApplicationContext context=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        userMapper mapper = context.getBean(userMapper.class);

        List<User> userList = mapper.findAllUser();

        for (User user : userList) {
            System.out.println(user);
        }
    }
}
