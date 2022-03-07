import com.gensparkpractice.pra.Models.Student;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		Student student = (Student)applicationContext.getBean("Student");
		student.call();
		//System.out.println(student.toString());
		//SpringApplication.run(DependencyInjectionApplication.class, args);
	}

}
