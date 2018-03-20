package org.ssm.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.ssm.pojo.User;
import org.ssm.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:org/ssm/cnf/core.xml")
public class TestDemo {

	@Resource
	private UserService us;

	@Test
	@Rollback(value = false)
	public void fn1() {
		User user = new User();
		user.setUname("hello");
		us.insertUser(user);
		System.out.println(user.getUid());
	}

}
