package com.example.hello.activity;

import com.example.hello.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class BaiduActivity extends Activity{
	WebView webView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.baidu);
		
		webView = (WebView) findViewById(R.id.baidu);
		String url = "http://www.baidu.com/";
		//此方法可以在webview中打开链接而不会跳转到外部浏览器
		webView.setWebViewClient(new WebViewClient());
		webView.loadUrl(url);
		System.out.println("end: " + url);
		
	}
	
	@Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {    
        //重写onKeyDown，当浏览网页，WebView可以后退时执行后退操作。
        if(keyCode == KeyEvent.KEYCODE_BACK && webView.canGoBack()){
            webView.goBack();
            return true;
        } 
        return super.onKeyDown(keyCode, event);
    }
	

}
