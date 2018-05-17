package dkmb.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dkmb.bean.User;

@RestController
public class IndexController {
	
	@Value("${random.value}")
	private String secret;
	@Value("${random.int}")
	private int number;
	@Value("${roncoo.desc}")
	private String desc;

	@RequestMapping("/home")
	public String home() {
		return "人生得意须尽欢";
	}

	@RequestMapping("get")
	public String indexGet(@RequestParam String name) {
		return "大家好，我是" + name;
	}
	
	@RequestMapping("gets")
	public Map<String, Object> indexGets() {
		Map<String, Object>map=new HashMap<String, Object>();
		map.put("secret", secret);
		map.put("number", number);
		map.put("desc", desc);
		map.put("name", "上网饿肚肚和啊呜的哈U盾发 熊");
		return map;
	}
	
	@RequestMapping("get/{id}/{name}")
	public User get(@PathVariable int id,@PathVariable String name) {
		User user=new User();
		user.setId(id);
		user.setName(name);
		user.setDate(new Date());
		return user;
	}
}
