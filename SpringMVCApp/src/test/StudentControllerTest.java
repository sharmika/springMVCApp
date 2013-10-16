package test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tech.rest.bo.StudentBO;
import com.tech.rest.model.Student;

@ContextConfiguration(locations = "classpath:spring-config.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class StudentControllerTest {

	@Autowired
	StudentBO studentBO;

	@org.junit.Test
	public void insertDetails() {
		// TODO Auto-generated method stub
		Student st = new Student();
		st.setFirstName("sharmika");
		st.setLastName("royal");
		st.setAddress("Kadiri");

		studentBO.insertDetails(st);
		System.out.println("success");

	}

}
