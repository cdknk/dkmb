package dkmb.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("web")
public class WebController {
	
	private final Logger logger=LoggerFactory.getLogger(WebController.class);
	
	@RequestMapping("index")
	public String index(ModelMap map){
		logger.info("这里是首页controller");
		map.put("title", "還有什麼能夠阻擋");
		return "index";
	}
	
	@RequestMapping("error")
	public String erro(ModelMap map){
		throw new RuntimeException("测试异常");
	}
}
