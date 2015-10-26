package com.example.usernameproject;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class NewUserActivity extends Activity {
	EditText userTextSaved;
	EditText passTextSaved;
	Button btnSave;	
	String newName;
	String newPass;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.newuser);
		
		btnSave=(Button)findViewById(R.id.btnSave);
		userTextSaved=(EditText)findViewById(R.id.secondUser);
		passTextSaved=(EditText)findViewById(R.id.secondPass);
		
		btnSave.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				newName=userTextSaved.getText().toString();
				newPass=passTextSaved.getText().toString();
				Intent in=new Intent(NewUserActivity.this,MainActivity.class);
				in.putExtra("name", newName);
				in.putExtra("pass", newPass);
				startActivity(in);
				
			}
		});
			
		
		
		
		
		
		
	}
}
