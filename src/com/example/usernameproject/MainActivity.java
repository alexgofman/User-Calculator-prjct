package com.example.usernameproject;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	EditText userText;
	EditText passText;
	Button btnEnter;
	Button btnNewUser;
	String abc;
	String getName;
	String getPass;
	String newName;
	String newPass;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btnEnter=(Button)findViewById(R.id.enterBtn);
		btnNewUser=(Button)findViewById(R.id.newUserBtn);
		userText=(EditText)findViewById(R.id.userName);
		passText=(EditText)findViewById(R.id.userPass);
		
		Intent ob=getIntent();
		 newName=ob.getStringExtra("name");
		 newPass=ob.getStringExtra("pass");
		btnEnter.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
					getName=userText.getText().toString();
					getPass=passText.getText().toString();
				//	if(getName.equals(newName)&&getPass.equals(newPass))
				//	{
					Intent in=new Intent(MainActivity.this,CalculatorScreen.class);
					startActivity(in);
			//		}
		//			else
			//			Toast.makeText(getApplicationContext(),"Invalid username or password", Toast.LENGTH_LONG).show();
					//  toast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
			}
		});
		
		btnNewUser.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent in = new Intent(MainActivity.this, NewUserActivity.class);
				startActivity(in);
				
			}
		});
		
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
