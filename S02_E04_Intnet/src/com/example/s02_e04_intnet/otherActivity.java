package com.example.s02_e04_intnet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class otherActivity extends Activity {
	
	private TextView textView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.other);
		Intent intent = getIntent();
		int age = intent.getIntExtra("com.example.s02_e04_intnet.age", 10);
		String name = intent.getStringExtra("com.example.s02_e04_intnet.name");
		textView = (TextView)findViewById(R.id.textView1);
		textView.setText(name + ":" + age );
	}

}
