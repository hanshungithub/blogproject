package cn.hassan.blog.common.exception;

/**
 * Created with idea
 * Author: hss
 * Date: 11/14/2018 4:29 PM
 * Description:
 */
public class BaseRuntimeException extends RuntimeException {

	/**
	 * 错误码
	 */
	private String errorCode;

	@Deprecated
	public BaseRuntimeException() {
		super();
	}

	/**
	 *
	 * 构造函数
	 *
	 * @param errorCode 错误码
	 * @param errorMsg 错误信息
	 *
	 */
	public BaseRuntimeException(String errorCode, String errorMsg) {
		super(errorMsg);
		this.errorCode = errorCode;
	}

	/**
	 * 取错误码
	 */
	public String getErrorCode() {
		return errorCode;
	}

	/**
	 * 取错误信息
	 */
	public String getErrorMsg() {
		return getMessage();
	}
}
