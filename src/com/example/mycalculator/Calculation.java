package com.example.mycalculator;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculation extends Activity implements View.OnClickListener
{
	
	Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnadd,btnmin,
	btndiv,btnmult,btneql,btnclr,btnms,btnmr,btnallclr,btndot,btnans;
     
	 TextView Result;
	 int FirstVal,SecondVal,Res;
	 char op=' ';
	 SharedPreferences sP;
	
	Button lnc;
	


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calculation);
		
		btnCast();
		

        lnc.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn0.setOnClickListener(this);
        btnclr.setOnClickListener(this);
        btndiv.setOnClickListener(this);
        btnmult.setOnClickListener(this);
        btnadd.setOnClickListener(this);
        btnmin.setOnClickListener(this);
        btneql.setOnClickListener(this);
        btnms.setOnClickListener(this);
        //btnmR.setOnClickListener(this);
        btnmr.setOnClickListener(this);
        btnallclr.setOnClickListener(this);
        btndot.setOnClickListener(this);
        btnans.setOnClickListener(this);
	}
	public void btnCast()
    {
    	// = (TextView) findViewById(R.id.display);
    	lnc= (Button) findViewById(R.id.BtnMr);
    	Result = (TextView) findViewById(R.id.display);
    	btn1= (Button) findViewById(R.id.Btn1);
    	btn2= (Button) findViewById(R.id.Btn2);
    	btn3= (Button) findViewById(R.id.Btn3);
    	btn4= (Button) findViewById(R.id.Btn4);
    	btn5= (Button) findViewById(R.id.Btn5);
    	btn6= (Button) findViewById(R.id.Btn6);
    	btn7= (Button) findViewById(R.id.Btn7);
    	btn8= (Button) findViewById(R.id.Btn8);
    	btn9= (Button) findViewById(R.id.Btn9);
    	btn0= (Button) findViewById(R.id.btn0);
    	btnclr= (Button) findViewById(R.id.Btnclear);
    	btnmult= (Button) findViewById(R.id.Btnmult);
    	btnadd= (Button) findViewById(R.id.btnplus);
    	btndiv= (Button) findViewById(R.id.Btndiv);
    	btnmin= (Button) findViewById(R.id.Btnminus);
    	btneql=(Button) findViewById(R.id.Btnequal);
    	btnms=(Button) findViewById(R.id.BtnMs);
    	btnallclr=(Button) findViewById(R.id.Btnallclear);
    	btnmr=(Button) findViewById(R.id.BtnMr);
    	btnans= (Button) findViewById(R.id.Btnans);
    	btndot= (Button) findViewById(R.id.Btndot);
    }
	public void saveResult()
	 {
		 try
		 {
			 FileOutputStream fileOutputStream = openFileOutput("result.txt",MODE_PRIVATE);
			 fileOutputStream.write(Result.getText().toString().getBytes());
			 fileOutputStream.close();
		 }
		 catch(FileNotFoundException e)
		 {
			 
		 } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
	
	@Override
	public void onClick(View v) 
	{
		if(v.getId()==R.id.BtnMr)
		{			
			
			Intent intent = new Intent(Calculation.this, Results.class);
			
			startActivity(intent);
		}
		else if(v.getId()==R.id.Btn1)
		{			
			Result.setText(Result.getText()+"1");
			//Result.setText("1");
		}
		else if(v.getId()==R.id.Btn2)
		{
			Result.setText(Result.getText()+"2");
		}
		else if(v.getId()==R.id.Btn3)
		{
			Result.setText(Result.getText()+"3");
		}
		else if(v.getId()==R.id.Btn4)
		{
			Result.setText(Result.getText()+"4");
		}
		else if(v.getId()==R.id.Btn5)
		{
			Result.setText(Result.getText()+"5");
		}
		else if(v.getId()==R.id.Btn6)
		{
			Result.setText(Result.getText()+"6");
		}
		else if(v.getId()==R.id.Btn7)
		{
			Result.setText(Result.getText()+"7");
		}
		else if(v.getId()==R.id.Btn8)
		{
			Result.setText(Result.getText()+"8");
		}
		else if(v.getId()==R.id.Btn9)
		{
			Result.setText(Result.getText()+"9");
		}
		else if(v.getId()==R.id.btn0)
		{
			Result.setText(Result.getText()+"0");
		}
		else if(v.getId()==R.id.Btnallclear)
		{
			Result.setText("");
			FirstVal=0;
			SecondVal=0;
			
		}
		else if(v.getId()==R.id.Btnclear)
		{
			Result.setText("");
			
		}
		
		else if(v.getId()==R.id.Btnminus)
		{
			FirstVal=Integer.parseInt(Result.getText().toString());
			op='-';
			Result.setText("");
		}
		else if(v.getId()==R.id.btnplus)
		{
			
		
				FirstVal=Integer.parseInt(Result.getText().toString());
				op='+';
				Result.setText("");
			
		
			
		}
		else if(v.getId()==R.id.Btnmult)
		{
			FirstVal=Integer.parseInt(Result.getText().toString());
			op='*';
			Result.setText("");
		}
		else if(v.getId()==R.id.Btndiv)
		{
			FirstVal=Integer.parseInt(Result.getText().toString());
			op='/';
			Result.setText("");
		}
		else if(v.getId()==R.id.Btnequal)
		{
			if(op==' ')
			{
				Result.setText("");
			}
			else
			{
				SecondVal=Integer.parseInt(Result.getText().toString());
				switch(op)
				{
				case '+':
					Res=FirstVal+SecondVal;
					Result.setText(Res+"");
					op=' ';
					
					
					
					break;
				case '-':
					Res=FirstVal-SecondVal;
					Result.setText(Res+"");
					op=' ';
					break;
				case '*':
					Res=FirstVal*SecondVal;
					Result.setText(Res+"");
					op=' ';
					break;
				case '/':
					Res=FirstVal/SecondVal;
					Result.setText(Res+"");
					op=' ';
					
					break;	
			
				}
				saveResult();
				/*SharedPreferences.Editor edit = sP.edit();
				
				edit.putInt("ANS", Res);
				edit.apply();*/
				
			}
			
		}
			
		else if(v.getId()==R.id.BtnMs)
		{
			saveResult();
			Result.setText("");
		}
		else if(v.getId()==R.id.Btnans)
		{
			readResult();
			//Result.setText("");
		}
		
		
		


	}
}
