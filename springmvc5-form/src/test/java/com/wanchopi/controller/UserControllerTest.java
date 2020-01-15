package com.wanchopi.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.servlet.ModelAndView;

import com.wanchopi.spring.config.SpringappBusinessConfig;
import com.wanchopi.spring.config.WebMvcConfig;
import com.wanchopi.spring.controller.StudentController;
import com.wanchopi.spring.model.Student;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {SpringappBusinessConfig.class, WebMvcConfig.class})
@WebAppConfiguration
public class UserControllerTest {
	
	@Autowired
	private StudentController controller;
	
	private Student user;
	
	@Before
	public void setUp() throws Exception {
		user = new Student();
		user.setUserName("Óscar");
	}
	
	@Test
	public void testUser() {
		ModelAndView mav = controller.user();
		assertNotNull(mav);
	}
	
	@Test
	public void testSaveUser() {
		ModelAndView mav = controller.saveForm(user);
		assertNotNull(mav);
		@SuppressWarnings("unchecked")
		Map<String, Object> mapModel = (Map<String, Object>) mav.getModel().get("model");
		String message = (String) mapModel.get("message");
		Student user = (Student) mapModel.get("user");
		assertEquals("Usuario registrado satisfactoriamente", message);
		assertEquals(this.user.getUserName(), user.getUserName());
	}

}
