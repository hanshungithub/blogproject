package cn.hassan.blog.common.exception;

/**
 * Created with idea
 * Author: hss
 * Date: 11/14/2018 4:32 PM
 * Description:
 */
public class BOException extends BaseRuntimeException {

	/**
	 *
	 * BOExceptionEnum构造业务层异常
	 *
	 */
	public BOException(BOExceptionEnum en) {
		super(en.errorCode(), en.errorMsg());
	}


	public BOException(String errorMsg) {
		super("", errorMsg);
	}

	/**
	 *
	 * 构造函数
	 *
	 * @param errorCode 错误码
	 * @param errorMsg 错误信息
	 */
	//@Deprecated
	public BOException(String errorCode, String errorMsg) {
		super(errorCode, errorMsg);
	}

	/**
	 * 抛出BOException异常
	 * @param en  常枚举
	 *
	 */
	public static void throwz(BOExceptionEnum en) {
		throw new BOException(en);
	}

}
