package app.coolweather.com.util;

/**
 * Created by ldc.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
