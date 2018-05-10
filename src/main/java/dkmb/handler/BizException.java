package dkmb.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import dkmb.controller.WebController;



/**
 * 异常处理
 * @author Administrator
 *
 */
@ControllerAdvice
public class BizException {
	private final Logger logger=LoggerFactory.getLogger(WebController.class);
	/**
	 * 统一异常处理
	 * @author Administrator
	 *
	 */
	@ExceptionHandler({RuntimeException.class})
	@ResponseStatus(HttpStatus.OK)
	public ModelAndView processException(RuntimeException exception){
		logger.info("自定义异常处理-RuntimeException");
		ModelAndView m=new ModelAndView();
		m.addObject("roncooException", exception.getMessage());
		m.setViewName("error/500");
		return m;
	}
	
	@ExceptionHandler({Exception.class})
	@ResponseStatus(HttpStatus.OK)
	public ModelAndView processException(Exception exception){
		logger.info("自定义异常处理-RuntimeException");
		ModelAndView m=new ModelAndView();
		m.addObject("roncooException", exception.getMessage());
		m.setViewName("error/500");
		return m;
	}
}
