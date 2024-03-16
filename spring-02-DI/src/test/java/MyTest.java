import com.pzhu.pojo.Student;
import com.pzhu.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	@Test
	public void test01(){
 ApplicationContext context = new
		 ClassPathXmlApplicationContext("beans.xml");
 Student student = (Student) context.getBean("student");
 System.out.println(student.toString());
	}
	@Test
	public void test02(){
		ApplicationContext context = new
				ClassPathXmlApplicationContext("userbeans.xml");
		User user = context.getBean("user", User.class);
		System.out.println(user.toString());
	}
	@Test
	public void test03(){
		ApplicationContext context = new
				ClassPathXmlApplicationContext("userbeans.xml");
		User user = context.getBean("user2", User.class);
		System.out.println(user.toString());
	}
//	singleton和Prototype测试(默认为单例模式)
	@Test
	public void test04(){
		ApplicationContext context = new
				ClassPathXmlApplicationContext("userbeans.xml");
		User user = context.getBean("user2", User.class);
		User user2 = context.getBean("user2", User.class);
		System.out.println(user==user2);
	}
}
