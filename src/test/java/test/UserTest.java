package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cn.chl.bean.User;
import com.cn.chl.dao.UserDao;
import com.cn.chl.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext.xml")
public class UserTest {
	@Autowired
	private UserDao userDao;

	@Autowired
	private UserService userService;

	@Test
	public void getUser() {
		User user = userDao.getUser("admin");
		System.out.println(user.getName());

		User user2 = userService.getUser("admin");
		System.out.println(user2.getLoginId());
	}
}
