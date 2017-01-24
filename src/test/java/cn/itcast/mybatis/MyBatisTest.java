package cn.itcast.mybatis;

import cn.itcast.mybatis.domain.User;
import cn.itcast.mybatis.service.IUserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


public class MyBatisTest {

	@Test
	public void test1(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		IUserService userService = (IUserService) ctx.getBean("userService");
		User u = userService.findUserById("0001");
		System.out.println(u);
	}
	
	@Test
	public void test2(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		IUserService userService = (IUserService) ctx.getBean("userService");
		List<User> users = userService.findAllUser();
		
		for(User u: users){
			System.out.println(u);
		}
	}
	
	@Test
	public void test3(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		IUserService userService = (IUserService) ctx.getBean("userService");
		User user = new User();
		user.setId("0002");
		user.setUserName("lisi");
		user.setAddress("beijing");
		List<User> users = userService.findUserByCondition(user);
		
		for(User u: users){
			System.out.println(u);
		}
	}
	
	@Test
	public void test4(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		IUserService userService = (IUserService) ctx.getBean("userService");
		int i = userService.deleteUserById("0002");
		System.out.println(i);
	}
	
	@Test
	public void test5(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		IUserService userService = (IUserService) ctx.getBean("userService");
		User user = new User();
		user.setId("0003");
		user.setUserName("wangwu");
		user.setAddress("shanghai");
		int i = userService.saveUser(user);
		System.out.println(i);
	}
	
	@Test
	public void test6(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		IUserService userService = (IUserService) ctx.getBean("userService");
		User user = new User();
		user.setId("0003");
		user.setUserName("zhangsan");
		//user.setAddress("nanjing");
		int i = userService.updateUserById(user);
		System.out.println(i);
	}
	
	@Test
	public void test7(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		IUserService userService = (IUserService) ctx.getBean("userService");
		User user = new User();
		user.setId("0004");
		//user.setUserName("jack");
		//user.setAddress("beijing");
		int i = userService.updateUser(user);
		System.out.println(i);
	}
	
	@Test
	public void test8(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		IUserService userService = (IUserService) ctx.getBean("userService");
		int i = userService.deleteUserById("0003");
		System.out.println(i);
	}
}
