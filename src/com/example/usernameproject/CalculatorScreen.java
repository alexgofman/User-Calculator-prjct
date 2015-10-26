package com.example.usernameproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CalculatorScreen extends Activity implements View.OnClickListener {
	
	EditText calcField;
	Button btn0;
	Button btn1;
	Button btn2;
	Button btn3;
	Button btn4;
	Button btn5;
	Button btn6;
	Button btn7;
	Button btn8;
	Button btn9;
	Button btnDot;
	Button btnEqual;
	Button btnPerc;
	Button btnMinus;
	Button btnPlus;
	Button btnMult;
	Button btnDiv;
	Button btnClr;
	String equation="";
	String firstpart="",secondpart="";
	float result=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.calculator);
		
		calcField=(EditText)findViewById(R.id.calcField);
		btn0=(Button)findViewById(R.id.Button0);
		btn1=(Button)findViewById(R.id.Button1);
		btn2=(Button)findViewById(R.id.button2);
		btn3=(Button)findViewById(R.id.Button3);
		btn4=(Button)findViewById(R.id.button4);
		btn5=(Button)findViewById(R.id.Button5);
		btn6=(Button)findViewById(R.id.Button6);
		btn7=(Button)findViewById(R.id.button7);
		btn8=(Button)findViewById(R.id.Button8);
		btn9=(Button)findViewById(R.id.Button9);
		btnDot=(Button)findViewById(R.id.ButtonDot);
		btnEqual=(Button)findViewById(R.id.ButtonEqual);
		btnPerc=(Button)findViewById(R.id.ButtonPerc);
		btnMinus=(Button)findViewById(R.id.ButtonMinus);
		btnPlus=(Button)findViewById(R.id.buttonPlus);
		btnMult=(Button)findViewById(R.id.buttonMult);
		btnDiv=(Button)findViewById(R.id.ButtonDiv);
		btnClr=(Button)findViewById(R.id.buttonClear);
		calcField.setText("0");
		btn0.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(!equation.equals("0"))//equal function will return the true or false on the basis of if it finds the particular value
				{				
					equation+="0";
					calcField.setText(equation);
				}
			}
		});
		
		btn1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				equation+="1";
				calcField.setText(equation);
			
			}
		});
		
		btn2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				equation+="2";
				calcField.setText(equation);
			
			}
		});
		
		btn3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				equation+="3";
				calcField.setText(equation);
			
			}
		});
		
		btn4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				equation+="4";
				calcField.setText(equation);
			
			}
		});
		
		btn5.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				equation+="5";
				calcField.setText(equation);
			
			}
		});
		
		btn6.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				equation+="6";
				calcField.setText(equation);
			
			}
		});
		
		btn7.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				equation+="7";
				calcField.setText(equation);
			
			}
		});
		
		btn8.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				equation+="8";
				calcField.setText(equation);
			
			}
		});
		
		btn9.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				equation+="9";
				calcField.setText(equation);
			
			}
		});
		
		btnDot.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
			//	int in=equation.lastIndexOf(".");//returns the last occurrence of the . in the string
			//	Toast.makeText(getApplicationContext(), in+ " " + equation.length(), Toast.LENGTH_LONG).show();
		//	int in=equation.length();
			
				if(!equation.endsWith("."))
				{				
					equation+=".";
					calcField.setText(equation);
				}
			}
		});
		
		btnEqual.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				if(equation.contains("+")) { //checks if the string contains "+"
				String[] split=equation.split("\\+");//splitting the array on the basis of passed value
			
				firstpart=split[0];
				secondpart=split[1];
				result=Float.parseFloat(firstpart) + Float.parseFloat(secondpart);//converting the vlaue of the string to float and adding up
				
				
				equation="";
				calcField.setText(String.valueOf(result));
				} else if (equation.contains("-")) {
					String[] split=equation.split("\\-");
					
					firstpart=split[0];
					secondpart=split[1];
					result=Float.parseFloat(firstpart) - Float.parseFloat(secondpart);//adding up the first and the second part
					
					equation="";
					calcField.setText(String.valueOf(result));
				} else if (equation.contains("*")) {
					String[] split=equation.split("\\*");
					
					firstpart=split[0];
					secondpart=split[1];
					result=Float.parseFloat(firstpart) * Float.parseFloat(secondpart);//adding up the first and the second part
					
					equation="";
					calcField.setText(String.valueOf(result));
				} else if (equation.contains("/")) {
					String[] split=equation.split("\\/");
					
					firstpart=split[0];
					secondpart=split[1];
					result=Float.parseFloat(firstpart) / Float.parseFloat(secondpart);//adding up the first and the second part
					
					equation="";
					calcField.setText(String.valueOf(result));
				} 
				
			}
		});
		
		btnPerc.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				equation+="%";
				calcField.setText(equation);
			}
		});
		
		btnMinus.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				if(!equation.endsWith("-"))
				{				
					equation+="-";
					calcField.setText(equation);
				}	
			}
		});
		
		btnPlus.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(!equation.endsWith("+"))
				{				
					equation+="+";
					calcField.setText(equation);
				}
			}
		});
		
		btnMult.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(!equation.endsWith("*"))
				{				
					equation+="*";
					calcField.setText(equation);
				}	
			}
		});
		
		btnDiv.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(!equation.endsWith("/"))
				{				
					equation+="/";
					calcField.setText(equation);
				}
			}
		});
		
		btnClr.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				equation="";
				calcField.setText("0");
			}
		});
		
		
		
		
		
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Toast.makeText(getApplicationContext(), "hi", Toast.LENGTH_LONG).show();
	}
}
