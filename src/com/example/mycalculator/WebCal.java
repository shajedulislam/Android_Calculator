package com.example.mycalculator;



import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class WebCal extends Activity {

	
	WebView webview;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_web_cal);
		
		
		
		/*webview=(WebView)findViewById(R.id.webView1);
        webview.getSettings().setBuiltInZoomControls(true);
        WebSettings settings=webview.getSettings();
        settings.setJavaScriptEnabled(true);
        //webview.addJavascriptInterface(new WebViewInterface(this), "Android");
        
        webview.loadUrl("file:///android_asset/index.html");*/
		
		WebView view = new WebView(this);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl("file:///android_asset/index.html");
        view.setBackgroundColor(Color.TRANSPARENT);
        setContentView(view);
	}
}
