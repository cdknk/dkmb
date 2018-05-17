package com.roncoo.example;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;

import dkmb.bean.RoncooUserLog;
import dkmb.dao.RoncooUserLogDao;

public class SpringBootDemo141ApplicationTests {

	@Autowired
	private RoncooUserLogDao roncooUserLogDao;

	public void insert() {
		RoncooUserLog entity = new RoncooUserLog();
		entity.setUserName("无境");
		entity.setUserIp("192.168.0.1");
		entity.setCreateTime(new Date());
		roncooUserLogDao.save(entity);
		System.out.println("数据插入成功！");
	}

	public void delete() {
		roncooUserLogDao.delete(1);
	}

	public void update() {
		RoncooUserLog entity = new RoncooUserLog();
		entity.setId(2);
		entity.setUserName("无境2");
		entity.setUserIp("192.168.0.1");
		entity.setCreateTime(new Date());
		roncooUserLogDao.save(entity);
	}

	public void select() {
		RoncooUserLog result = roncooUserLogDao.findOne(1);
		System.out.println(result);
	}

	public void select2() {
		List<RoncooUserLog> result = roncooUserLogDao.findByUserName("无境");
		System.out.println(result);
	}

	public void select3() {
		List<RoncooUserLog> result = roncooUserLogDao.findByUserNameAndUserIp("无境", "192.168.0.1");
		System.out.println(result);
	}

	public void queryForPage() {
		Pageable pageable = new PageRequest(0, 20, new Sort(new Order(Direction.DESC, "id")));
		Page<RoncooUserLog> result = roncooUserLogDao.findByUserName("无境", pageable);
		System.out.println(result.getContent());
	}

}
