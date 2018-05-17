package dkmb.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dkmb.bean.RoncooUserLog;
import dkmb.dao.RoncooUserLogDao;
import dkmb.service.UserService;

@RestController
@RequestMapping("user")
public class RoncooUserLogController {
	@Autowired
	private RoncooUserLogDao roncooUserLogDao;
	@Autowired
	private UserService userService;

	@RequestMapping("insert")
	public RoncooUserLog insert() {
		RoncooUserLog entity = new RoncooUserLog();
		entity.setUserName("无境");
		entity.setUserIp("192.168.0.1");
		entity.setCreateTime(new Date());
		System.out.println("数据插入成功！");
		return roncooUserLogDao.save(entity);
	}
	
	@RequestMapping("delete")
	public String delete() {
		roncooUserLogDao.delete(1);
		return "删除成功";
	}
	
	@RequestMapping("update")
	public RoncooUserLog update() {
		RoncooUserLog entity = new RoncooUserLog();
		entity.setId(2);
		entity.setUserName("无境2");
		entity.setUserIp("192.168.0.1");
		entity.setCreateTime(new Date());
		return roncooUserLogDao.save(entity);
	}
	
	@RequestMapping("select")
	public List<RoncooUserLog> select() {
		return roncooUserLogDao.findAll();
	}
	
	@RequestMapping("select1")
	public RoncooUserLog select1() {
		return roncooUserLogDao.findOne(1);
	}
	@RequestMapping("select2")
	public List<RoncooUserLog> select2() {
		return roncooUserLogDao.findByUserName("无境");
	}
	@RequestMapping("select3")
	public List<RoncooUserLog> select3() {
		return roncooUserLogDao.findByUserNameAndUserIp("无境", "192.168.0.1");
	}
	@RequestMapping("queryForPage")
	public Page<RoncooUserLog> queryForPage() {
		Pageable pageable = new PageRequest(0, 20, new Sort(new Order(Direction.DESC, "id")));
		return roncooUserLogDao.findByUserName("无境", pageable);
	}
	
	@RequestMapping("register")
	public String register() {
		String result = userService.register("苟富贵ff", "192.168.1.1");
		return result;
	}

	
}
