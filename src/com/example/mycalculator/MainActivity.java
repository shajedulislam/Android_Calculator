package com.example.mycalculator;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;



import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener 
{
	Button lnc;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		btnCast();
		lnc.setOnClickListener(this);
		
       
	}
	
	

	
	
	
	public void btnCast()
    {
    	// = (TextView) findViewById(R.id.display);
    	lnc = (Button) findViewById(R.id.launch);
    	
    }
	
	public boolean checkInternetConnection() {
        final ConnectivityManager conMgr = (ConnectivityManager) getSystemService (Context.CONNECTIVITY_SERVICE);
        if (conMgr.getActiveNetworkInfo() != null && conMgr.getActiveNetworkInfo().isAvailable() &&    conMgr.getActiveNetworkInfo().isConnected()) {
              return true;
        } else {
            //  System.out.println("Internet Connection Not Present");
            return false;
        }
     }
	
	
	
	@Override
	public void onClick(View v) 
	{
		if(v.getId()==R.id.launch)
		{	
			boolean b = checkInternetConnection();
	        
	        if(b==true)
	        {
				
				Intent intent = new Intent(MainActivity.this, WebCal.class);
				
				startActivity(intent);
	        
	        }
	        
	        else
	        {
	        	
	        	Intent intent = new Intent(MainActivity.this, Calculation.class);
				
				startActivity(intent);
	        	
	        
	        }			
			
	        
			
			
		}
		
		
		
		
	}
}
