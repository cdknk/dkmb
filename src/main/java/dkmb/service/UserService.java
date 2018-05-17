package dkmb.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dkmb.bean.RoncooUserLog;
import dkmb.dao.RoncooUserLogDao;

@Service
public class UserService {

	@Autowired
	private RoncooUserLogDao roncooUserDao;

	@Autowired
	private RoncooUserLogDao roncooUserLogDao;

	/**
	 * 用户注册
	 * 
	 * @return
	 */
	@Transactional
	public String register(String name, String ip) {
		// 1.添加用户
		RoncooUserLog roncooUser = new RoncooUserLog();
		roncooUser.setUserName(name);
		roncooUser.setCreateTime(new Date());
		roncooUser.setUserIp(ip);
		roncooUserDao.save(roncooUser);

		// 测试使用
		boolean flag = true;
		if (flag) {
			throw new RuntimeException();
		}

		// 2.添加注册日志
		RoncooUserLog roncooUserLog = new RoncooUserLog();
		roncooUserLog.setUserName(name);
		roncooUserLog.setUserIp(ip);
		roncooUserLog.setCreateTime(new Date());
		roncooUserLogDao.save(roncooUserLog);

		return "success";
	}

}
