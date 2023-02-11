package cmy.manage.managedal.common.result;

import java.io.Serializable;

/**
 * @author: Aquarius
 * @time: 2023/2/11 09:01
 * @description:
 */
public class TableResult<T> implements Serializable {
    private Boolean success = true;
    private String errorCode;
    private String errorMessage;

    private Integer currentPage;
    private Integer totalRecords;
    private T dataSource;

    public static <T> TableResult<T> success(T t, Integer totalRecords, Integer currentPage) {
        TableResult result = new TableResult();
        result.setSuccess(true);
        result.setDataSource(t);
        result.setTotalRecords(totalRecords);
        result.setCurrentPage(currentPage);
        return result;
    }

    public static <T> TableResult<T> error(String errorCode, String errorMessage) {
        TableResult result = new TableResult();
        result.setSuccess(false);
        result.setErrorCode(errorCode);
        result.setErrorMessage(errorMessage);
        return result;
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

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(Integer totalRecords) {
        this.totalRecords = totalRecords;
    }

    public T getDataSource() {
        return dataSource;
    }

    public void setDataSource(T dataSource) {
        this.dataSource = dataSource;
    }
}
