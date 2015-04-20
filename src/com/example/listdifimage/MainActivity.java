package com.example.listdifimage;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
public class MainActivity extends Activity {
	ListView list;
	String[] fruits = {
			"Banana",
			"Guva",
			"Strawberry",
			"Peach",
			"Water Millon",
			"Mango",
			"gree apple"
	} ;
	Integer[] imageId = {
			R.drawable.banana,
			R.drawable.guva,
			R.drawable.straw,
			R.drawable.peach,
			R.drawable.watr,
			R.drawable.mango,
			R.drawable.grr
	};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		CustomList adapter = new
				CustomList(MainActivity.this, fruits, imageId);
		list=(ListView)findViewById(R.id.list);
		list.setAdapter(adapter);
		list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Toast.makeText(MainActivity.this, "You Clicked at " +fruits[+ position], Toast.LENGTH_SHORT).show();
			}
		});
	}
}
