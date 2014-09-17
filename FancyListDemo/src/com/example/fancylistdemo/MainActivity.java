package com.example.fancylistdemo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {

	ListView list;
	String [] name={"A","B","C","D","E"};
	String []number={"1","2","3","4","5"};
	
	//int [] img={R.drawable.ic_launcher,......};
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=(ListView) findViewById(R.id.list);
        
        MyAdapter adapter=new MyAdapter(MainActivity.this, R.layout.row,name);
        list.setAdapter(adapter);
        
    }

   
    
    class MyAdapter extends ArrayAdapter<String>
    {

		public MyAdapter(Context context, int resource, String[] objects) {
			super(context, resource, objects);
			// TODO Auto-generated constructor stub
		}
    	
		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			
			LayoutInflater li=getLayoutInflater();
			View row=li.inflate(R.layout.row,null);
			
			TextView txt1=(TextView) row.findViewById(R.id.txt1);
			TextView txt2=(TextView) row.findViewById(R.id.txt2);
			
			txt1.setText(name[position]);
			txt2.setText(number[position]);
			
			
			
			return row ;
		}
    	
    }
}
