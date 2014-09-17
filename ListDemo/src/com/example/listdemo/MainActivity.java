package com.example.listdemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

	ListView list;
	String [] name={"A","B","C","D","E","F","G","H"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        list=(ListView) findViewById(R.id.mylist);
        
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this,         		
        		 android.R.layout.simple_list_item_1 , 
        		name);
        
        list.setAdapter(adapter);
        
        list.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> adap, View v, int position,
					long arg3) {
				
				Toast.makeText(MainActivity.this,"you have selected :" +name[position] , Toast.LENGTH_SHORT).show();
				
				
			}
		});
        
    }

}
