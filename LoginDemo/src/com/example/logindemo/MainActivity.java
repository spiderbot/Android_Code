package com.example.logindemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	Button btn;
	EditText ed1,ed2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button) findViewById(R.id.login);
        ed1=(EditText) findViewById(R.id.user);
        ed2=(EditText) findViewById(R.id.pass);
        
        
        btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				String str1=ed1.getText().toString().trim();
				String str2=ed2.getText().toString().trim();
				if(!str1.equals("") || !str2.equals(""))
				{
				
				if(str1.equals("admin")&& str2.equals("admin"))
				{
					
					Toast.makeText(MainActivity.this,"Login done" ,Toast.LENGTH_SHORT).show();
				}
				else {
					Toast.makeText(MainActivity.this,"Invalid UserName & Password" ,Toast.LENGTH_SHORT).show();
				}
				
				}
				else {
					Toast.makeText(MainActivity.this,"! Please Enter the some value " ,Toast.LENGTH_SHORT).show();
					
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
