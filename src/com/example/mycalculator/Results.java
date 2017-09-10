package com.example.mycalculator;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class Results extends Activity {
	
	TextView Result;
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_results);
		btnCast();
	}
	
	public void btnCast()
    {
    	// = (TextView) findViewById(R.id.display);
    	
    	Result = (TextView) findViewById(R.id.display2);
    	readResult();
    }
	
	public void readResult()
	 {
		 try
		 {
			 FileInputStream fileInputStream = openFileInput("result.txt");
			 InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
			 BufferedReader reader = new BufferedReader(inputStreamReader);
			 String data;
			 
			 
				 while((data = reader.readLine())!=null)
				 {
				 //resultTxt.setText("");
				 Result.append(data);
				 }
				 
				 fileInputStream.close();
			 
		 }
		 catch(FileNotFoundException e)
		 {
			 Result.setText("No Data");
		 }
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
}
