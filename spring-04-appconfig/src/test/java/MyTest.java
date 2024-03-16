import com.pzhu.config.MyConfig;
import com.pzhu.pojo.User;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MyTest {
@Test
	public  void test01(){
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
	User user = context.getBean("user2", User.class);
	System.out.println(user.getName());
}

}
