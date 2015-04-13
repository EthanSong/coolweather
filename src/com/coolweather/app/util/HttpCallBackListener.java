package com.coolweather.app.util;

public interface HttpCallBackListener {
	void onFinished(String response);
	void onError(Exception e);
}
