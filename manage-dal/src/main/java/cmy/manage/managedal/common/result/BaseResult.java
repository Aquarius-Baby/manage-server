package cmy.manage.managedal.common.result;

import java.io.Serializable;

/**
 * @author: Aquarius
 * @time: 2023/2/11 09:01
 * @description:
 */
public class BaseResult<T> implements Serializable {
    private T module;
    private Boolean success = true;
    private String errorCode;
    private String errorMessage;


    public static <T> BaseResult<T> success(T t) {
        BaseResult result = new BaseResult();
        result.setSuccess(true);
        result.setModule(t);
        return result;
    }

    public static <T> BaseResult<T> error(String errorCode, String errorMessage) {
        BaseResult result = new BaseResult();
        result.setSuccess(false);
        result.setErrorCode(errorCode);
        result.setErrorMessage(errorMessage);
        return result;
    }


    public T getModule() {
        return module;
    }

    public void setModule(T module) {
        this.module = module;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
