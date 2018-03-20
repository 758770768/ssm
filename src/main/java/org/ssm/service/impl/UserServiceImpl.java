package org.ssm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.ssm.dao.UserDao;
import org.ssm.pojo.User;
import org.ssm.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Resource
	private UserDao ud;

	@Override
	public void insertUser(User user) {
		ud.insertUser(user);
	}

}
