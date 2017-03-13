package cn.itcast.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.ssm.mapper.UserMapper;
import cn.itcast.ssm.po.User;

public class UserTest {
	//声明spring容器属性
	private ApplicationContext applicationContext;
	
	@Before
	public void setUp() throws Exception{
		//测试前，加载spring配置文件，并将bean对象全部存放在spring容器
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
	}
	
	@Test
	public void loginTest() throws Exception{
		UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
		//设置输入参数
		User userInput = new User();
		userInput.setUsername("Wang");
		userInput.setPassword("1234");
		System.out.println(userInput.toString());
		
		User user = userMapper.login(userInput);
		
		System.out.println(user.toString());
		
	}

}
