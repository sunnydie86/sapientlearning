package springassgn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo {

	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("spring.xml");

		EmployeeRepository er = (EmployeeRepository) app.getBean("employeeRepo");
		er.read();
		er.read();
		er.displayById(1);
		er.close();
	}

}
