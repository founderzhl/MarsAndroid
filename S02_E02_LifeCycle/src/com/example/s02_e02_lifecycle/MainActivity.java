package com.example.s02_e02_lifecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	private Button button;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		System.out.println("MainActivity:onCreate");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button = (Button)findViewById(R.id.button1);
		button.setOnClickListener(new buttonListener());

			}
	
	protected void onDestory(){
		System.out.println("MainActivity:onDestory");
		super.onDestroy();
	}
		
	protected void onStart(){
		System.out.println("MainActivity:onstart");
		super.onStart();
	}
		
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		System.out.println("MainActivity:onResume");

		super.onResume();
	}


	protected void onPause(){
		System.out.println("MainActivity:onPause");
		super.onPause();
		
	}
	
	protected void onRestart(){
		System.out.println("MainActivity:onRestart");
		super.onRestart();
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		System.out.println("MainActivity:onStop");
		super.onStop();
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	class buttonListener implements OnClickListener{

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, otherActivity.class );
			startActivity(intent);
		}
		
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
