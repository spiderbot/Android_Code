package com.example.radiobuttondemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class MainActivity extends Activity {

	RadioGroup rg;
	RadioButton rbtn1,rbtn2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		rg=(RadioGroup) findViewById(R.id.group);
		rbtn1=(RadioButton) findViewById(R.id.btn1);
		rbtn2=(RadioButton) findViewById(R.id.btn2);

		rg.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup r, int id) {
				// TODO Auto-generated method stub

				switch (id) {
				case R.id.btn1:
					Toast.makeText(MainActivity.this,"Male", Toast.LENGTH_SHORT).show();
					break;

				case R.id.btn2:
					Toast.makeText(MainActivity.this,"FeMale", Toast.LENGTH_SHORT).show();
					break;
				}
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
