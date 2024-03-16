import com.pzhu.service.UserService;
import com.pzhu.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

 @Test
 public void test(){
  ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
  UserService userService = (UserService) context.getBean("userService");
  userService.delete();
  }



  }




