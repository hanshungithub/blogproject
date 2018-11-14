package cn.hassan.blog.common.response;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created with idea
 * Author: hss
 * Date: 11/14/2018 4:41 PM
 * Description: 返回响应实体
 */
@Getter
@Setter
public class Response implements Serializable {
	/**
	 * 返回结果集
	 */
	private Object result;
	/**
	 * 返回错误消息
	 */
	private String errorMsg;
	/**
	 * 返回错误响应码
	 */
	private String errorCode;
	/**
	 * 响应码
	 */
	private Integer code;

	public static Response error(String errorCode, String errorMsg) {
		Response response = new Response();
		response.setCode(ResponseCode.FAILED);
		response.setErrorCode(errorCode);
		response.setErrorMsg(errorMsg);
		return response;
	}

	public static Response success(Object result) {
		Response response = new Response();
		response.setCode(ResponseCode.SUCCESS);
		response.setResult(result);
		return response;
	}
}
