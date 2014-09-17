package com.example.listactivitydemo;

import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

	String [] name={"A","B","C","D","E"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       
        setListAdapter(new ArrayAdapter<String>(MainActivity.this,
        		R.layout.row,R.id.textView1,
        		name));
    }
    
    
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		Toast.makeText(MainActivity.this, name[position],Toast.LENGTH_SHORT).show();
		super.onListItemClick(l, v, position, id);
	}

    
    
}
