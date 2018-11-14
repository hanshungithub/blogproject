package cn.hassan.blog.common.exception.global;

import cn.hassan.blog.common.exception.BOException;
import cn.hassan.blog.common.response.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with idea
 * Author: hss
 * Date: 11/14/2018 4:40 PM
 * Description: 全局异常处理
 */
@ControllerAdvice
@Slf4j
@Component
public class GlobalExceptionHandler {

	@ExceptionHandler(value = BOException.class)
	@ResponseBody
	public Response hande(RuntimeException exception) {
		if (exception instanceof BOException) {
			return Response.error(((BOException) exception).getErrorCode(), ((BOException) exception).getErrorMsg());
		}else {
			log.error("全局异常 ---> {}", exception.getMessage());
			return Response.error("-1", "异常异常");
		}
	}
}
