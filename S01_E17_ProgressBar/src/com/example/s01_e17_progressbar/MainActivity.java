package com.example.s01_e17_progressbar;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends Activity {
	
	private ProgressBar progressBar;
	private Button button1;
	private Button button2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		progressBar =(ProgressBar)findViewById(R.id.progressBar2);
		progressBar.setMax(120);
		progressBar.setProgress(30);
		progressBar.setSecondaryProgress(50);
		boolean flag = progressBar.isIndeterminate();
		
		button1 = (Button)findViewById(R.id.button1);
		button2 = (Button)findViewById(R.id.button2);
		
		button1.setOnClickListener(new FirstListener());
		button2.setOnClickListener(new SecondListener());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	class FirstListener implements OnClickListener{

		@Override
		public void onClick(View v) {
			progressBar.incrementProgressBy(10);

		}
		
	}
	
	class SecondListener implements OnClickListener{

		@Override
		public void onClick(View v) {
			progressBar.incrementSecondaryProgressBy(20);

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
