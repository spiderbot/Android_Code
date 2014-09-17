package com.example.firstclass;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	EditText txt1,txt2;
	Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nextlayout);
        
        txt1=(EditText) findViewById(R.id.ed1);
        txt2=(EditText) findViewById(R.id.ed2);        
        btn=(Button) findViewById(R.id.bt);
        
        
        btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
			//	btn.setBackgroundColor(Color.CYAN);
				int num1=Integer.parseInt(txt1.getText().toString());
				int num2=Integer.parseInt(txt2.getText().toString());		
				int sum=num1+num2;
				
				btn.setText(""+sum);
				
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
