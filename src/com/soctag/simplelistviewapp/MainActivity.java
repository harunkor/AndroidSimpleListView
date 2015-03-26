package com.soctag.simplelistviewapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		String [] dizi = new String[]{"Elma","Armut","Kiraz","Çilek","Portakal","Muz","Kayısı","Şeftali"};
		 ListView lv = (ListView)findViewById(R.id.listView1);
	        lv.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,dizi));
	        
	        
	    lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				 ListView lv = (ListView) parent;
				 TextView tvItem = (TextView) lv.getChildAt(position);
				Toast.makeText(getApplicationContext(), "Tıklanan  "+tvItem.getText().toString(), Toast.LENGTH_LONG).show();
			}
		});
	        
	        
	        
	}
}
