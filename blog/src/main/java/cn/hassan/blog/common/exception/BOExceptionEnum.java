package cn.hassan.blog.common.exception;

/**
 * Created with idea
 * Author: hss
 * Date: 11/14/2018 4:29 PM
 * Description: BoException的错误码和错误信息枚举
 */
public enum BOExceptionEnum {
	
	//--------------------------------------------------  基础 -----------------------------------------------------//
	SYS_ERROR						("-10",  "系统异常，请稍候再试"),
	INF_ERROR						("-11",  "接口异常或私有云服务端版本过低"),
	PARAM_MISS						("-12",  "缺少参数")
    ;

	/**
	 * 错误码
	 */
	private String errorCode;
	
	/**
	 * 错误信息
	 */
	private String errorMsg;
	
	BOExceptionEnum(String errorCode, String errorMsg){
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}
	
	public String errorCode(){
		return errorCode;
	}
	
	public String errorMsg(){
		return errorMsg;
	}
}
