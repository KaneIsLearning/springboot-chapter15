package cn.kane.springboot04.shopping.commons;

/**
 * 〈一句话功能简述〉<br>
 * 〈ss〉
 *
 * @author Kane
 * Date:   2019/6/6 10:31
 * @since 1.0.0
 */
public class Result {
    private boolean success = false;
    private String message = null;

    public Result(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public Result() {
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}