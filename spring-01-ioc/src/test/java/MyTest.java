import com.pzhu.dao.UserDaoImpl;
import com.pzhu.dao.UserDaoMySqlImpl;
import com.pzhu.service.UserService;
import com.pzhu.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyTest {


	@Test
	public void test() {
		UserServiceImpl service = new UserServiceImpl();
		service.setUserDao(new UserDaoImpl());
		service.getUser();

		service.setUserDao(new UserDaoMySqlImpl());
		service.getUser();

	}

	@Test
	public void test2(){
 ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
 UserServiceImpl serviceImpl = (UserServiceImpl)context.getBean("ServiceImpl");
 serviceImpl.getUser();
	}


}
